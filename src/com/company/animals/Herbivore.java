package com.company.animals;

import com.company.food.Food;
import com.company.food.HerbivoreFood;

public abstract class Herbivore extends Animal {
    @Override
    public void eat(Food food) {
        if (food.getClass() != HerbivoreFood.class) {
            System.out.println("Не буду кушать это");
        }
        else super.eat(food); }

    public void play() {

    }
}

