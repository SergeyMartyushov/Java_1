package ru.geekbrains.javaone.lesson_1;

public class HomeWork {

    private static int result(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static boolean sumResult(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean negativeNumber(int number) {
        if (number < 0);
        return true;
    }                                                       

    public static void main(String[] args) {
        /*System.out.println("Hello");
        byte a = 2;
        short b = -3;
        int c = 5;
        long d =  92L;
        float e = 3.1f;
        double f = 5.7;
        char g = 101;
        boolean one = true;
        String s = "Hello";

        System.out.print(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(one);
        System.out.println(s);*/
        int res = result(4, 7, 8, 2);
        System.out.println(res);
        boolean Res = sumResult(4, 5);
        System.out.println(Res);
        compar();
        boolean neg = negativeNumber(5);
        System.out.println(neg);
        hello("Bob");
        boolean leap = leapYear(404);
        System.out.println(leap);
    }

    static void compar() {
        int number = 5;
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    static void hello(String name) {
        System.out.println("Привет " + name);
    }

    public static boolean leapYear(int year){
        if((year % 400 == 0) || (year % 4 ==0 && year % 100 !=0)) {
            return true;
        } else {
            return false;
        }
    }





}