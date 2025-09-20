package pr2;

// Класс для проверки Ball
public class TestBall {
    public static void main(String[] args) {
        // Создание объектов
        Ball b1 = new Ball(1.1, 2.2);
        System.out.println(b1);

        // Проверим методы
        b1.setX(3.3);
        b1.setY(4.4);
        System.out.println("После изменения: " + b1);

        b1.setXY(5.5, 6.6);
        System.out.println("После setXY: " + b1);

        b1.move(1.0, 2.0);
        System.out.println("После move: " + b1);
    }
}
