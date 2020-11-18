package com.company.animals;
import com.company.aviaries.SizeAviary;
import java.util.Scanner;

public class Lion extends Carnivorous {

    public Lion(String name, SizeAviary sizeAviary) {
        super(name, SizeAviary.BIG);
    }
    @Override
    public void play() {
        Scanner scanner = new Scanner(System.in);
        String game = scanner.nextLine();
        System.out.println("Введите игру для Lion: " + game);
        System.out.println("Играю в " + game);
    }
    @Override
    public void growl(){
        System.out.println("Ааарррр!");
        super.growl();
    }

}
