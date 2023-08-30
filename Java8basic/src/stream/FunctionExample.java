package stream;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String [] args){
        Function<Integer, Integer> doubleNum = a -> {return a+a;};
        Function<Integer, Integer> square = a -> {return a*a;};
        Function<Integer, Integer>  composed = square.andThen(doubleNum);
         int a = composed.apply(3); // 3 * 3 -> 9  then 9+9-> 18
         System.out.println(a);
    }
}
