package collectionimpl;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class StudenComparator implements Comparator<Student>{
    public int compare(Student one, Student two){
        return Integer.compare(one.rollNumber, two.rollNumber);
    }
}
public class TreeSetImpl {
    public static void main(String [] args){
        Student st1 = new Student(1, "vaibhav");
        Student st2 = new Student(2, "Shubha");
        Student st3 = new Student(3, "wwe");
        Set<Student> set = new TreeSet<>();
        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.stream().forEach(ele->{System.out.println(ele.name);});
         set = new TreeSet<>(new StudenComparator());
        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.stream().forEach(ele->{System.out.println(ele.name);});
    }
}
