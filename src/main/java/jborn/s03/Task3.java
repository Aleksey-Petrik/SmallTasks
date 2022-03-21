package jborn.s03;

import java.util.Scanner;

/*
* Вывести в консоле строки, состоящие из введенных символов. Строка вводится с клавиатуры. Например, слово «колбаса». Результат:
*к
*оо
*ллл
*бббб
*ааааа
*сссссс
*ааааааа
* */

public class Task3 {
    public static void main(String[] args) {
        String line = requestNumber();
        for (int i = 0; i < line.length(); i++) {
            System.out.println(repeatSymbol(line.charAt(i), i));
        }
    }

    private static String repeatSymbol(char symbol, int length) {
        StringBuilder word = new StringBuilder();
        for (int j = 0; j < length + 1; j++) {
            word.append(symbol);
        }
        return word.toString();
    }

    private static String requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        return scanner.next();
    }
}
