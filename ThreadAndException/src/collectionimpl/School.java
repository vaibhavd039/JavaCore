package collectionimpl;

import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class School {
    String name;
    UUID registraionNumber;
    School(String name){
        this.name=name;
        registraionNumber= UUID.randomUUID();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return name.equals(school.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, registraionNumber);
    }
}
