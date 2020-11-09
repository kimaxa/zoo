package com.company.animals;

import com.company.food.CarnivorousFood;
import com.company.food.Food;

public abstract class Carnivorous extends Animal {
    @Override
    public void eat(Food food) {
        if (food.getClass() != CarnivorousFood.class) {
            System.out.println("Не буду кушать это");
        }
        else super.eat(food);
    }
    public void play() {

    }
}
