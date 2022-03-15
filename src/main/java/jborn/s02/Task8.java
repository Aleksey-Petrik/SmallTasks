package jborn.s02;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
* С клавиатуры вводится число - N, необходимо написать программу, которая выводит таблицу умножения чисел от 1 до 10 на заданное число.
* */

public class Task8 {

    public static void main(String[] args) {
        int value = requestNumber();
        IntStream.rangeClosed(1, 10).forEach(i -> System.out.printf("%d * %d = %d%n", i, value, i * value));
    }

    private static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
