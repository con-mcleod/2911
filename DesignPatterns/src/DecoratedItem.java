
public class DecoratedItem implements ItemInterface {

	private ItemInterface decoratedItem;
	
	public DecoratedItem(ItemInterface decoratedItem) {
		this.decoratedItem = decoratedItem;
	}
	
	public float getCost() {
		return decoratedItem.getCost();
	}

	public boolean isBasicItem() {
		return decoratedItem.isBasicItem();
	}

	public String getName() {
		return decoratedItem.getName();
	}

}
