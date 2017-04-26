package company.interview.practice;

public class Inventory implements Comparable<Inventory> {

	private Integer ID;
	private Integer Quantity;
	
	
	
	public Inventory(Integer iD, Integer quantity) {
		super();
		ID = iD;
		Quantity = quantity;
	}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Integer getQuantity() {
 		return Quantity;
	}
	public void setQuantity(Integer quantity) {
		Quantity = quantity;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Inventory)
			return (this.ID.equals(((Inventory) obj).getID()) && this.getQuantity().equals(((Inventory) obj).getQuantity()) );
		return false;
	}

	@Override
	public int compareTo(Inventory o) {
		if(o.ID==this.ID && o.Quantity==this.Quantity)
			return 0;
		else if(o.Quantity < this.Quantity)
			return 1;
		else
			return -1;
	}
	

	
}
