
public class Item implements ItemInterface{

	private float cost;
	private String itemName;
	
	public Item(String itemName, int cost) {
		this.itemName = itemName;
		this.cost = cost;
	}
	
	public float getCost() {
		return this.cost;
	}

	public boolean isBasicItem() {
		return true;
	}
	
	public String getName() {
		return this.itemName;
	}

}
