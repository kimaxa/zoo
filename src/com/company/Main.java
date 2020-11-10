package com.company;
import com.company.animals.*;
import com.company.aviaries.Aviary;
import com.company.food.HerbivoreFood;
import com.company.food.CarnivorousFood;

public class Main {

    public static void main(String[] args) {
        //Создание вольеров.


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
    lion.growl();
    lion.rumble();
    tiger.play();
    tiger.growl();
    tiger.rumble();

    elephant.play();
    elephant.rejoice();
    elephant.rumble();
    duck.play();
    duck.rumble();
    duck.rejoice();
    zebra.play();
    zebra.rejoice();
    zebra.rumble();



    }
}
