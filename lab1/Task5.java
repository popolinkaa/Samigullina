package ru.mirea.lab1;

public class Task5 {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Факториал " + number + " = " + factorial(number));
    }
}
