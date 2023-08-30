package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String [] args){
        List<Student> student= StudentBuilderList.getStudentList();
        Collections.sort(student, (Student o1, Student o2) ->{ return Integer.compare(o1.roll, o2.roll);});
        student.stream().forEach(element->System.out.println(element));
    }

}
