package pr4;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    public void dressWomen() { System.out.println("Женщина носит " + this); }
}
