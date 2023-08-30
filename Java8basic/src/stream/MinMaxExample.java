package stream;

import java.util.List;
import java.util.stream.IntStream;

public class MinMaxExample {
    public static void main(String[] args) {
        List<Integer> mylist = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int max = mylist.stream().mapToInt(x -> x).max().getAsInt();
        int min = mylist.stream().mapToInt(x -> x).min().getAsInt();

        System.out.println(max + "\t" + min);

        min = mylist.stream().reduce(0, (a, b) -> Math.min(a, b));
        max = mylist.stream().reduce(0, (a, b) -> Math.max(a, b));
        System.out.println(max + "\t" + min);
    }
}
