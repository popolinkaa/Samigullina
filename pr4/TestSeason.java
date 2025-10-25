package pr4;

public class TestSeason {
    public static void main(String[] args) {
        Season favorite = Season.SUMMER;
        System.out.println("Любимое время года: " + favorite);
        System.out.println("Средняя температура: " + favorite.getAverageTemp());
        System.out.println("Описание: " + favorite.getDescription());
        printSeasonInfo(favorite);

        System.out.println("\nВсе времена года:");
        for (Season s : Season.values()) {
            System.out.println(s + " — " + s.getAverageTemp() + "°C, " + s.getDescription());
        }
    }

    static void printSeasonInfo(Season season) {
        switch (season) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }
}
