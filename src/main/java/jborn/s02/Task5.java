package jborn.s02;

import java.util.Scanner;

import static java.lang.Math.*;

/*
* С клавиатуры вводится три целых числа X, Y, Z. Определить являются ли эти числа тройкой Пифагора. Изначально неизвестно какое из чисел гипотенуза.
* */

public class Task5 {

    public static void main(String[] args) {
        int a = requestNumber();
        int b = requestNumber();
        int c = requestNumber();

        if (isPythagoreanTriple(a, b, c) || isPythagoreanTriple(b, c, a) || isPythagoreanTriple(c, a, b)) {
            System.out.println("Числа являются тройкой Пифагора!");
        } else {
            System.out.println("Числа не являются тройкой Пифагора!");
        }
    }

    private static boolean isPythagoreanTriple(int a, int b, int c) {
        return pow(a, 2) + pow(b, 2) == pow(c, 2);
    }

    private static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }

}
