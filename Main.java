package ru.geekbrains.javaone.lesson_6;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream f1 = new FileOutputStream("file1.txt", true);
            FileInputStream f2 = new FileInputStream("file2.txt");
            int i;
            while((i = f2.read()) != -1) {
                f1.write(i);
            }

            f1.close();
            f2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово для поиска: ");
        String word = scanner.nextLine();

        try{
            FileInputStream f1 = new FileInputStream("file1.txt");
            int i;
            while ((i = f1.read()) != -1) {
                    if (word.equals(f1)) {
                    System.out.println("Слово найдено");
                    break;
                } else {
                    System.out.println("Слово отстутствует");
                }
            }

            f1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
