package pr13;

public class Student implements Comparable<Student> {
    private int idNumber;
    private double gpa;

    public Student(int idNumber, double gpa) {
        this.idNumber = idNumber;
        this.gpa = gpa;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "ID=" + idNumber +
                ", GPA=" + gpa +
                '}';
    }

    // Задание 4: Собственная реализация интерфейса Comparable
    // Сравниваем студентов по ID
    @Override
    public int compareTo(Student other) {
        // Возвращает <0, если this < other
        // 0, если равны
        // >0, если this > other
        return Integer.compare(this.idNumber, other.idNumber);
    }
}
