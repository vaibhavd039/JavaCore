package stream;

import java.util.List;
import java.util.StringJoiner;

public class ConctacString {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(", ");
        List<String> list = List.of("ABC gardon", "DEF chef", "AAW chef");
        list.stream().forEach(element-> {
            stringJoiner.add(element.split(" ")[0]);
        });

        String str = stringJoiner.toString();
        System.out.println(str);
    }

}
