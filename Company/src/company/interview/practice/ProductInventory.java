
package company.interview.practice;

import java.util.HashMap;
import java.util.Map;

public class ProductInventory {

	
	public ProductInventory() {
	}

	public Map<Inventory, Double> search(Integer ProductID)
	{
		Map<Inventory, Double> map = new HashMap<>();
		if(ProductID == 1)
		{
			Inventory temp2 = new Inventory(2, 2);
			Inventory temp7 = new Inventory(7, 14);
			Inventory temp10 = new Inventory(10, 12);
			Inventory temp4 = new Inventory(4, 6);
			Inventory temp5 = new Inventory(5, 3);
			Inventory temp9 = new Inventory(9, 6);
			map.put(temp2, 55.0);
			map.put(temp7, 55.0);
			map.put(temp10, 55.0);
			map.put(temp4, 60.0);
			map.put(temp5, 50.0);
			map.put(temp9, 60.0);
			
			return map;
		}
		
		if(ProductID == 2)
		{
			Inventory temp3 = new Inventory(3, 6);
			Inventory temp1 = new Inventory(1, 6);
			Inventory temp2 = new Inventory(2, 3);
			Inventory temp10 = new Inventory(10, 11);
			Inventory temp4 = new Inventory(4, 4);
			Inventory temp6 = new Inventory(6, 3);
			Inventory temp8 = new Inventory(8, 7);
			map.put(temp3, 60.0);
			map.put(temp1, 50.0);
			map.put(temp2, 55.0);
			map.put(temp10, 55.0);
			map.put(temp4, 60.0);
			map.put(temp6, 60.0);
			map.put(temp8, 50.0);
			return map;
		}
		if(ProductID == 3)
		{
			Inventory temp2 = new Inventory(2, 4);
			Inventory temp10 = new Inventory(10, 10);
			Inventory temp5 = new Inventory(5, 5);
			Inventory temp6 = new Inventory(6, 2);
			map.put(temp2, 55.0);
			map.put(temp10, 55.0);
			map.put(temp5, 50.0);
			map.put(temp6, 60.0);
			
			return map;
		}
		if(ProductID == 4)
		{
			Inventory temp2 = new Inventory(2, 5);
			Inventory temp10 = new Inventory(10, 9);
			Inventory temp1 = new Inventory(1, 10);
			Inventory temp3 = new Inventory(3, 10);
			Inventory temp4 = new Inventory(4, 2);
			Inventory temp6 = new Inventory(6, 4);
			map.put(temp2, 55.0);
			map.put(temp10, 55.0);
			map.put(temp1, 50.0);
			map.put(temp3, 60.0);
			map.put(temp4, 60.0);
			map.put(temp6, 60.0);
			return map;
		}
		if(ProductID == 5)
		{
			Inventory temp2 = new Inventory(2, 6);
			Inventory temp10 = new Inventory(10, 8);
			Inventory temp7 = new Inventory(7, 6);
			Inventory temp9 = new Inventory(9, 7);
			map.put(temp2, 55.0);
			map.put(temp7, 55.0);
			map.put(temp10, 55.0);
			map.put(temp9, 60.0);
			
			return map;
		}
		if(ProductID == 6)
		{
			Inventory temp3 = new Inventory(3, 8);
			Inventory temp1 = new Inventory(1, 8);
			
			Inventory temp2 = new Inventory(2, 7);
			Inventory temp10 = new Inventory(10, 7);
			Inventory temp5 = new Inventory(5, 12);
			Inventory temp6 = new Inventory(6, 7);
			
			map.put(temp3, 60.0);
			map.put(temp1, 50.0);
			map.put(temp2, 55.0);
			map.put(temp10, 55.0);
			map.put(temp5, 50.0);
			map.put(temp6, 60.0);
			
			return map;
		}
		if(ProductID == 7)
		{
			Inventory temp2 = new Inventory(2, 8);
			Inventory temp10 = new Inventory(10, 6);
			Inventory temp4 = new Inventory(4, 4);
			Inventory temp5 = new Inventory(5, 15);
			Inventory temp6 = new Inventory(6, 6);
			Inventory temp7 = new Inventory(7, 7);
			Inventory temp8 = new Inventory(8, 2);
			Inventory temp9 = new Inventory(9, 6);
			
			map.put(temp2, 55.0);
			map.put(temp10, 55.0);
			map.put(temp4, 60.0);
			map.put(temp5, 50.0);
			map.put(temp6, 60.0);
			map.put(temp7, 55.0);
			map.put(temp8, 50.0);	
			map.put(temp9, 60.0);
			
			return map;
		}
		if(ProductID == 8)
		{
			Inventory temp3 = new Inventory(3, 12);
			Inventory temp1 = new Inventory(1, 12);
			
			Inventory temp2 = new Inventory(2, 9);
			Inventory temp10 = new Inventory(10, 5);
			
			Inventory temp8 = new Inventory(8, 6);
			map.put(temp3, 60.0);
			map.put(temp1, 50.0);
			map.put(temp2, 55.0);
			map.put(temp10, 55.0);
			map.put(temp8, 50.0);
			return map;
		}
		if(ProductID == 9)
		{
			Inventory temp2 = new Inventory(2, 10);
			Inventory temp10 = new Inventory(10, 4);
			Inventory temp4 = new Inventory(4, 8);
			Inventory temp5 = new Inventory(5, 1);
			Inventory temp6 = new Inventory(6, 5);
			Inventory temp9 = new Inventory(9, 13);
			map.put(temp2, 55.0);
			map.put(temp10, 55.0);
			map.put(temp4, 60.0);
			map.put(temp5, 50.0);
			map.put(temp6, 60.0);
			map.put(temp9, 60.0);
			
			return map;
		}
		if(ProductID == 10)
		{
			Inventory temp2 = new Inventory(2, 11);
			Inventory temp10 = new Inventory(10, 3);
			Inventory temp3 = new Inventory(3, 5);
			Inventory temp1 = new Inventory(1, 5);
			Inventory temp9 = new Inventory(9, 12);
			map.put(temp2, 55.0);
			map.put(temp10, 55.0);
			map.put(temp3, 60.0);
			map.put(temp1, 50.0);
			map.put(temp9, 60.0);
			
			return map;
		}
		if(ProductID == 11)
		{
			Inventory temp2 = new Inventory(2, 12);
			Inventory temp10 = new Inventory(10, 2);

			Inventory temp5 = new Inventory(5, 20);
			Inventory temp7 = new Inventory(7, 12);

			Inventory temp9 = new Inventory(9, 7);
			map.put(temp2, 55.0);
			map.put(temp10, 55.0);
			map.put(temp5, 50.0);
			map.put(temp7, 55.0);

			map.put(temp9, 100.0);
			
			return map;
		}
		if(ProductID == 12)
		{
			Inventory temp2 = new Inventory(2, 13);
			Inventory temp10 = new Inventory(10, 12);
			Inventory temp1 = new Inventory(1, 11);
			Inventory temp3 = new Inventory(3, 11);
			Inventory temp4 = new Inventory(4, 7);
			Inventory temp5 = new Inventory(5, 15);
			Inventory temp6 = new Inventory(6, 1);
			Inventory temp7 = new Inventory(7, 13);
			Inventory temp8 = new Inventory(8, 4);
			Inventory temp9 = new Inventory(9, 1);
			
			map.put(temp2, 55.0);
			map.put(temp10, 55.0);
			map.put(temp1, 50.0);
			map.put(temp3, 60.0);
			map.put(temp4, 60.0);
			map.put(temp5, 50.0);
			map.put(temp6, 60.0);
			map.put(temp7, 55.0);
			map.put(temp8, 50.0);
			map.put(temp9, 60.0);
			
			return map;
		}
		
		return null;
		
		
		
	}

}
