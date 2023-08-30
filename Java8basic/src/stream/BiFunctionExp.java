package stream;

import java.util.function.BiFunction;

public class BiFunctionExp {
    public static void main(String[] args) {
        BiFunction<Student, Integer, String> custom = (Student one, Integer two)->{ return one.name+" "+two.toString();};
        custom.apply(new Student(1,"Vaibhav"),2 );
    }
}
