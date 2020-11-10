package com.company.aviaries;
import com.company.animals.Animal;
import com.company.animals.Carnivorous;

import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public abstract class Aviary <T extends Animal> {
    private int limit;
    public HashMap<String, T> animalAviary = new HashMap<>();
    public Aviary(int limit) {
        this.limit = limit;
    }
    public void addAnimal (T animal) {
        if (limit > animalAviary.size()) {
            animalAviary.put(animal.getName(), animal);
            System.out.println(animal.getClass().getName() + " добавлен. В вольере сейчас - " + animalAviary.size());
        }
        else if (limit <= animalAviary.size()) {
            System.out.println("Вольер заполнен.");
        }

    }
    }












    /*public Aviary(Integer size) {
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
} */
