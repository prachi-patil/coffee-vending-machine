package com.ideas.interview.approach2;

import com.ideas.interview.approach2.BeverageType;

public class Barista {

	private BeverageType servedBeverage;

	public void serve(BeverageType beverageType) {
		servedBeverage = beverageType;
	}

	public BeverageType servedBeverage() {
		return servedBeverage;
	}

}
