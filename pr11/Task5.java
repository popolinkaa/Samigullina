package pr11;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scanner.nextInt();

        System.out.println("Сумма цифр: " + sum(n));
    }

    public static int sum(int n) {
        // Базовый случай: если число состоит из одной цифры
        if (n < 10) {
            return n;
        }

        // Шаг рекурсии: последняя цифра + сумма остальных цифр
        return n % 10 + sum(n / 10);
    }
}