package pr14;

import java.util.Arrays;

public class Task3_MyList<E> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public Task3_MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    // 1. Метод добавления в конец
    public void add(E value) {
        if (size == elements.length) {
            increaseCapacity();
        }
        elements[size++] = value;
    }

    // 2. Метод добавления по индексу (как в настоящем ArrayList)
    public void add(int index, E value) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if (size == elements.length) {
            increaseCapacity();
        }
        // Сдвигаем элементы вправо, чтобы освободить место
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = value;
        size++;
    }

    // 3. Метод получения элемента
    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    // 4. Метод удаления по индексу
    public void remove(int index) {
        checkIndex(index);
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            // Сдвигаем элементы влево, затирая удаляемый
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null; // Забываем ссылку, чтобы сборщик мусора очистил память
    }

    // 5. Узнать размер
    public int size() {
        return size;
    }

    // 6. Красивый вывод списка (переопределяем toString)
    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i == size - 1) {
                return sb.append(']').toString();
            }
            sb.append(", ");
        }
        return sb.toString();
    }

    // Внутренние служебные методы
    private void increaseCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    private void checkIndex(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    // --- ТЕСТИРОВАНИЕ ---
    public static void main(String[] args) {
        Task3_MyList<Integer> myNumbers = new Task3_MyList<>();

        // Тест добавления
        myNumbers.add(10);
        myNumbers.add(20);
        myNumbers.add(30);
        System.out.println("После добавления: " + myNumbers); // Теперь выводит красиво [10, 20, 30]

        // Тест вставки в середину
        myNumbers.add(1, 999);
        System.out.println("После вставки 999 на позицию 1: " + myNumbers);

        // Тест удаления
        myNumbers.remove(2); // Удаляем элемент с индексом 2 (это было число 20)
        System.out.println("После удаления элемента с индексом 2: " + myNumbers);

        // Тест получения
        System.out.println("Элемент под индексом 0: " + myNumbers.get(0));
        System.out.println("Размер списка: " + myNumbers.size());
    }
}
