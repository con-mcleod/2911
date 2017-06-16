
public class Tester {

	public static void main(String[] args) {
		Item wheel1 = new Item("Wheel 1", 10);
		Item wheel2 = new Item("Wheel 2", 10);
		Item door1 = new Item("Door 1", 20);
		Item door2 = new Item("Door 2", 20);
		
		Assembly chassis = new Assembly("Chassis");
		Assembly carFrame = new Assembly("Car Frame");

		chassis.addItem(wheel1);
		chassis.addItem(wheel2);
		
		carFrame.addItem(door1);
		carFrame.addItem(door2);
		carFrame.addItem(chassis);
		
		System.out.print("Testing if wheel is a basic item: ");
		System.out.println(wheel1.isBasicItem());
		assert wheel1.isBasicItem() == true;
		System.out.print("Testing if Car Frame is a basic item: ");
		System.out.println(carFrame.isBasicItem());
		assert carFrame.isBasicItem() == false;
		
		System.out.print("Cost of one Wheel: $");
		System.out.println(wheel1.getCost());
		assert wheel1.getCost() == 10;
		
		System.out.print("Cost of Car Frame: $");
		System.out.println(carFrame.getCost());
		assert carFrame.getCost() == 60;
		
		DiscountedItem discountedWheel = new DiscountedItem(wheel1, 10);
		System.out.print("Cost of 10% Discounted Wheel: $");
		System.out.println(discountedWheel.getCost());
		assert discountedWheel.getCost() == 9;
		
		DiscountedItem discountedCarFrame = new DiscountedItem(carFrame, 25);
		System.out.print("Cost of 25% Discounted Car Frame: $");
		System.out.println(discountedCarFrame.getCost());
		assert discountedCarFrame.getCost() == 45;
		
		System.out.println("\nAll tests passed!");
	}
}
