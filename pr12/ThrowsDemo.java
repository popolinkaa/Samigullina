package pr12;

public class ThrowsDemo {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        // Вызываем метод с null, чтобы проверить работу исключения
        demo.printMessage(null);
        // Вызываем с нормальным ключом
        demo.printMessage("Key");
    }

    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено: " + e.getMessage());
        }
    }

    public String getDetails(String key) {
        if (key == null) {
            // Мы сами создаем и выбрасываем ошибку
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}
