package pr7;

import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("Введите месяц (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Введите число: ");
        int day = scanner.nextInt();

        System.out.print("Введите часы (0-23): ");
        int hours = scanner.nextInt();

        System.out.print("Введите минуты (0-59): ");
        int minutes = scanner.nextInt();

        // Создание объекта Calendar
        // Важно: в Calendar месяцы нумеруются с 0 (Январь) до 11 (Декабрь)
        Calendar calendar = new GregorianCalendar(year, month - 1, day, hours, minutes);

        // Получение объекта Date из Calendar
        Date date = calendar.getTime();

        // Форматированный вывод для проверки
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        System.out.println("\nСозданный объект Date: " + sdf.format(date));
        System.out.println("Созданный объект Calendar: " + sdf.format(calendar.getTime()));

        scanner.close();
    }
}
