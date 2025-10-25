package pr4;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    public void dressMan() { System.out.println("Мужчина носит " + this); }
}
