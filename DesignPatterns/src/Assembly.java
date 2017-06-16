import java.util.ArrayList;

public class Assembly implements ItemInterface {
	
	private String assemblyName;
	private ArrayList<ItemInterface> items;
	private float cost;
	
	public Assembly(String assemblyName) {
		this.assemblyName = assemblyName;
		this.items = new ArrayList<ItemInterface>();		
	}
	
	public float getCost() {
		cost = 0;
		for (ItemInterface i : this.items) {
			this.cost += i.getCost();
		}
		return cost;
	}
	
	public boolean isBasicItem() {
		return false;
	}
	
	public String getName() {
		return this.assemblyName;
	}
	
	public void addItem(ItemInterface i) {
		items.add(i);
	}
	
	public void removeItem(ItemInterface i) {
		items.remove(i);
	}
}
