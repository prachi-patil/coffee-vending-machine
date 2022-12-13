package com.ideas.interview;

public enum BeverageType {


	BLACK_COFFEE(1,0,0),
	TEA(0,.5f,.5f);

	private final float amountOfCoffeeCups;
	private final float amountOfTeaCups;
	private final float amountOfMilkCups;

	BeverageType(float amountOfCoffeeCups, float amountOfTeaCups, float amountOfMilkCups) {
		this.amountOfCoffeeCups = amountOfCoffeeCups;
		this.amountOfTeaCups = amountOfTeaCups;
		this.amountOfMilkCups = amountOfMilkCups;
	}

	public float getAmountOfCoffeeCups() {
		return amountOfCoffeeCups;
	}

	public float getAmountOfTeaCups() {
		return amountOfTeaCups;
	}

	public float getAmountOfMilkCups() {
		return amountOfMilkCups;
	}
}
