package jborn.s03;

import java.util.Scanner;

/*
 * Из консоли вводится строка, содержащая символы верхнего и нижнего регистра. Символы верхнего регистра заменить на
 * нижний и наоборот. Например:
 * Строка: jBoRn
 * Результат инверсии: JbOrN
 * */

public class Task7 {
    public static void main(String[] args) {
        char[] chars = requestNumber().toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i])) {
                chars[i] = Character.isLowerCase(chars[i])
                        ? Character.toUpperCase(chars[i])
                        : Character.toLowerCase(chars[i]);
            }
        }
        System.out.printf("Результат инверсии: %s", new String(chars));
    }

    private static String requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        return scanner.next();
    }
}
