package com.company.animals;
import com.company.aviaries.SizeAviary;
import java.util.Scanner;

public class Elephant extends Herbivore {
    public Elephant(String name, SizeAviary size) {
        super(name, SizeAviary.LARGE);
    }
    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        String game = scanner.nextLine();
        System.out.println("Введите игру для Elephant: " + game);
        System.out.println("Играю в " + game);
    }
}
