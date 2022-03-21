package jborn.s03;

import java.util.Scanner;

/*
 * Инверсия строки. Из консоли вводится строка, реализовать ее инверсию. Не использовать метед reverse(). Например:
 * Строка: "Привет всем моим друзьям!"
 * Результат инверсии: "!мяьзурд миом месв тевирП"
 * */

public class Task8 {
    public static void main(String[] args) {
        System.out.printf("Результат инверсии: %s", reverseString(requestString()));
    }

    private static String reverseString(String line) {
        char[] chars = line.toCharArray();
        int length = chars.length / 2;

        for (int i = 0; i < length; i++) {
            char buffer = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = buffer;
        }
        return new String(chars);
    }

    private static String requestString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        return scanner.nextLine();
    }
}
