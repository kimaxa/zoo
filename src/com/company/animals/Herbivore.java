package com.company.animals;
import com.company.aviaries.SizeAviary;
import com.company.food.CarnivorousFood;
import com.company.food.HerbivoreFood;
import com.company.food.WrongFoodException;

public abstract class Herbivore extends Animal implements Rejoicing, Rumbling {
    { Carnivorous = false; }
    public Herbivore(String name, SizeAviary size) {
        super(name, size);
    }
    @Override
    public void eat(HerbivoreFood herbivoreFood) {
        if (herbivoreFood.getClass() == HerbivoreFood.class) {
            System.out.println("Травоядный будет это кушать");
        }
    }
    @Override
    public void eat(CarnivorousFood carnivorousFood) throws WrongFoodException {
        throw new WrongFoodException("Травоядный не будет это есть");
    }
    public void play() {
    }
    public void rejoice() {
        System.out.println("Ура!");
    }
    public void rumble() {
        System.out.println("Мррр");
    }
}

