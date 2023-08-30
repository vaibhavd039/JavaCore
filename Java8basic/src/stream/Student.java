package stream;

import java.util.Objects;

public class Student {
    public int roll;
    public String name;
    public int batch;

    Student(int roll, String name) {
        this.roll = roll; this.name = name;
    }

    Student(int roll, int batch, String name) {
        this.roll = roll; this.name = name; this.batch = batch;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", batch=" + batch +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return roll == student.roll && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }
}

