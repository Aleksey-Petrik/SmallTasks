package jborn.s03;

import java.util.Scanner;

/*
 * Нарисовать в консоли прямоугольник с 2-мя заданными сторонами. Стороны (целые числа) запрашиваются из консоли A и B. Например A=10 и B=5, то вывести:
 **********
 *        *
 *        *
 *        *
 **********
 * */

public class Task4 {
    public static void main(String[] args) {
        int length = requestNumber("Введите длину: ");
        int height = requestNumber("Введите высоту: ");

        for (int i = 0; i < height; i++) {
            System.out.printf("*%s*%n", repeatSymbol(i == 0 || i == height - 1 ? '*' : ' ', length - 2));
        }
    }

    private static String repeatSymbol(char symbol, int length) {
        StringBuilder word = new StringBuilder();
        for (int j = 0; j < length; j++) {
            word.append(symbol);
        }
        return word.toString();
    }

    private static int requestNumber(String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);
        return scanner.nextInt();
    }
}
