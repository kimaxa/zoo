package com.company.animals;

import com.company.food.Food;

import java.util.Scanner;

public class Tiger extends Carnivorous {

    public void eat(Food food) {
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        String game = scanner.nextLine();
        System.out.println("Введите игру для Tiger " + game);
        System.out.println("Играю в " + game);
    }
}
