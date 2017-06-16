
public class DiscountedItem extends DecoratedItem {
	
	private float discount;

	public DiscountedItem(ItemInterface item, float discount) {
		super(item);
		this.discount = discount;
	}
	
	public float getCost() {
		return applyDiscount(super.getCost());
	}
	
	private float applyDiscount(float cost) {
		return cost*((100-this.discount)/100);
	}
}