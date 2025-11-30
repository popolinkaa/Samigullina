package pr9;

public class Circle {
    /** Радиус круга */
    double radius;

    /** Количество созданных объектов (статическая переменная) */
    static int numberOfObjects = 0;

    /** Создает круг с радиусом, равным 1 */
    Circle() {
        radius = 1.0;
        numberOfObjects++;
    }

    /** Создает круг с указанным радиусом */
    Circle(double newRadius) {
        radius = newRadius;
        numberOfObjects++;
    }

    /** Возвращает количество созданных объектов (статический метод) */
    static int getNumberOfObjects() {
        return numberOfObjects;
    }

    /** Возвращает площадь круга (метод экземпляра) */
    double getArea() {
        return radius * radius * Math.PI;
    }

    /** Геттер для радиуса (понадобится для вывода) */
    public double getRadius() {
        return radius;
    }
}
