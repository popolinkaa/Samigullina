package pr4;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    public void dressMan() { System.out.println("Мужчина носит " + this); }
    public void dressWomen() { System.out.println("Женщина носит " + this); }
}
