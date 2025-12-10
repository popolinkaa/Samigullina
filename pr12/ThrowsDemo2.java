package pr12;

import java.util.Scanner;

public class ThrowsDemo2 {
    public static void main(String[] args) {
        ThrowsDemo2 demo = new ThrowsDemo2();
        demo.getKey();
    }

    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean success = false;

        // Задание №8 п.3: Цикл для повторной попытки
        while (!success) {
            try {
                System.out.print("Enter Key: ");
                String key = myScanner.next();
                printDetails(key);
                success = true; // Если дошли сюда, значит исключения не было
            } catch (Exception e) {
                // Задание №8 п.2: Перехват ошибки здесь
                System.out.println("Поймано исключение: " + e.getMessage());
                System.out.println("Попробуйте еще раз.");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            // Просто пробрасываем исключение дальше наверх
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        // Допустим, пустая строка - это ошибка (по логике задания из PDF)
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        // Для теста: давай выбрасывать ошибку, если ввели "error"
        if (key.equals("error")) {
            throw new Exception("Key set to 'error'");
        }
        return "data for " + key;
    }
}
