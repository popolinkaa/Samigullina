package pr5;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private boolean sameSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }

    public String toString() {
        return "Rectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
    }

    public void moveUp()    { if (sameSpeed()) { topLeft.moveUp(); bottomRight.moveUp(); } }
    public void moveDown()  { if (sameSpeed()) { topLeft.moveDown(); bottomRight.moveDown(); } }
    public void moveLeft()  { if (sameSpeed()) { topLeft.moveLeft(); bottomRight.moveLeft(); } }
    public void moveRight() { if (sameSpeed()) { topLeft.moveRight(); bottomRight.moveRight(); } }
}
