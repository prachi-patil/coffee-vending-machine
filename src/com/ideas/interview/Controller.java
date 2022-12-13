package com.ideas.interview;

public class Controller {
	private final Display display;
	private final Barista barista;
	private final Inventory inventory;
	private BeverageType beverageType;

	public Controller(Display display, Barista barista, Inventory inventory) {
		this.display = display;
		this.barista = barista;
		this.inventory = inventory;
		display.show("Please select a beverage type");
	}

	public void userWants(BeverageType beverageType) {
		this.beverageType = beverageType;
		display.show("Great Choice!");
	}

	public void dispense() {
		try {
			inventory.checkIfInventorySuff(beverageType);
			barista.serve(beverageType);
			display.show("Please collect your delicious " + beverageType);
		}catch(LowOnInventory excp){
			display.show(excp.getMessage());
		}
	}
}
