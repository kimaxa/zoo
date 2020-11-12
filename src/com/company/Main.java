package com.company;
import com.company.animals.*;
import com.company.aviaries.Aviary;
import com.company.aviaries.CarnivorousAviary;
import com.company.aviaries.HerbivoreAviary;
import com.company.food.HerbivoreFood;
import com.company.food.CarnivorousFood;

public class Main {

    public static void main(String[] args) {
    CarnivorousAviary carnivorousAviary1 = new CarnivorousAviary(3);
    CarnivorousAviary carnivorousAviary2 = new CarnivorousAviary(3);
    HerbivoreAviary herbivoreAviary1 = new HerbivoreAviary(1);
    HerbivoreAviary herbivoreAviary2 = new HerbivoreAviary(2);
    HerbivoreFood herbivoreFood = new HerbivoreFood();
    CarnivorousFood carnivorousFood = new CarnivorousFood();
    Zebra zebra1 = new Zebra();
    Zebra zebra2 = new Zebra();
    Duck duck = new Duck();
    Elephant elephant = new Elephant();
    Lion lion = new Lion();
    Tiger tiger = new Tiger();
    zebra1.eat(new HerbivoreFood());
    zebra2.eat(new HerbivoreFood());
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
    zebra1.play();
    zebra1.rejoice();
    zebra1.rumble();
    zebra2.play();
    zebra2.rejoice();
    zebra2.rumble();

    }
}
