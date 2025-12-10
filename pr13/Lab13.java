package pr13;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Lab13 {

    public static void main(String[] args) {
        // --- ЗАДАНИЕ 1: Сортировка вставками по ID ---
        System.out.println("=== Задание 1: Сортировка вставками по ID ===");
        Student[] students = {
                new Student(105, 3.5),
                new Student(102, 4.0),
                new Student(108, 2.8),
                new Student(101, 3.9)
        };

        insertionSort(students);

        for (Student s : students) {
            System.out.println(s);
        }

        // --- ЗАДАНИЕ 2: Быстрая сортировка по GPA (Comparator) ---
        System.out.println("\n=== Задание 2: Быстрая сортировка по GPA (убывание) ===");
        SortingStudentsByGPA gpaComparator = new SortingStudentsByGPA();
        quickSort(students, 0, students.length - 1, gpaComparator);

        for (Student s : students) {
            System.out.println(s);
        }

        // --- ЗАДАНИЕ 3: Сортировка слиянием (объединение списков) ---
        System.out.println("\n=== Задание 3: Сортировка слиянием ===");
        // Создадим два уже отсортированных списка (для демонстрации merge)
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(10, 3.1));
        list1.add(new Student(30, 3.2));
        list1.add(new Student(50, 3.3));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(20, 3.4));
        list2.add(new Student(40, 3.5));
        list2.add(new Student(60, 3.6));

        List<Student> mergedList = mergeSort(list1, list2);

        for (Student s : mergedList) {
            System.out.println(s);
        }
    }

    // --- Реализация Сортировки Вставками (Insertion Sort) ---
    public static void insertionSort(Student[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Student current = arr[i];
            int j = i - 1;
            // Используем compareTo, который мы написали в классе Student
            while (j >= 0 && arr[j].compareTo(current) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    // --- Реализация Быстрой Сортировки (Quick Sort) с Компаратором ---
    public static void quickSort(Student[] arr, int low, int high, Comparator<Student> comparator) {
        if (low < high) {
            int pi = partition(arr, low, high, comparator);

            quickSort(arr, low, pi - 1, comparator);
            quickSort(arr, pi + 1, high, comparator);
        }
    }

    private static int partition(Student[] arr, int low, int high, Comparator<Student> comparator) {
        Student pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            // Используем переданный компаратор для сравнения
            if (comparator.compare(arr[j], pivot) <= 0) {
                i++;
                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // --- Реализация Объединения списков (Merge Sort logic) ---
    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        // Пока в обоих списках есть элементы
        while (i < list1.size() && j < list2.size()) {
            // Сравниваем по ID (используем compareTo)
            if (list1.get(i).compareTo(list2.get(j)) <= 0) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        // Добавляем оставшиеся элементы, если один из списков кончился
        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        return result;
    }
}