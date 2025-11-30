package pr9;

import java.util.Random;

public class HomeWork2 {
    public static void main(String[] args) {
        // 1. Подготовка массива на 100 000 элементов
        int size = 100000;
        double[] list = new double[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            list[i] = random.nextDouble() * 1000;
        }

        // 2. Создаем секундомер
        StopWatch stopWatch = new StopWatch();

        System.out.println("Начинаем сортировку " + size + " элементов...");

        // 3. Засекаем время
        stopWatch.start();

        // 4. Выполняем сортировку выбором (Selection Sort)
        selectionSort(list);

        // 5. Останавливаем время
        stopWatch.stop();

        // 6. Вывод результата
        System.out.println("Сортировка завершена.");
        System.out.println("Затраченное время: " + stopWatch.getElapsedTime() + " миллисекунд");
        System.out.println("Это примерно: " + (stopWatch.getElapsedTime() / 1000.0) + " секунд");
    }

    // Реализация метода сортировки выбором
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Находим индекс минимального элемента
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < currentMin) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Если нашли элемент меньше текущего, меняем их местами
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
