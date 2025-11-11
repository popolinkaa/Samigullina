package pr7;

import java.util.Date;
import java.text.DateFormat;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Метод для получения строкового представления даты рождения в разных форматах
    public String getFormattedBirthDate(String formatType) {
        if (birthDate == null) {
            return "Дата рождения не указана";
        }

        DateFormat formatter;
        switch (formatType.toLowerCase()) {
            case "short":
                formatter = DateFormat.getDateInstance(DateFormat.SHORT);
                break;
            case "medium":
                formatter = DateFormat.getDateInstance(DateFormat.MEDIUM);
                break;
            case "full":
                formatter = DateFormat.getDateInstance(DateFormat.FULL);
                break;
            default:
                return "Неизвестный формат даты";
        }
        return formatter.format(birthDate);
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", Дата рождения (средний формат): " + getFormattedBirthDate("medium");
    }
}
