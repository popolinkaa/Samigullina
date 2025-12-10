package pr14;

import java.util.ArrayList;

public class Task1_ArrayList {
    public static void main(String[] args) {
        // Создаем список строк
        ArrayList<String> fruits = new ArrayList<>();

        // 1. Добавление
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add(1, "Груша"); // Вставка по индексу

        System.out.println("Исходный список: " + fruits);

        // 2. Получение элемента
        System.out.println("Элемент под индексом 2: " + fruits.get(2));

        // 3. Замена элемента
        fruits.set(0, "Киви");

        // 4. Удаление
        fruits.remove("Апельсин"); // По объекту
        fruits.remove(1);          // По индексу (удалит Банан, т.к. индексы сместились)

        System.out.println("Список после изменений: " + fruits);

        // 5. Проверка наличия
        if (fruits.contains("Киви")) {
            System.out.println("Киви есть в списке!");
        }

        // 6. Размер
        System.out.println("Всего фруктов: " + fruits.size());
    }
}
