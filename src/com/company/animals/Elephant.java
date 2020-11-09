package com.company.animals;

import com.company.food.Food;

import java.util.Scanner;

public class Elephant extends Herbivore {

    public void eat(Food food) {

    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        String game = scanner.nextLine();
        System.out.println("Введите игру для Elephant: " + game);
        System.out.println("Играю в " + game);
    }
}
