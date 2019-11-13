package ru.geekbrains.javaone.lesson_5;

public class Dog extends Animal {

    public Dog(int run, int swim, float jump){
        super(run, swim, jump);
    }

    protected void drive() {
        super.movie("Песик",500,10, 0.5f);

    }


}
