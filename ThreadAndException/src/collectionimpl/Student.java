package collectionimpl;

public class Student implements  Comparable<Student>{
    public int rollNumber;
    public String name;

    Student(int roll, String name) {
        this.rollNumber = roll;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
      return  this.name.compareTo(o.name);
    }
}
