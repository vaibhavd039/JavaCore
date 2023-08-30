package collectionimpl;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplNew {
    public static void main(String[] args) {
        School school1 = new School("ACV");
        School school2 = new School("A");
        School school3 = new School("A");

        Set<School> myset = new HashSet<>();
        myset.add(school1);
        myset.add(school2);
        myset.add(school3);

        myset.stream().forEach(element->{System.out.println(element.name);});

    }
}
