package javastart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputFromLine = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = inputFromLine.nextInt();

        System.out.print("Введите второе число: ");
        int second = inputFromLine.nextInt();

        System.out.println("Сумма = " + sum(first, second));
    }
    public static int sum(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;

    }


}
