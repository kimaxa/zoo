package com.company;
import com.company.animals.*;
import com.company.aviaries.Aviary;
import com.company.aviaries.CarnivorousAviary;
import com.company.aviaries.HerbivoreAviary;
import com.company.food.HerbivoreFood;
import com.company.food.CarnivorousFood;
import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Main {

    public static void main(String[] args) {
        //Создание вольеров.
	Aviary<Carnivorous> carnivorousAviary = new CarnivorousAviary(3);
	Aviary<Herbivore> herbivoreAviary = new HerbivoreAviary(3);
	    //Добавление животных в вольер.
	carnivorousAviary.addAnimal(new Lion());
	carnivorousAviary.addAnimal(new Tiger());
	herbivoreAviary.addAnimal(new Elephant());
	herbivoreAviary.addAnimal(new Zebra());
	herbivoreAviary.addAnimal(new Duck());
	    //Тип еды.
    HerbivoreFood herbivoreFood = new HerbivoreFood();
    CarnivorousFood carnivorousFood = new CarnivorousFood();
        //Животные.
    Zebra zebra = new Zebra();
    Duck duck = new Duck();
    Elephant elephant = new Elephant();
    Lion lion = new Lion();
    Tiger tiger = new Tiger();
        //Методы животных.
    zebra.eat(new HerbivoreFood());
    duck.eat(new HerbivoreFood());
    elephant.eat(new HerbivoreFood());
    tiger.eat(new CarnivorousFood());
    lion.eat(new CarnivorousFood());
    lion.play();
    tiger.play();
    elephant.play();
    duck.play();
    zebra.play();
        //Отображение животных в вальерах.
    herbivoreAviary.printAllAnimals();
    carnivorousAviary.printAllAnimals();


    }
}
