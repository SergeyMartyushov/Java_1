package ru.geekbrains.javaone.lesson_5;

public class Main {
    public static void main(String[] args) {
        Bird b = new Bird(5, 0, 0.2f);
        Cat c = new Cat(200, 0, 2);
        Dog d = new Dog(500, 10, 0.5f);

        Animal[] all = {c, d, b};
        for(int i = 0; i < all.length; i++) {
            all[i].drive();
        }

    }
}
