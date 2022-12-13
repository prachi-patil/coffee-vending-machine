package com.ideas.interview.approach2;

public enum BeverageType {


	BLACK_COFFEE(new BlackCoffee()),
	TEA(new Tea());

	private final Beverage type;

	BeverageType(Beverage type) {
		this.type = type;
	}

	public Beverage getType() {
		return type;
	}
}
