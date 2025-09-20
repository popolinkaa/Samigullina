package ru.mirea.lab1;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        int i = 0;
        do {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        } while (i < size);

        int sum = 0;
        int min = array[0];
        int max = array[0];
        int j = 0;

        while (j < size) {
            sum += array[j];
            if (array[j] < min) min = array[j];
            if (array[j] > max) max = array[j];
            j++;
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}

