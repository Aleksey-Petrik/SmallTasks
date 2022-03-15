package jborn.s02;

import java.util.Scanner;

import static java.lang.Math.*;

/*
* Рассчитать значение Y при заданном значении X (X - вводится с клавиатуры). Синус рассчитывать методом Math.sin(double a)
* */

public class Task7 {

    public static void main(String[] args) {
        int x = requestNumber();
        double y = x > 0 ? (1 - cos(2) * x) / 2 : 1 - 2 * sin(pow(x, 2));
        System.out.printf("y = %f", y);
    }

    private static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
