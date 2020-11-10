package com.company.animals;

import com.company.food.Food;
import com.company.food.HerbivoreFood;

import java.sql.SQLOutput;

public abstract class Herbivore extends Animal implements Rejoicing, Rumbling {
    @Override
    public void eat(Food food) {
        if (food.getClass() != HerbivoreFood.class) {
            System.out.println("Не буду кушать это");
        }
        else super.eat(food); }

    public void play() {

    }

    public void rejoice() {
        System.out.println("Ура!");

    }

    public void rumble() {
        System.out.println("Мррр");;

    }
}

