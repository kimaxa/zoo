package com.company.animals;

import com.company.food.CarnivorousFood;
import com.company.food.Food;

public abstract class Carnivorous extends Animal implements Growling, Rumbling {
    public Carnivorous(String name) {
        super();
    }

    @Override
    public void eat(Food food) {
        if (food.getClass() != CarnivorousFood.class) {
            System.out.println("Не буду кушать это");
        }
        else super.eat(food);
    }

    public void play() {

    }

    public void growl() {
        System.out.println("РРРррр");
    }
    public void rumble() {
        System.out.println("МММррр");

    }
}
