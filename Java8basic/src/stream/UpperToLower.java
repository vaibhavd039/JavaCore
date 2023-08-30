package stream;

import java.util.List;
import java.util.StringJoiner;

public class UpperToLower {
    public static void main(String[] args) {
        List<String> list = List.of("ABC gardon", "DEF chef", "AAW chef");
        String str = list.stream().reduce("", (a,b)->a.toLowerCase()+" "+b.toLowerCase());
        System.out.println(str);
    }
}
