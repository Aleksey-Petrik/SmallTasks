package jborn.s03;

import java.util.Scanner;

/*
* Из консоли вводится массив строк (вспомним как в первом занятии вводили массивы, сначала размер, потом по элементу), вывести все введенные строки через запятую. Учесть что на краях новой строки не должно быть запятых. Например:
* Введите кол-во строк: 3
* Строка 0: красный
* Строка 1: синий
* Строка 2: жельтый
* Результат: красный, синий, жельтый
* */

public class Task9 {
    public static void main(String[] args) {
        int length = Integer.parseInt(requestString("Введите кол-во строк: "));
        String[] lines = new String[length];
        for (int i = 0; i < length; i++) {
            lines[i] = requestString(String.format("Строка %d: ", i));
        }
        System.out.printf("Результат: %s", concatLines(lines));
    }

    private static String concatLines(String[] lines) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            sb.append(lines[i]).append(i < lines.length - 1 ? ", " : "");
        }
        return sb.toString();
    }

    private static String requestString(String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(description);
        return scanner.next();
    }
}
