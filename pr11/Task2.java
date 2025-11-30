package pr11;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        // Вызов рекурсивной функции
        recursion(n);
    }

    public static void recursion(int n) {
        // Базовый случай: если n = 1, выводим 1 и выходим
        if (n == 1) {
            System.out.print("1 ");
            return;
        }

        // Шаг рекурсии: сначала выводим все числа до n-1
        recursion(n - 1);

        // А затем выводим само число n
        System.out.print(n + " ");
    }
}
