package jborn.s03;

import java.util.Scanner;

/*
* Из консоли вводится строка. Определить является ли строка палиндромом (например: мадам, комок, ротор).
* */

public class Task5 {
    public static void main(String[] args) {
        String line = requestNumber();
        System.out.printf("Строка %s палиндромом", isPalindrom(line) ? "является" : "не является");
    }

    private static boolean isPalindrom(String line) {
        return line.equals(new StringBuilder(line).reverse().toString());
    }

    private static String requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        return scanner.next();
    }
}
