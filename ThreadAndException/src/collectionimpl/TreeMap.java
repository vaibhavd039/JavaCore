package collectionimpl;

import java.util.HashMap;
import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        Student st1 = new Student(1, "Vaibhav");
        Student st2 = new Student(2, "Shubha");
        Student st3 = new Student(3, "wwe");
        Map<Student, Integer> mymap = new java.util.TreeMap<>();
        mymap.put(st1,1);
        mymap.put(st2,2);
        mymap.put(st3,3);
        mymap.put(st1,1);

    }

}
