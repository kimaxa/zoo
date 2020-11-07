package com.company;
import com.company.animals.*;
import com.company.aviaries.Aviary;
import com.company.aviaries.CarnivorousAviary;
import com.company.aviaries.HerbivoreAviary;
import com.company.food.HerbivoreFood;
import com.company.food.CarnivorousFood;

public class Main {

    public static void main(String[] args) {
	Aviary<Carnivorous> carnivorousAviary = new CarnivorousAviary(2);
	Aviary<Herbivore> herbivoreAviary = new HerbivoreAviary(3);
	carnivorousAviary.addAnimal(new Lion());
	carnivorousAviary.addAnimal(new Tiger());
	herbivoreAviary.addAnimal(new Elephant());
	herbivoreAviary.addAnimal(new Zebra());
	herbivoreAviary.addAnimal(new Duck());
	Zebra zebra = new Zebra();
	Duck duck = new Duck();
	Elephant elephant = new Elephant();
	Lion lion = new Lion();
	Tiger tiger = new Tiger();
    HerbivoreFood herbivoreFood = new HerbivoreFood();
    CarnivorousFood carnivorousFood = new CarnivorousFood();
    zebra.eat(new HerbivoreFood());
    duck.eat(new HerbivoreFood());
    elephant.eat(new HerbivoreFood());
    tiger.eat(new CarnivorousFood());
    lion.eat(new CarnivorousFood());

    herbivoreAviary.printAllAnimals();
    carnivorousAviary.printAllAnimals();


    }
}
