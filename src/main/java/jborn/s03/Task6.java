package jborn.s03;

import java.util.Scanner;

/*
* Из консоли вводится строка и символ. Определить сколько раз встречается данный символ и заменить в строке этот символ
* на верхний регистра, например, str="java" и ch='a', то результат:
* Кол-во вхождений: 2
* Преобразованная строка: jAvA
* */

public class Task6 {
    public static void main(String[] args) {
        char[] chars = requestNumber("Введите строку: ").toCharArray();
        char symbol = requestNumber("Введите символ: ").charAt(0);

        int countSymbol = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == symbol && Character.isLowerCase(chars[i])) {
                chars[i] = Character.toUpperCase(symbol);
                countSymbol++;
            }
        }
        System.out.printf("Кол-во вхождений: %d%nПреобразованная строка: %s", countSymbol, new String(chars));
    }

    private static String requestNumber(String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(description);
        return scanner.next();
    }
}
