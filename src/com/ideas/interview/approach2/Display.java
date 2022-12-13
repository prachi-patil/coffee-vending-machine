package com.ideas.interview.approach2;

public class Display {

	private String message;

	public void show(String message) {
		this.message = message;
	}

	public String currentMessage() {
		return this.message;
	}

}
