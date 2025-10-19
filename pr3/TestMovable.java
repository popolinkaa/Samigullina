package pr3;

public class TestMovable {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(0, 0, 2, 2, 5);
        System.out.println(circle);
        circle.moveUp();
        circle.moveRight();
        System.out.println("После движения: " + circle);

        MovableRectangle rect = new MovableRectangle(0, 0, 5, 5, 1, 1);
        System.out.println(rect);
        rect.moveDown();
        rect.moveLeft();
        System.out.println("После движения: " + rect);
    }
}
