import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<Integer> mylist = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        mylist = mylist.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        mylist.forEach(element -> System.out.println(element));
    }
}
