package stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 10);
        List<Integer> mylist = list.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting())).entrySet().stream().filter(entry -> entry.getValue() < 2).map(entry -> entry.getKey()).collect(Collectors.toList());
        mylist.stream().forEach(element -> System.out.println(element));

    }
}
