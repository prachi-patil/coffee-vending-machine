package com.ideas.interview;

public class LowOnInventory extends Exception {

    private String message;

    public LowOnInventory() {
        super();
    }

    public LowOnInventory(String message) {
        super(message);
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
