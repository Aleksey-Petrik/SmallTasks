package jborn.s02;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
* Известны координаты двух точек (x1, y1) и (x2, y2) - вводятся с клавиатуры. Составить программу вычисления расстояния между ними.
* */

public class Task4 {

    public static void main(String[] args) {
        int x1 = requestNumber("x1");
        int y1 = requestNumber("y1");
        int x2 = requestNumber("x2");
        int y2 = requestNumber("y2");
        System.out.println("Расстояние между точками составляет - " + calcDistancePoints(x1, y1, x2, y2));
    }

    private static double calcDistancePoints(int x1, int y1, int x2, int y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    private static int requestNumber(String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Введите число(%s): ", description);
        return scanner.nextInt();
    }
}
