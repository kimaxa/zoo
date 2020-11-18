package com.company;
import com.company.animals.*;
import com.company.aviaries.CarnivorousAviary;
import com.company.aviaries.HerbivoreAviary;
import com.company.aviaries.SizeAviary;
import com.company.food.CarnivorousFood;
import com.company.food.HerbivoreFood;
import com.company.food.WrongFoodException;

public class Main {
    public static void foodAnimal(Animal animal) throws WrongFoodException {
        HerbivoreFood herbivoreFood = new HerbivoreFood();
        CarnivorousFood carnivorousFood = new CarnivorousFood();
        animal.eat(herbivoreFood);
        animal.eat(carnivorousFood);
    }

    public static void main(String[] args)  {
        Lion alex = new Lion("Алекс", SizeAviary.BIG);
        Lion martin = new Lion("Мартин", SizeAviary.BIG);
        Tiger leysan = new Tiger("Лейсан", SizeAviary.MIDDLE);
        Tiger shiva = new Tiger("Шива", SizeAviary.MIDDLE);
        Zebra melman = new Zebra("Мелман", SizeAviary.MIDDLE);
        Zebra gloriya = new Zebra("Глория", SizeAviary.MIDDLE);
        Duck donald = new Duck("Дональд", SizeAviary.SMALL);
        Elephant nepal = new Elephant("Непал", SizeAviary.LARGE);
        Elephant kali = new Elephant("Кали", SizeAviary.LARGE);
        CarnivorousAviary carnivorousAviary1 = new CarnivorousAviary("Вольер для львов",3,12, SizeAviary.BIG);
        CarnivorousAviary carnivorousAviary2 = new CarnivorousAviary("Вольер для тигров", 3, 9, SizeAviary.BIG);
        HerbivoreAviary herbivoreAviary1 = new HerbivoreAviary("Вольер для зебр", 3, 9, SizeAviary.MIDDLE);
        HerbivoreAviary herbivoreAviary2 = new HerbivoreAviary("Вольер для уток", 4, 8, SizeAviary.SMALL);
        HerbivoreAviary herbivoreAviary3 = new HerbivoreAviary("Вольер для слонов", 2, 12, SizeAviary.LARGE);
        carnivorousAviary1.addAnimal(alex);
        carnivorousAviary1.addAnimal(martin);
        carnivorousAviary2.addAnimal(leysan);
        carnivorousAviary2.addAnimal(shiva);
        herbivoreAviary1.addAnimal(melman);
        herbivoreAviary1.addAnimal(gloriya);
        herbivoreAviary2.addAnimal(donald);
        herbivoreAviary3.addAnimal(nepal);
        herbivoreAviary3.addAnimal(kali);
        carnivorousAviary1.getAnimal("Алекс");
        carnivorousAviary1.getAnimal("Мартин");
        carnivorousAviary2.getAnimal("Лейсан");
        carnivorousAviary2.getAnimal("Шива");
        herbivoreAviary1.getAnimal("Мелман");
        herbivoreAviary1.getAnimal("Глория");
        herbivoreAviary2.getAnimal("Дональд");
        herbivoreAviary3.getAnimal("Непал");
        herbivoreAviary3.getAnimal("Кали");
        try {
            foodAnimal(alex);
        } catch (WrongFoodException exception) {
            System.out.println(exception.getMessage());
        }
        try {
            foodAnimal(melman);
        } catch (WrongFoodException exception) {
            System.out.println(exception.getMessage());
        }
    }
}


