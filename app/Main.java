package app;

import model.Cat;
import enums.FurColor;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat(
                "Leon",
                3,
                11,
                FurColor.ORANGE_TABBY,
                true,
                "Peixe",
                25,
                true
        );

        cat.displayInfo();
        System.out.println();

        cat.makeSound();
        cat.sleep();
        cat.purr();

        System.out.println();

        cat.move(5, 20);
        cat.move(3, "rato");

        System.out.println();

        cat.loseLife();
        cat.loseLife();
    }
}