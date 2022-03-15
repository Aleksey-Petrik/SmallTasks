package jborn.s02;

import java.util.Scanner;

/*
* Дано двузначное число - N (N - вводится с клавиатуры). Найти:
* а) число десятков в нем;
* б) число единиц в нем;
* в) сумму его цифр;
* г) произведение его цифр.
* */

public class Task3 {

    public static void main(String[] args) {
        int number = requestNumber();
        int tens = number / 10;
        int units = number % 10;
        System.out.printf("Число десятков - %d, число единиц - %d, сумма цифр - %d, произведение цифр - %d", tens, units, tens + units, tens * units);
    }

    private static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }
}
