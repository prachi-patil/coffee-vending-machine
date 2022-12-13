package com.ideas.interview.approach2;

import com.ideas.interview.BeverageType;
import com.ideas.interview.Inventory;
import com.ideas.interview.LowOnInventory;

public interface Beverage {

    void checkIfInventorySuff (Inventory inventory) throws LowOnInventory;
}
