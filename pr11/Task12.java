package pr11;

import java.util.Scanner;

public class Task12{
    public static void main(String[] args) {
        System.out.println("Введите последовательность чисел (завершите нулем):");
        recursion(); // Просто вызываем функцию, как сказано в задании
    }

    public static void recursion() {
        Scanner scanner = new Scanner(System.in);

        // Считываем одно число
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            // Базовый случай: если встретили 0, останавливаемся
            if (n == 0) {
                return;
            }

            // Логика задачи: если нечетное - выводим
            if (n % 2 != 0) {
                System.out.println(n);
            }

            // Шаг рекурсии: вызываем функцию снова для следующего числа
            recursion();
        }
    }
}