package stream;

import java.util.List;

public class SumOfEvenOdd {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
       int even=  list.stream().filter(num->num%2==0).reduce(0,(a,b)->a+b);
        int odd=  list.stream().filter(num->num%2!=0).reduce(0,(a,b)->a+b);
        System.out.println(even+"\t"+odd);
    }
}
