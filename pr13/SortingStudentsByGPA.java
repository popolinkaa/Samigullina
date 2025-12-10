package pr13;

import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Нам нужно в порядке УБЫВАНИЯ, поэтому меняем s1 и s2 местами
        // или ставим минус перед результатом.
        return Double.compare(s2.getGpa(), s1.getGpa());
    }
}
