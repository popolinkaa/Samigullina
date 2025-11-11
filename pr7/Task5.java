package pr7;

import java.util.*;

public class Task5 {
    public static void main(String[] args) {
        int n = 1_000_000;

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Добавление
        long start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) arrayList.add(i);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList add(): " + (end - start) + " мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i++) linkedList.add(i);
        end = System.currentTimeMillis();
        System.out.println("LinkedList add(): " + (end - start) + " мс");

        // Доступ к элементу
        start = System.currentTimeMillis();
        for (int i = 0; i < n; i += 1000) arrayList.get(i);
        end = System.currentTimeMillis();
        System.out.println("ArrayList get(): " + (end - start) + " мс");

        start = System.currentTimeMillis();
        for (int i = 0; i < n; i += 1000) linkedList.get(i);
        end = System.currentTimeMillis();
        System.out.println("LinkedList get(): " + (end - start) + " мс");
    }
}