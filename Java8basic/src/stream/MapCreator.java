package stream;

import java.util.*;
import java.util.stream.Collectors;


public class MapCreator {
    public static void main(String[] args) {
        List<Student> students = getStudent();
        Map<Integer, List<Student>> classWiseMap= students.stream().collect(Collectors.groupingBy(student -> student.batch));
        LinkedHashMap<Integer, List<Student>> linked=  classWiseMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(
                Map.Entry::getKey,
                Map.Entry::getValue,
                (old, newValue)-> newValue,
                LinkedHashMap::new
        ));

        linked.entrySet().stream().forEach(entry->System.out.println(entry.getKey()+"\t"+entry.getValue()));
    }

    public static List<Student> getStudent() {
        List<Student> result = new ArrayList<>(); result.add(new Student(1, "Vaibhav"));
        result.add(new Student(2, 1, "Vaibhav")); result.add(new Student(3, 1, "ABC"));
        result.add(new Student(4, 2, "DBC"));
        result.add(new Student(5, 2, "Vaibhavasdka")); return result;
    }
}


