package com.company.aviaries;
import com.company.animals.Animal;

import java.util.ArrayList;
import java.util.List;

public abstract class Aviary <T extends Animal> {
    protected List<T> animals;
    protected Integer size;

    public Aviary(Integer size) {
        animals = new ArrayList<T>(size);
        this.size=size;
    }
    public void addAnimal(T animal) {
        if (animals.size() == size) {
            System.out.println("Мест нет"); }
        else {
            animals.add(animal);
        }
    }
    public void printAllAnimals() {
        for (T animal : animals) {
            System.out.println(animal.getClass().getName());
        }
    }
}
