package com.company.animals;


import com.company.food.CarnivorousFood;
import com.company.food.Food;

public abstract class Animal {

    public void eat(Food food) {
        System.out.println("Покушал");
    }

    public abstract void play();

}
