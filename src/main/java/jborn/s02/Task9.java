package jborn.s02;

import java.util.Scanner;

/*
* Дано число произвольной длины - N (вводится с клавиатуры). Найти сумму его цифр.
* */

public class Task9 {
    public static void main(String[] args) {
        int value = requestNumber();
        System.out.printf("Сумма чисел %d равна %d", value, sumNumbers(value));
    }

    private static int sumNumbers(int value) {
        return value > 0 ? value % 10 + sumNumbers(value / 10) : 0;
    }

    private static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
