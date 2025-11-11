package pr7;

import java.util.Date;
import java.util.GregorianCalendar;

public class Task3 {
    public static void main(String[] args) {
        // Создаем дату рождения для студента
        Date dob = new GregorianCalendar(2005, 4, 15).getTime(); // 15 мая 2005
        Student student = new Student("Петров Петр", dob);

        System.out.println(student.toString()); // Вывод через переопределенный toString()

        System.out.println("\n--- Различные форматы даты рождения ---");
        System.out.println("Короткий формат: " + student.getFormattedBirthDate("short"));
        System.out.println("Средний формат:  " + student.getFormattedBirthDate("medium"));
        System.out.println("Полный формат:   " + student.getFormattedBirthDate("full"));
    }
}