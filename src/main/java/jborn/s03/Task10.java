package jborn.s03;

import java.util.Locale;
import java.util.Scanner;

/*
 * Из консоли вводится предложение. Определить ошибся ли автор в написании "Жи/Ши пиши с буквой и".
 * */

public class Task10 {
    public static void main(String[] args) {
        String line = requestString();
        System.out.println(line.toLowerCase(Locale.ROOT)
                .matches("(.*)жы(.*)|(.*)шы(.*)") ? "Жи/Ши пиши с буквой и!" : "Ошибок нет!");
    }

    private static String requestString() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        return scanner.nextLine();
    }
}
