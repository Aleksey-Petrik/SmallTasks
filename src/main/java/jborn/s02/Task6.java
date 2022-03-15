package jborn.s02;

import java.util.Scanner;

import static java.lang.Math.*;

/*
* Написать функцию, которая считает площадь круга, а также длину окружности по его радиусу - R (вводится с клавиатуры).
* */

public class Task6 {
    public static void main(String[] args) {
        int radius = requestNumber();
        System.out.printf("Площадь - %.3f, Длина - %.3f", calcSqrCircle(radius), calcLengthCircle(radius));
    }

    private static double calcSqrCircle(int radius) {
        return PI * pow(radius, 2);
    }

    private static double calcLengthCircle(int radius) {
        return 2 * PI * radius;
    }

    private static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рас окружности:");
        return scanner.nextInt();
    }
}
