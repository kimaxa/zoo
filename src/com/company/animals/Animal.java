package com.company.animals;
import com.company.aviaries.SizeAviary;
import com.company.food.CarnivorousFood;
import com.company.food.HerbivoreFood;
import com.company.food.WrongFoodException;
import java.util.Objects;

public abstract class Animal {
    private String name;
    public boolean Carnivorous;
    private SizeAviary size;
    public SizeAviary getSize() {
        return size;
    }
    protected Animal(String name, SizeAviary size) {
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return this.name;
    }

    public abstract void eat(CarnivorousFood carnivorousFood) throws WrongFoodException;
    public abstract void eat(HerbivoreFood herbivoreFood) throws WrongFoodException;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return this.name.equals(animal.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // public void eat(Food food) {
    // System.out.println("Покушал");
    // }
    public abstract void play();

}
