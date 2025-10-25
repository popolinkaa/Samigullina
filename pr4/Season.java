package pr4;

public enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Тёплое время года";
        }
    },
    AUTUMN(5);

    private final int averageTemp;

    Season(int averageTemp) {
        this.averageTemp = averageTemp;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
