package stream;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExp {
    public static void main(String[] args) {
        BiConsumer<Student, String> consumer = (Student one, String two) -> {System.out.println(one.toString() + two);};
        consumer.accept(new Student(1, "vaibhv"), "dummy");
    }
}
