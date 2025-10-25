package pr4;

public class Atelier {
    public static void dressMan(Clothes[] clothes) {
        System.out.println("=== Мужская одежда ===");
        for (Clothes c : clothes)
            if (c instanceof MenClothing men) men.dressMan();
    }

    public static void dressWomen(Clothes[] clothes) {
        System.out.println("=== Женская одежда ===");
        for (Clothes c : clothes)
            if (c instanceof WomenClothing women) women.dressWomen();
    }

    public static void main(String[] args) {
        Clothes[] arr = {
                new TShirt(Size.M, 1500, "Белый"),
                new Pants(Size.L, 2000, "Черный"),
                new Skirt(Size.S, 1800, "Красный"),
                new Tie(Size.M, 800, "Синий")
        };
        dressMan(arr);
        dressWomen(arr);
    }
}
