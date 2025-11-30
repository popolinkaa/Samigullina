package pr9;

public class Task5 {
    public static void main(String[] args) {
        // 1. Создаем массив из 5 кругов
        Circle[] circles = new Circle[5];

        // 2. Инициализируем массив случайными радиусами
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(Math.random() * 10); // радиус от 0 до 10
        }

        // 3. Ищем круг с самой большой площадью
        Circle maxCircle = circles[0];
        for (int i = 1; i < circles.length; i++) {
            if (circles[i].getArea() > maxCircle.getArea()) {
                maxCircle = circles[i];
            }
        }

        // Вывод результатов
        System.out.println("Найден круг с максимальной площадью:");
        System.out.printf("Радиус: %.2f%n", maxCircle.getRadius());
        System.out.printf("Площадь: %.2f%n", maxCircle.getArea());
    }
}