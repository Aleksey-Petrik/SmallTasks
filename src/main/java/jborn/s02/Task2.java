package jborn.s02;

import java.util.Scanner;

/*
* С начала суток прошло N секунд (N - вводится с клавиатуры). Определить:
* а) сколько полных часов прошло с начала суток;
* б) сколько полных минут прошло с начала очередного часа;
* в) сколько полных секунд прошло с начала очередной минуты.
* */

public class Task2 {

    public static void main(String[] args) {
        int seconds = requestNumber();
        System.out.printf("Прошло полны часов - %d, минут - %d, секунд - %d", getPassedHour(seconds), getPassedMinutes(seconds), getPassedSeconds(seconds));
    }

    private static int requestNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        return scanner.nextInt();
    }

    private static int getPassedSeconds(int seconds) {
        return seconds % 60;
    }

    private static int getPassedMinutes(int seconds) {
        return seconds / 60 % 60;
    }

    private static int getPassedHour(int seconds) {
        return seconds / 60 / 60;
    }

}
