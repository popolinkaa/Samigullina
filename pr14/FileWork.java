package pr14;

import java.io.*;
import java.util.Scanner;

public class FileWork {
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- МЕНЮ ---");
            System.out.println("1. Записать в файл (перезаписать)");
            System.out.println("2. Прочитать файл");
            System.out.println("3. Добавить в конец файла");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Введите текст для записи: ");
                    String text = scanner.nextLine();
                    writeToFile(text, false); // false = перезапись
                    break;
                case "2":
                    readFromFile();
                    break;
                case "3":
                    System.out.print("Введите текст для добавления: ");
                    String appendText = scanner.nextLine();
                    writeToFile(appendText, true); // true = добавление (append)
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Неверный ввод.");
            }
        }
    }

    // Метод для ЗАПИСИ (реализует задания 1, 3 и 4)
    // Параметр append: false - перезаписать, true - добавить в конец
    public static void writeToFile(String text, boolean append) {
        // Используем try-with-resources (автоматически закрывает файл)
        try (FileWriter writer = new FileWriter(FILE_NAME, append)) {
            writer.write(text);
            writer.write('\n'); // Добавляем перенос строки для красоты
            System.out.println("Успешно записано!");
        } catch (IOException e) {
            System.out.println("Ошибка при записи: " + e.getMessage());
        }
    }

    // Метод для ЧТЕНИЯ (реализует задание 2)
    public static void readFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("Файл еще не создан. Сначала запишите что-нибудь.");
            return;
        }

        System.out.println("--- Содержимое файла ---");
        try (FileReader reader = new FileReader(FILE_NAME)) {
            int c;
            // Читаем посимвольно, пока не дойдем до конца (-1)
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println("\n--- Конец файла ---");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении: " + e.getMessage());
        }
    }
}