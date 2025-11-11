package pr7;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Task1 {
    public static void main(String[] args) {
        String developerLastName = "Иванов";

        // Дата и время получения задания (можно установить любую)
        // new Date() создаст объект с текущей датой и временем.
        // Для примера установим фиксированную дату.
        // Используем System.currentTimeMillis() для получения текущего времени в миллисекундах
        Date assignmentReceivedDate = new Date(1730995200000L); // Пример: 7 ноября 2025

        // Дата и время сдачи задания (текущие)
        Date assignmentSubmittedDate = new Date();

        // Форматирование даты для красивого вывода
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy, HH:mm:ss z");

        System.out.println("Фамилия разработчика: " + developerLastName);
        System.out.println("Дата и время получения задания: " + dateFormat.format(assignmentReceivedDate));
        System.out.println("Дата и время сдачи задания: " + dateFormat.format(assignmentSubmittedDate));
    }
}