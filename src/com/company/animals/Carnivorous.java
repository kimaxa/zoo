package com.company.animals;

import com.company.food.CarnivorousFood;

public abstract class Carnivorous extends Animal {
    public void eat(CarnivorousFood carnivorousFood) {
        if (carnivorousFood.getClass() != CarnivorousFood.class) {
            System.out.println("Не буду кушать это.");
        }
        else {
            eat(carnivorousFood);
        }



    }
}
