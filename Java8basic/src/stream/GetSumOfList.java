package stream;

import java.util.List;
import java.util.Optional;

// given list get sum of elements
public class GetSumOfList {
    public static void main(String[] args) {
        List<Integer> newList = List.of(1, 2, 3, 4, 5, 6, 7);
        int x = newList.stream().reduce(0, (a, b) -> a + b);
        System.out.println(x);
    }

    public int getSum(List<Integer> list) {
        return list.stream().mapToInt(x -> x).sum();
    }

    public static Optional<Integer> getMax(List<Integer> list) {
        return list.stream().max((a, b)-> a-b);
    }


}
