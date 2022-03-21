package jborn.s03;

import java.util.Scanner;

/*
* Составить программу, которая запрашивает из консоли название государства и его столицы, а затем выводит сообщение:
* "Столица государства ... — город ..." (на месте многоточий должны быть выведены соответствующие значения).
* */

public class Task1 {
    public static void main(String[] args) {
        String country = requestNumber("Введите государства: ");
        String capitalCity = requestNumber("Введите столицу: ");

        System.out.printf("Столица государства %s — город %s", country, capitalCity);
    }

    private static String requestNumber(String description) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(description);
        return scanner.next();
    }
}
