package com.ideas.interview;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcceptanceTest {

	private Controller controller;
	private Display display;
	private Barista barista;
	private Inventory inventory;

	@Test
	public void dispenseBlackCoffeeForFree() {
		powerUp();
		assertEquals("Please select a beverage type", display.currentMessage());
		userWants(BeverageType.BLACK_COFFEE);
		assertEquals("Great Choice!", display.currentMessage());
		controller.dispense();
		assertEquals(BeverageType.BLACK_COFFEE, barista.servedBeverage());
		assertEquals("Please collect your delicious BLACK_COFFEE", display.currentMessage());
	}

	private AcceptanceTest userWants(BeverageType beverageType) {
		controller.userWants(beverageType);
		return this;
	}

	private void powerUp() {
		display = new Display();
		barista = new Barista();
		inventory = new Inventory(0,5,5, 5);
		controller = new Controller(display, barista, inventory);

	}

	@Test
	public void dispenseTeaForFree() {
		powerUp();
		assertEquals("Please select a beverage type", display.currentMessage());
		userWants(BeverageType.TEA);
		assertEquals("Great Choice!", display.currentMessage());
		controller.dispense();
		assertEquals(BeverageType.TEA, barista.servedBeverage());
		assertEquals("Please collect your delicious TEA", display.currentMessage());
	}

	@Test
	public void getInventoryForBlackCoffee() {
		assertEquals(1f, BeverageType.BLACK_COFFEE.getAmountOfCoffeeCups(), 0);
	}

	@Test
	public void dispenseTeaForFree1() {
		powerUp();
		assertEquals("Please select a beverage type", display.currentMessage());
		userWants(BeverageType.TEA);
		assertEquals("Great Choice!", display.currentMessage());
		controller.dispense();
		assertEquals(BeverageType.TEA, barista.servedBeverage());
		assertEquals("Please collect your delicious TEA", display.currentMessage());
	}
}
