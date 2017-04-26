package company.interview.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class ForMap implements Comparator<Double>
{
	Map<Inventory,Double> map;
	public ForMap(Map<Inventory,Double> map) {
		this.map = map;
	}
	
	@Override
	public int compare(Double o1, Double o2) {
		/*if(o1.getQuantity() > o2.getQuantity())
			return 1;
		else if(o1.getQuantity() < o2.getQuantity())
			return -1;
		else
		{
			if(o1.getID() > o2.getID())
				return 1;
			else if(o2.getID() < o2.getID())
				return -1;
			else
				return 0;
		}*/
		
		return o1.compareTo(o2);
		
	}
	
}

public class MileStone1 {

List<OrderEntry> entries = new ArrayList<>();

public MileStone1() {
	entries = OrderEntry.populate();
	
}
	
public Map<Inventory,Double> milestone1(Integer productId)
 {
	 ProductInventory inventory = new ProductInventory();
	 Map<Inventory, Double> map = new HashMap<>();
	 map = inventory.search(productId);
	 return map;
 }
public void milestone2(List<OrderEntry> entries )
{
	Collections.sort(entries,new MyOrderEntry());
	Map<Integer, Map<Inventory,Double> > map = new HashMap<Integer, Map<Inventory,Double>>();
	Map<Integer, Map<Inventory,Double> > map1 = new HashMap<Integer, Map<Inventory,Double>>();
	
	for(int i=1;i<=12;i++)
	{
		ProductInventory inventory = new ProductInventory();
		Map<Inventory, Double> tempmap = new HashMap<>();
		tempmap = inventory.search(i);
		map.put(i, tempmap);
	}
	
	for (OrderEntry orderEntry : entries) {
		for (OrderProduct product : orderEntry.getProductID()) {
			ProductInventory inventory = new ProductInventory();
			Map<Inventory, Double> tempmap = new HashMap<>();
			tempmap = inventory.search(product.productID);
			//
			/*Map<Inventory,Double> map2 = new TreeMap<Inventory,Double>(new ForMap());
			map2.putAll(tempmap);
			*/
			Map<Inventory, Double> map2 = sortByValue(tempmap);
			
			//
			
			map1.put(product.productID, map2);
		}
	}
	
	
	for (Integer integer : map.keySet()) {
		System.out.println("Product ID "+integer);
		Map<Inventory,Double> map2 = new HashMap<Inventory, Double>();
		map2 = map.get(integer);
		for (Inventory string : map2.keySet()) {
			System.out.println("id is "+string.getID()+" quantity is "+string.getQuantity()+" shipping is "+map2.get(string));
		}
	}
	
	System.out.println();
	System.out.println("Contained Products");

	for (Integer integer : map1.keySet()) {
		System.out.println("Product ID "+integer);
		Map<Inventory,Double> map2 = new HashMap<Inventory, Double>();
		map2 = map1.get(integer);
		for (Inventory string : map2.keySet()) {
			System.out.println("id is "+string.getID()+" quantity is "+string.getQuantity()+" shipping is "+map2.get(string));
		}
	}
		System.out.println();
	for (OrderEntry orderEntry : entries) {
		System.out.println("order ID: "+orderEntry.getOrderID());
		for (OrderProduct orderProduct : orderEntry.getProductID()) {
			System.out.println("product: "+orderProduct.productID+" :Q: "+orderProduct.getQuantity());
		}
		}
	
	//solution from here
	Map<Integer,Integer> temp = new HashMap<>();
	for (OrderEntry orderEntry : entries) {
		for (OrderProduct products : orderEntry.getProductID()) {
			if(temp.containsKey(products.productID))
			{
				Integer Quantity = temp.get(products.getProductID());
				temp.put(products.getProductID(), products.getQuantity()+Quantity);
			}
			else{
				temp.put(products.getProductID(), products.getQuantity());
			}
		}
		
	}
	
	System.out.println("Count in entries");
	for (Integer productID : temp.keySet()) {
		System.out.println(productID+"---"+temp.get(productID));
	}
	
	
	System.out.println("Count in Inventories");
	Map<Integer, Integer> temp2 = new HashMap<>();
	for (Integer pId : map1.keySet()) {
		Map<Inventory, Double> map2 = map1.get(pId);
		for(Inventory inventory: map2.keySet())
		{
			if(temp2.containsKey(pId))
			{
				Integer Quantity = temp2.get(pId);
				temp2.put(pId, inventory.getQuantity()+Quantity);
			}
			else{
				temp2.put(pId, inventory.getQuantity());
			}
		}
		
	}
	
	for (Integer productID : temp2.keySet()) {
		System.out.println(productID+"---"+temp2.get(productID));
	}
	
	int size =30;
	int counter = 0;
	for (OrderEntry orderEntry : entries) {
		if(counter <= size)
		{
			Boolean flag=true;
			for (OrderProduct products : orderEntry.getProductID()) 
				{
					if(products.getQuantity() <= temp2.get(products.getProductID()))
					{
						flag = flag && true;
					}
					else
					{
						flag = false;
						break;
					}	
				}	
			if(flag)
			{
				Double Shipping_Cost = 0.0;
				String inv_swq = "";
				Integer Check_flag = 0;
				System.out.println("For Order Entry "+orderEntry.getOrderID());
				
				for (OrderProduct products : orderEntry.getProductID()) 
				{
					System.out.println("For product "+products.getProductID());
					Map<Inventory,Double> map2 = map1.get(products.getProductID());
					//
					Check_flag++;
					//
					for(Inventory inventory:map2.keySet())
					{
						if(products.getQuantity() <= inventory.getQuantity())
						{
							inventory.setQuantity(inventory.getQuantity()-products.getQuantity());
							//
							System.out.println("From Inventory "+inventory.getID()+" shipping of "+map2.get(inventory)+" quantity"+products.getQuantity() );
							if(Check_flag == 1)
							{
								inv_swq = inv_swq+";"+inventory.getID();
								Shipping_Cost =Shipping_Cost + map2.get(inventory);
							}
							else if(!(inv_swq.contains(inventory.getID()+"")) && Check_flag != 1 )
							{
								Shipping_Cost =Shipping_Cost + map2.get(inventory);
								inv_swq = inv_swq+";"+inventory.getID();
							}
								//
							map2.put(inventory, map2.get(inventory));
							
							Integer value = temp2.get(products.getProductID());
							temp2.put(products.getProductID(), value-products.getQuantity() );
							
							
							break;
						}
						else if(products.getQuantity() > inventory.getQuantity() && inventory.getQuantity() != 0 && products.getQuantity() != 0)
						{
							products.setQuantity(products.getQuantity()-inventory.getQuantity());
							//
							System.out.println("From Inventory "+inventory.getID()+" shipping of "+map2.get(inventory)+" quantity"+(inventory.getQuantity()) );
							if(Check_flag == 1)
							{
								inv_swq = inv_swq+";"+inventory.getID();
								Shipping_Cost =Shipping_Cost + map2.get(inventory);
							}
							else if(!(inv_swq.contains(inventory.getID()+"")) && Check_flag != 1 )
							{
								Shipping_Cost =Shipping_Cost + map2.get(inventory);
								inv_swq = inv_swq+";"+inventory.getID();
							}
							//
							Integer value = temp2.get(products.getProductID());
							temp2.put(products.getProductID(), value-inventory.getQuantity() );
							inventory.setQuantity(0);
							map2.put(inventory, map2.get(inventory));
							
						}
					}
					
					map1.put(products.getProductID(), map2);
				}
				System.out.println("Total Shipping cost: "+Shipping_Cost);
				System.out.println(orderEntry.getOrderID()+ " is fullfilled");
			}
			else
			{
				System.out.println(orderEntry.getOrderID()+ " unfulfilled");
			}
			
		}
		else
		{
			//Nothing
		}
		
		
	}
	
	for (Integer productID : temp2.keySet()) {
		System.out.println(productID+"---"+temp2.get(productID));
	}
	System.out.println("after shipment");
	for (Integer integer : map1.keySet()) {
		System.out.println("Product ID "+integer);
		Map<Inventory,Double> map2 = new HashMap<Inventory, Double>();
		map2 = map1.get(integer);
		for (Inventory string : map2.keySet()) {
			System.out.println("id is "+string.getID()+" quantity is "+string.getQuantity()+" shipping is "+map2.get(string));
		}
	}
}

public <K, V extends Comparable<? super V>> Map<K, V> sortByValue( Map<K, V> map )
{
List<Map.Entry<K, V>> list =new LinkedList<Map.Entry<K, V>>( map.entrySet() );
Collections.sort( list, new Comparator<Map.Entry<K, V>>()
{
    public int compare( Map.Entry<K, V> o1, Map.Entry<K, V> o2 )
    {
        //return ((Inventory) o1.getKey()).compareTo((Inventory) o2.getKey() );
    	return (o1.getValue().compareTo(o2.getValue()));
    }
} );

Map<K, V> result = new LinkedHashMap<K, V>();
for (Map.Entry<K, V> entry : list)
{
    result.put( entry.getKey(), entry.getValue() );
}
return result;
}

 
public static void main(String[] args) {

	MileStone1 mileStone1 = new MileStone1();
	/*Map<Inventory,Double> map= mileStone1.milestone1(1);
	for (Inventory string : map.keySet()) {
		System.out.println("id is "+string.getID()+" quantity is "+string.getQuantity()+" shipping is "+map.get(string));
	}*/
	
	mileStone1.milestone2(mileStone1.entries);
	
}
}


