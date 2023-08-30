package stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingFrequency {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8,8,8,8,8,8,8,8,8,8, 9, 10);
        Map<Integer, Long> mymmap = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        mymmap.entrySet().stream().forEach(entry-> {System.out.println(entry.getKey()+"\t"+entry.getValue());});
    }

}
