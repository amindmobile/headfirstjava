package javastart;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainMass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mass = new int[5];

//        for (int i = 0; i < 5; i++) {
//            int newElement = i + 1;
//            mass[i] = newElement;
//            System.out.println("Элемент под индексом: " + i +
//                    " Заполняется значением " + newElement);
//        }

        for (int i = 0; i < 5; i++) {
            int newElement = i + 1;
            mass[i] = newElement;
            System.out.println("Элемент под индексом: " + i +
                    " Заполняется значением " + newElement);
        }
    }

    public static void printMass(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Элемент под индексом: " + i +
                    " Заполняется значением " + mass[i]);
        }
    }
}
