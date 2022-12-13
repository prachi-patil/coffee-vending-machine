package com.ideas.interview;

public class Barista {

	private BeverageType servedBeverage;

	public void serve(BeverageType beverageType) {
		servedBeverage = beverageType;
	}

	public BeverageType servedBeverage() {
		return servedBeverage;
	}

}
