package pr9;

public class StopWatch {
    // Скрытые поля (private)
    private long startTime;
    private long endTime;

    // Безаргументный конструктор
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    // Геттеры (только для чтения полей, если нужно, хотя в задании просили только логику)
    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    // Метод start() - сбрасывает startTime
    public void start() {
        startTime = System.currentTimeMillis();
    }

    // Метод stop() - фиксирует endTime
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    // Метод getElapsedTime() - возвращает разницу
    public long getElapsedTime() {
        return endTime - startTime;
    }
}