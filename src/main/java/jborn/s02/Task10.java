package jborn.s02;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
* Написать программу, которая вычисляет сумму всех четных элементов массива и произведение всех нечетных элементов массива
* (проверять четность и нечетность индекса). Размер массива и сам массив вводится с клавиатуры.
* */

public class Task10 {
    public static void main(String[] args) {
        int[] numbers = new int[requestNumber("Размер массива: ")];
        fillArray(numbers);
        int sum = 0;
        int multiply = numbers.length > 1 ? 1 : 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum += numbers[i];
            } else {
                multiply *= numbers[i];
            }
        }
        System.out.printf("Сумма = %d, Произведение = %d", sum, multiply);
    }

    private static void fillArray(int[] array) {
        IntStream.rangeClosed(0, array.length - 1).forEach(i -> array[i] = requestNumber("Элемент массива: "));
    }

    private static int requestNumber(String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);
        return scanner.nextInt();
    }
}
