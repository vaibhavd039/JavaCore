package stream;

import java.util.List;

public class Avg {
    public static void main(String [] args){
        List<Integer> mylist = List.of(1,2,3,4,5,5,6,7,8,10,10,10);
        System.out.println(mylist.stream().mapToInt(x->x).average().getAsDouble());
    }
}
