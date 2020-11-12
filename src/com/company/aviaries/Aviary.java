package com.company.aviaries;
import com.company.animals.Animal;
import java.util.HashMap;


public class Aviary <T extends Animal> {
    private int limit;
    public HashMap<String, T> animalAviary = new HashMap<>();
    public Aviary(int limit) {
        this.limit = limit;
    }

    public void addAnimal (T animal) {
        if (limit > animalAviary.size()) {
            animalAviary.put(animal.getName(), animal);
            System.out.println(animal.getClass().getName() + " добавлен. В вольере сейчас - " + animalAviary.size());
        } else if (limit <= animalAviary.size()) {
            System.out.println("Вольер заполнен.");
        }
    }
    public void deleteAnimal(T animal) {
        animalAviary.remove(animal.getClass().getName());
        System.out.println(animal.getClass().getName() + " убран из вольера. В вольере сейчас - " + animalAviary.size());
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
