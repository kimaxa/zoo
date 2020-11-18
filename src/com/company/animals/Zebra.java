package com.company.animals;
import com.company.aviaries.SizeAviary;
import com.company.food.Food;
import java.util.Scanner;

public class Zebra extends Herbivore {
    public Zebra(String name, SizeAviary size) {
        super(name, SizeAviary.MIDDLE);
    }
    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        String game = scanner.nextLine();
        System.out.println("Введите игру для Zebra: " + game);
        System.out.println("Играю в " + game);
    }
}
