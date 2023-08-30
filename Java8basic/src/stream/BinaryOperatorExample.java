package stream;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> addition = (a, b) -> {return a + b;};
        BinaryOperator<Integer> maxOperator = BinaryOperator.maxBy(Integer::compare);
        BinaryOperator<Integer> minOperator = BinaryOperator.minBy(Integer::compare);
        System.out.println(addition.apply(5, 10));
        System.out.println(maxOperator.apply(5, 10));
        System.out.println(minOperator.apply(5, 10));
    }
}
