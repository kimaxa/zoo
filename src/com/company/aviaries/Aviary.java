package com.company.aviaries;
import com.company.animals.Animal;
import java.util.HashMap;
import java.util.Map;


public class Aviary <T extends Animal> {
    String name;
    private int limit;
    private  SizeAviary size;
    protected int space;
    protected boolean isCarnivorous;
    private Map<String, T> animalAviary = new HashMap<>();
    public Aviary(String name, int limit, int space, SizeAviary size) {
        if (space > 1) {
            this.size = size;
            this.limit = limit;
            this.isCarnivorous = true;
            this.name = name;
            this.space = space;
            System.out.println("Создан вольер " + name + " размером " + space);
        }
        if (isCarnivorous) {
            System.out.println(" для хищников");
        }
        else {
            System.out.println(" для травоядных");
        }

    }

    public void addAnimal (T animal) {
        if (limit < space) {
            if (isCarnivorous == animal.Carnivorous && size == animal.getSize()) {
                animalAviary.put(animal.getName(), animal);
                System.out.println("В клетку добавлен " + animal.getName() + ". Он занимает " + animal.getSize());
                limit++;

            } else {
                System.out.println(animal.getName() + " не может жить в этой клетке");
            }
            } else {
            System.out.println(animal.getName() + " мест нет");
            }
    }
    public void deleteAnimal(T animal) {
        animalAviary.remove(animal.getName());
        System.out.println(animal.getName() + " убран из вольера. В вольере сейчас - " + animalAviary.size());
    }
    public T getAnimal(String name) {
        System.out.println(animalAviary.get(name));
        return animalAviary.get(name);
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
