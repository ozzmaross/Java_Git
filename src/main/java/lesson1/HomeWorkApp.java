package lesson1;

import java.sql.SQLOutput;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
    }
    private static void compareNumbers() {
        int a = ThreadLocalRandom.current().nextInt(0,1000);
        int b = 35;
        if (a >= b) {
            System.out.println(a +" a >= b"); // a+ доначение
        }
        //   if (a < b)
        else {
            System.out.println(a +" a < b");
        }
    }
    private static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("red");
        }
        else if  (value > 0 &&  value <= 100){
            System.out.println("yellow");
        }
        else if (value > 100) {
            System.out.println("green");
        }
    }
    private static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    private static void checkSumSing() {
        int a = 5;
        int b = 8;
        int Sum = a + b;
        if (Sum < 0) {
            System.out.println("Сумма отрицательная");
        }
        if (Sum >= 0) {
            System.out.println("Сумма положительная");
        }
    }
}
