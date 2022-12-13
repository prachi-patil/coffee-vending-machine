package com.ideas.interview;

public class Inventory {
    private float amountOfCoffeeCups;
    private float amountOfTeaCups;
    private float amountOfMilkCups;
    private float amountOfWaterCups;

    public Inventory(float amountOfCoffeeCups, float amountOfTeaCups, float amountOfMilkCups, float amountOfWaterCups) {
        this.amountOfCoffeeCups = amountOfCoffeeCups;
        this.amountOfTeaCups = amountOfTeaCups;
        this.amountOfMilkCups = amountOfMilkCups;
        this.amountOfWaterCups = amountOfWaterCups;
    }

    public float getAmountOfCoffeeCups() {
        return amountOfCoffeeCups;
    }

    public void setAmountOfCoffeeCups(float amountOfCoffeeCups) {
        this.amountOfCoffeeCups = amountOfCoffeeCups;
    }

    public float getAmountOfTeaCups() {
        return amountOfTeaCups;
    }

    public void setAmountOfTeaCups(float amountOfTeaCups) {
        this.amountOfTeaCups = amountOfTeaCups;
    }

    public float getAmountOfMilkCups() {
        return amountOfMilkCups;
    }

    public void setAmountOfMilkCups(float amountOfMilkCups) {
        this.amountOfMilkCups = amountOfMilkCups;
    }

    public float getAmountOfWaterCups() {
        return amountOfWaterCups;
    }

    public void setAmountOfWaterCups(float amountOfWaterCups) {
        this.amountOfWaterCups = amountOfWaterCups;
    }

    public void checkIfInventorySuff (BeverageType type) throws LowOnInventory {
            if(type.getAmountOfCoffeeCups() <= this.amountOfCoffeeCups && type.getAmountOfTeaCups() <= this.amountOfTeaCups
                    && type.getAmountOfMilkCups() <= this.amountOfMilkCups) {
                this.amountOfCoffeeCups -= type.getAmountOfCoffeeCups();
                this.amountOfTeaCups -= type.getAmountOfTeaCups();
                this.amountOfMilkCups -= type.getAmountOfMilkCups();
            } else {
                throw new LowOnInventory("Unable to dispense as low on inventory !!");
            }
    }
}
