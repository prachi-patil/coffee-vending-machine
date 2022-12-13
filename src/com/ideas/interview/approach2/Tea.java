package com.ideas.interview.approach2;

import com.ideas.interview.BeverageType;
import com.ideas.interview.Inventory;
import com.ideas.interview.LowOnInventory;

public class Tea implements Beverage {

    private float amountOfTeaCups = .5f;
    private float amountOfMilkCups = .5f;
    private float amountOfWaterCups = .5f;

    @Override
    public void checkIfInventorySuff(Inventory inventory) throws LowOnInventory {
        if(this.amountOfTeaCups > inventory.getAmountOfTeaCups() || this.amountOfWaterCups > inventory.getAmountOfWaterCups()
                || this.amountOfMilkCups > inventory.getAmountOfMilkCups()){
            throw new LowOnInventory("Unable to dispense as Low on Inventory !!");
        }
        inventory.setAmountOfTeaCups(inventory.getAmountOfTeaCups() - this.amountOfTeaCups);
        inventory.setAmountOfMilkCups(inventory.getAmountOfMilkCups() - this.amountOfMilkCups);
        inventory.setAmountOfWaterCups(inventory.getAmountOfWaterCups() - this.amountOfWaterCups);
    }
}
