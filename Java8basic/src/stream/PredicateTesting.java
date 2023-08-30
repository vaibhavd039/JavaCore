package stream;

import java.util.function.Predicate;

public class PredicateTesting {
    public static void main(String [] args){
        Predicate<Student> isSenior =  student -> {return student.batch>5;};
        Predicate<Student> isGood =  student -> {return student.name.equals("Vaibhav");};
        Predicate<Student> combined =   isGood.and(isSenior);
        Predicate<Student> combinedOr =   isGood.or(isSenior);
        System.out.println(combined.test(new Student(1,7, "Dummy")));
        System.out.println(combinedOr.test(new Student(1,7, "Dummy")));
    }
}
