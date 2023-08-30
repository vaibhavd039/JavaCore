package stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExampleTwo {
    public static void main(String[] args) {
        List<Student> studentList = StudentBuilderList.getStudentList();
        Comparator<Student> cp = (Student one, Student two)->{ return one.name.compareTo(two.name);};;

        Comparator<Student> nullfirstCom = Comparator.nullsFirst(cp);
        Collections.sort(studentList, nullfirstCom);

        studentList.stream().forEach(element->{
            System.out.println(element);
        });
    }
}
