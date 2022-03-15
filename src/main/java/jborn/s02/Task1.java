package jborn.s02;

import java.util.Scanner;

/*
* С клавиатуры вводится расстояние в сантиметрах - N. Найти число полных метров в нем.
* */

public class Task1 {
    private static final int METRE = 100;

    public static void main(String[] args) {
        int centimetre = requestNumber();
        System.out.printf("Полных метров в %d см. составляет %d м.", centimetre, centimetre / METRE);
    }

    private static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
