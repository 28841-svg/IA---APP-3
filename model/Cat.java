package model;

import enums.FurColor;
import enums.Habitat;

public class Cat extends Animal {

    private int lives;
    private FurColor furColor;
    private boolean isIndoor;
    private String favoriteFood;
    private int purringFrequency;
    private boolean isNeutered;

    public Cat(String name, int age, double weight,
               FurColor furColor, boolean isIndoor,
               String favoriteFood, int purringFrequency,
               boolean isNeutered) {

        super(name, 30, age, weight,
                isIndoor ? Habitat.DOMESTIC : Habitat.URBAN,
                !isIndoor);

        this.lives = 7;
        this.furColor = furColor;
        this.isIndoor = isIndoor;
        this.favoriteFood = favoriteFood;
        this.purringFrequency = purringFrequency;
        this.isNeutered = isNeutered;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() +
                "Miau" +
                purringFrequency + " Hz)");
    }

    @Override
    public void sleep() {
        System.out.println(getName() +
                " Encontra o lugar mais quente e dorme por 14 horas");
    }

    // OVERLOAD
    public void move(int distance, int speed) {
        System.out.println(getName() +
                " pulou " + distance +
                " metros em " + speed + " km/h.");
    }

    // OVERLOAD
    public void move(int distance, String target) {
        System.out.println(getName() +
                " aproximou em silencio" +
                target + " para " +
                distance + " metros");
    }

    public void purr() {
        System.out.println(getName() +
                " esta ronronando " +
                purringFrequency + " Hz");
    }

    public void loseLife() {

        if (lives > 0) {
            lives--;

            System.out.println(getName() +
                    " Perdeu uma vida e Restante " +
                    lives);
        } else {
            System.out.println(getName() +
                    " nao tem mais vidas");
        }

    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Lives:          " + lives);
        System.out.println("Fur color:      " + furColor.getDisplayName());
        System.out.println("Indoor:         " + (isIndoor ? "Sim" : "Nao"));
        System.out.println("Favorite food:  " + favoriteFood);
        System.out.println("Purring freq:   " + purringFrequency + " Hz");
        System.out.println("Neutered:       " + (isNeutered ? "Sim" : "Nao"));
    }

    // Getters

    public int getLives() {
        return lives;
    }

    public FurColor getFurColor() {
        return furColor;
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getPurringFrequency() {
        return purringFrequency;
    }

    public boolean isNeutered() {
        return isNeutered;
    }
}