package pr4;

public abstract class Clothes {
    protected Size size;
    protected double price;
    protected String color;

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " [size=" + size +
                ", euroSize=" + size.getEuroSize() +
                ", color=" + color +
                ", price=" + price + "]";
    }
}
