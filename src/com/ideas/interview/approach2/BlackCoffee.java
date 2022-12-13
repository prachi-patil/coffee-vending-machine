package com.ideas.interview.approach2;

import com.ideas.interview.BeverageType;
import com.ideas.interview.Inventory;
import com.ideas.interview.LowOnInventory;

public class BlackCoffee implements Beverage {

    private float amountOfCoffeeCups = .5f;
    private float amountOfWaterCups = 1f;

    @Override
    public void checkIfInventorySuff(Inventory inventory) throws LowOnInventory {
        if(this.amountOfCoffeeCups > inventory.getAmountOfCoffeeCups() || this.amountOfWaterCups > inventory.getAmountOfWaterCups()){
            throw new LowOnInventory("Unable to dispense as Low on Inventory !!");
        }
        inventory.setAmountOfCoffeeCups(inventory.getAmountOfCoffeeCups() - this.amountOfCoffeeCups);
        inventory.setAmountOfWaterCups(inventory.getAmountOfWaterCups() - this.amountOfWaterCups);
    }
}
