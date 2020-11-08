package com.company.animals;

import com.company.food.HerbivoreFood;

public abstract class Herbivore extends Animal {
    public void eat(HerbivoreFood herbivoreFood) {
        if (herbivoreFood.getClass() != HerbivoreFood.class) {
            System.out.println("Не буду кушать это.");
        }
        else {
            eat(herbivoreFood);
        }
    }
}
