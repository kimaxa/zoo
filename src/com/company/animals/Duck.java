package com.company.animals;
import com.company.aviaries.SizeAviary;
import java.util.Scanner;

public class Duck extends Herbivore {
    public Duck(String name, SizeAviary size) {
        super(name, SizeAviary.SMALL);
    }

    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        String game = scanner.nextLine();
        System.out.println("Введите игру для Duck: " + game);
        System.out.println("Играю в " + game);
    }
    @Override
    public void rejoice() {
        System.out.println("Кря-кря");
    }
}

