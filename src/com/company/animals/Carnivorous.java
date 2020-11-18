package com.company.animals;
import com.company.aviaries.SizeAviary;
import com.company.food.CarnivorousFood;
import com.company.food.HerbivoreFood;
import com.company.food.WrongFoodException;

public abstract class Carnivorous extends Animal implements Growling, Rumbling {
    { Carnivorous = true;}
    public Carnivorous(String name, SizeAviary size) {
        super(name, size);
    }
    @Override
    public void eat(CarnivorousFood carnivorousFood) {
        if (carnivorousFood.getClass() == CarnivorousFood.class) {
            System.out.println("Хищник будет это кушать");
        }
    }
    @Override
    public void eat(HerbivoreFood herbivoreFood) throws WrongFoodException {
        throw new WrongFoodException("Хищник не будет это есть");
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
