package ru.geekbrains.javaone.lesson_2;

// Мартюшов Сергей
// Домашнее задание по уроку 2

import java.util.Arrays;

public class HomeWork_2 {

    /*Задать пустой целочисленный массив размером 8.
    Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;*/

    private static String fill() {
        int[] fill = new int[8];
        for(int i = 0; i < fill.length; i++) {
            fill[i] = i*3 +1;
        }
        return (Arrays.toString(fill));
    }

    /*Задать целочисленный массив, состоящий из элементов 0 и 1.
     Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
     Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;*/

    private static String replace() {
        int[] replace = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for(int i = 0; i < replace.length; i++) {
            if(replace[i] > 0) {
                replace[i] = 0;
            } else {
                replace[i] = 1;
            }
        }
        return (Arrays.toString(replace));
    }

    /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
    написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;*/

    private static String multi() {
        int[] multi = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for(int i = 0; i < multi.length; i++)
            if(multi[i] < 6) {
                multi[i] = multi[i]* 2;
            }else {
                multi[i] = multi[i];
            }
        return (Arrays.toString(multi));
    }

    /*Задать одномерный массив.
    Написать методы поиска в нём минимального и максимального элемента;*/

    private static String maxMin() {
        int[] maxMin = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int max = maxMin[0];
        int min = maxMin[0];
        for(int i = 0; i < maxMin.length; i++) {
            if(max > maxMin[i]) {
                max = max;
            } else {
                max = maxMin[i];
            }
            if(min < maxMin[i]) {
                min = min;
            } else {
                min = maxMin[i];
            }
        }
        return ("Max " + max + "\n" + "Min " + min);
    }


    public static void main(String[] args) {
        System.out.println(fill());
        System.out.println(replace());
        System.out.println(multi());
        System.out.println(maxMin());
        int n = 10;
        quad(n,n);
//        System.out.println(checkBalance());
//        6 и 7 задание не смог решить
    }

    /*Создать квадратный целочисленный массив
     (количество строк и столбцов одинаковое),
     заполнить его диагональные элементы единицами, используя цикл(ы);*/

    private static void quad(int width, int height) {
        for(int i = 0; i <= width; i++){
            for(int j = 0; j <= height; j++){
                if(i == j) {
                    System.out.print(1 + "\t");
                } else if(j == width - i) {
                    System.out.print(1 + "\t");
                } else{
                    System.out.print(0 + "\t");
                }
            }
            System.out.println();
        }
    }

    /*Написать метод, в который передается не пустой одномерный целочисленный массив,
     метод должен вернуть true если в массиве есть место, в котором сумма левой и правой части массива равны.
     Примеры: checkBalance([1, 1, 1, || 2, 1]) → true, checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true.
     Абстрактная граница показана символами ||, эти символы в массив не входят.*/

    /*private static String checkBalance() {
        int[] checkBalance = {1, 1, 1, 2, 1};
        int sum = 0;
        for(int i = 0; i < checkBalance.length; i++) {
            sum += checkBalance[i];
            if(sum % 2 != 0){
                System.out.println("false");
            } else if(( checkBalance[0] || checkBalance[0] + checkBalance[i]) == (sum / 2)) {
                System.out.println("true");
            } else {
                System.out.println("falce");
            }
        }
        return (checkBalance());
    }*/

    /*Написать метод, которому на вход подаётся одномерный массив и число n
    (может быть положительным, или отрицательным),
    при этом метод должен циклически сместить все элементы массива на n позиций.*/

}