package company.interview.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
class MyOrderEntry implements Comparator<OrderEntry>
{

	@Override
	public int compare(OrderEntry o1, OrderEntry o2) {
		int q1=0,q2=0;
		for (OrderProduct product : o1.getProductID()) {
			q1+=product.getQuantity();
		}
		for (OrderProduct product : o2.getProductID()) {
			q2+=product.getQuantity();
		}
		return (q1 > q2)?1:-1;
	
		
	}
	
}

class OrderProduct
{
	Integer productID;
	Integer Quantity;
	public Integer getProductID() {
		return productID;
	}
	public void setProductID(Integer productID) {
		this.productID = productID;
	}
	public Integer getQuantity() {
		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	public OrderProduct(Integer productID, Integer quantity) {
		this.productID = productID;
		Quantity = quantity;
	}
	
	
	
}
public class OrderEntry{

	private int OrderID;
	private List<OrderProduct> ProductID;
	
	
	public OrderEntry(int orderID, List<OrderProduct> productID) {
		OrderID = orderID;
		ProductID = productID;
	}
	
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	
	
	public List<OrderProduct> getProductID() {
		return ProductID;
	}

	public void setProductID(List<OrderProduct> productID) {
		ProductID = productID;
	}

	public static List<OrderEntry> populate()
	{
		List<OrderProduct> productsOrder1 = new ArrayList<>();
		productsOrder1.add(new OrderProduct(1, 20));
		productsOrder1.add(new OrderProduct(3, 2));
		OrderEntry entry1 = new OrderEntry(1,productsOrder1);
		
		List<OrderProduct> productsOrder2 = new ArrayList<>();
		productsOrder2.add(new OrderProduct(4, 10));
		productsOrder2.add(new OrderProduct(6, 4));
		productsOrder2.add(new OrderProduct(7, 5));
		productsOrder2.add(new OrderProduct(12, 20));
		OrderEntry entry2 = new OrderEntry(2,productsOrder2);
		
		List<OrderProduct> productsOrder3 = new ArrayList<>();
		productsOrder3.add(new OrderProduct(11, 20));
		productsOrder3.add(new OrderProduct(12, 10));
		OrderEntry entry3 = new OrderEntry(3,productsOrder3);
		
		List<OrderProduct> productsOrder4 = new ArrayList<>();
		productsOrder4.add(new OrderProduct(7, 10));
		productsOrder4.add(new OrderProduct(6, 1));
		productsOrder4.add(new OrderProduct(4, 20));
		productsOrder4.add(new OrderProduct(12, 1));
		OrderEntry entry4 = new OrderEntry(4,productsOrder4);
		
		List<OrderProduct> productsOrder5 = new ArrayList<>();
		productsOrder5.add(new OrderProduct(1, 12));
		productsOrder5.add(new OrderProduct(2, 3));
		productsOrder5.add(new OrderProduct(3, 20));
		productsOrder5.add(new OrderProduct(12, 1));
		OrderEntry entry5 = new OrderEntry(5,productsOrder5);
		
		List<OrderProduct> productsOrder6 = new ArrayList<>();
		productsOrder6.add(new OrderProduct(12, 20));
		productsOrder6.add(new OrderProduct(11, 10));
		productsOrder6.add(new OrderProduct(10, 10));
		OrderEntry entry6 = new OrderEntry(6,productsOrder6);
		
		List<OrderProduct> productsOrder7 = new ArrayList<>();
		productsOrder7.add(new OrderProduct(1, 10));
		productsOrder7.add(new OrderProduct(4, 20));
		productsOrder7.add(new OrderProduct(5, 1));
		OrderEntry entry7 = new OrderEntry(7,productsOrder7);
		
		List<OrderProduct> productsOrder8 = new ArrayList<>();
		productsOrder8.add(new OrderProduct(2, 10));
		productsOrder8.add(new OrderProduct(4, 2));
		productsOrder8.add(new OrderProduct(6, 3));
		OrderEntry entry8 = new OrderEntry(8,productsOrder8);
		
		List<OrderProduct> productsOrder9 = new ArrayList<>();
		productsOrder9.add(new OrderProduct(1, 1));
		productsOrder9.add(new OrderProduct(3, 10));
		productsOrder9.add(new OrderProduct(5, 1));
		OrderEntry entry9 = new OrderEntry(9,productsOrder9);
		
		List<OrderProduct> productsOrder10 = new ArrayList<>();
		productsOrder10.add(new OrderProduct(1, 10));
		productsOrder10.add(new OrderProduct(2, 20));
		productsOrder10.add(new OrderProduct(3, 4));
		productsOrder10.add(new OrderProduct(4, 10));
		productsOrder10.add(new OrderProduct(7, 6));
		productsOrder10.add(new OrderProduct(11, 1));
		OrderEntry entry10 = new OrderEntry(10,productsOrder10);
		
		List<OrderProduct> productsOrder11 = new ArrayList<>();
		productsOrder11.add(new OrderProduct(6, 10));
		productsOrder11.add(new OrderProduct(3, 2));
		OrderEntry entry11 = new OrderEntry(11,productsOrder11);
		
		List<OrderProduct> productsOrder12 = new ArrayList<>();
		productsOrder12.add(new OrderProduct(1, 10));
		productsOrder12.add(new OrderProduct(4, 3));
		productsOrder12.add(new OrderProduct(5, 5));
		OrderEntry entry12 = new OrderEntry(12,productsOrder12);
		
		List<OrderProduct> productsOrder13 = new ArrayList<>();
		productsOrder13.add(new OrderProduct(6, 10));
		productsOrder13.add(new OrderProduct(7, 20));
		productsOrder13.add(new OrderProduct(2, 3));
		OrderEntry entry13 = new OrderEntry(13,productsOrder13);
		
		List<OrderProduct> productsOrder14 = new ArrayList<>();
		productsOrder14.add(new OrderProduct(1, 1));
		productsOrder14.add(new OrderProduct(3, 2));
		OrderEntry entry14 = new OrderEntry(14,productsOrder14);
		
	
		List<OrderEntry> entries = new ArrayList<>();
		entries.add(entry1);
		entries.add(entry2);
		entries.add(entry3);
		entries.add(entry4);
		entries.add(entry5);
		entries.add(entry6);
		entries.add(entry7);
		entries.add(entry8);
		entries.add(entry9);
		entries.add(entry10);
		entries.add(entry11);
		entries.add(entry12);
		entries.add(entry13);
		entries.add(entry14);
		
		return entries;
		
 	}

	
}
