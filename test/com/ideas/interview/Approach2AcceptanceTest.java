package com.ideas.interview;

import org.junit.Test;
import com.ideas.interview.approach2.Controller;
import com.ideas.interview.approach2.BeverageType;
import com.ideas.interview.approach2.Display;
import com.ideas.interview.approach2.Barista;

import static org.junit.Assert.assertEquals;

public class Approach2AcceptanceTest {

	private Controller controller;
	private Display display;
	private Barista barista;
	private Inventory inventory;

	@Test
	public void dispenseBlackCoffeeForFree() {
		powerUp(5,5,5,5);
		assertEquals("Please select a beverage type", display.currentMessage());
		userWants(BeverageType.BLACK_COFFEE);
		assertEquals("Great Choice!", display.currentMessage());
		controller.dispense();
		assertEquals(BeverageType.BLACK_COFFEE, barista.servedBeverage());
		assertEquals("Please collect your delicious BLACK_COFFEE", display.currentMessage());
	}

	private Approach2AcceptanceTest userWants(BeverageType beverageType) {
		controller.userWants(beverageType);
		return this;
	}

	private void powerUp(float coffeeCups, float teaCups, float milkCups, float waterCups) {
		display = new Display();
		barista = new Barista();
		inventory = new Inventory(coffeeCups, teaCups, milkCups, waterCups);
		controller = new Controller(display, barista, inventory);

	}

	@Test
	public void LowOnCoffeeBeans() {
		powerUp(0,5,5,5);
		assertEquals("Please select a beverage type", display.currentMessage());
		userWants(BeverageType.BLACK_COFFEE);
		assertEquals("Great Choice!", display.currentMessage());
		controller.dispense();
		assertEquals("Unable to dispense as Low on Inventory !!", display.currentMessage());
	}

//	//@Test
//	public void dispenseTeaForFree() {
//		powerUp(5,5,5,5);
//		assertEquals("Please select a beverage type", display.currentMessage());
//		userWants(BeverageType.TEA);
//		assertEquals("Great Choice!", display.currentMessage());
//		controller.dispense();
//		assertEquals(BeverageType.TEA, barista.servedBeverage());
//		assertEquals("Please collect your delicious TEA", display.currentMessage());
//	}
//
//	//@Test
//	public void getInventoryForBlackCoffee() {
//		assertEquals(1f, BeverageType.BLACK_COFFEE.getAmountOfCoffeeCups(), 0);
//	}
//
//	//@Test
//	public void dispenseTeaForFree1() {
//		powerUp(5,5,5,5);
//		assertEquals("Please select a beverage type", display.currentMessage());
//		userWants(BeverageType.TEA);
//		assertEquals("Great Choice!", display.currentMessage());
//		controller.dispense();
//		assertEquals(BeverageType.TEA, barista.servedBeverage());
//		assertEquals("Please collect your delicious TEA", display.currentMessage());
//	}
}
