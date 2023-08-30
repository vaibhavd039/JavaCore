package stream;

import java.util.ArrayList;
import java.util.List;

public class StudentBuilderList {
    public static List<Student> getStudentList() {
        List<Student> result = new ArrayList<>(); result.add(new Student(1, "Vaibhav"));
        result.add(new Student(2, 1, "Vaibhav")); result.add(new Student(3, 6, "ABC"));
        result.add(new Student(4, 7, "DBC"));
        result.add(new Student(5, 8, "Vaibhavasdka")); return result;
    }
}
