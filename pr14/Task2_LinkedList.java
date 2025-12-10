package pr14;

import java.util.LinkedList;

public class Task2_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<>();

        // 1. Стандартное добавление
        states.add("Германия");
        states.add("Франция");

        // 2. Специфические методы LinkedList (в начало/в конец)
        states.addFirst("Испания");
        states.addLast("Италия");

        System.out.println("Весь список: " + states);

        // 3. Получение первого и последнего
        System.out.println("Первый: " + states.getFirst());
        System.out.println("Последний: " + states.getLast());

        // 4. Удаление
        states.removeFirst(); // Удалили Испанию
        states.removeLast();  // Удалили Италию

        System.out.println("После удаления крайних элементов: " + states);
    }
}
