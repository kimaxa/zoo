package com.company.animals;


import com.company.food.Food;

import java.util.Objects;

public abstract class Animal {
    private String name;

    public String getName() {
        return this.name;
    }

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

    public void eat(Food food) {
        System.out.println("Покушал");
    }
    public abstract void play();

}
