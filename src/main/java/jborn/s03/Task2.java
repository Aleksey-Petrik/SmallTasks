package jborn.s03;

import java.util.Random;
import java.util.Scanner;

/*
* Написать программу, которая выводит последовательность рандомных целых чисел (ПИН-код) по количеству регистров,
* которые вводятся из консоли. Например, N=7 (N-вводится из консоли). Результат: 5412409.
* */

public class Task2 {
    public static void main(String[] args) {
        System.out.printf("Pin - %s", generatePin(requestNumber()));
    }

    private static String generatePin(int length) {
        StringBuilder pin = new StringBuilder();
        Random randomNumber = new Random();
        for (int i = 0; i < length; i++) {
            pin.append(randomNumber.nextInt(10));
        }
        return pin.toString();
    }

    private static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
