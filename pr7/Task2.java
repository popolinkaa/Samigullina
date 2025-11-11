package pr7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        System.out.println("=== Задание 2 ===");
        System.out.println("Введите дату и время для сравнения (формат yyyy-MM-dd HH:mm):");
        String s = sc.nextLine().trim();

        Date userDate;
        try {
            userDate = fmt.parse(s);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты. Программа завершена.");
            return;
        }

        Date now = new Date();

        System.out.println("Текущая дата/время: " + fmt.format(now));
        System.out.println("Введённая дата/время: " + fmt.format(userDate));

        if (userDate.before(now)) {
            System.out.println("Введённая дата раньше текущей.");
        } else if (userDate.after(now)) {
            System.out.println("Введённая дата позже текущей.");
        } else {
            System.out.println("Введённая дата равна текущей (с точностью до минут).");
        }

        long diffMillis = Math.abs(now.getTime() - userDate.getTime());
        long days = TimeUnit.MILLISECONDS.toDays(diffMillis);
        long hours = TimeUnit.MILLISECONDS.toHours(diffMillis) - TimeUnit.DAYS.toHours(days);
        long minutes = TimeUnit.MILLISECONDS.toMinutes(diffMillis) - TimeUnit.DAYS.toMinutes(days) - TimeUnit.HOURS.toMinutes(hours);

        System.out.printf("Разница: %d дней, %d часов, %d минут.%n", days, hours, minutes);
    }
}