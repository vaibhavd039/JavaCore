package stream;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<Student> students = StudentBuilderList.getStudentList();
        example5();
    }

    public static void example() {
        List<Student> students = StudentBuilderList.getStudentList();
        Predicate<Student> isSenior = (Student one) -> {return one.batch > 5;};
        System.out.println("filtering seniors");
        students.stream().filter(isSenior).forEach(student -> {System.out.println(student);});
        System.out.println("-----------------------------------------");
        System.out.println("promoting students");
        Function<Student, Student> promote = (Student one) -> {one.batch++; return one;};
        students.stream().map(promote).filter(isSenior).forEach(one -> System.out.println(one));
        System.out.println("-----------------------------------------");

        System.out.println("Sorting students");
        Comparator<Student> rollComparator = (Student one, Student two) -> {
            return Integer.compare(one.roll, two.roll);
        };
        Comparator<Student> batchComparator = (Student one, Student two) -> {
            return Integer.compare(one.roll, two.roll);
        };
        Comparator<Student> combined = batchComparator.thenComparing(rollComparator);
        Consumer<Student> printer = (Student one) -> {System.out.println(one);};
        students.stream().map(promote).filter(isSenior).sorted(combined).forEach(printer);
        System.out.println("-----------------------------------------");

        System.out.println("Unique students");
        students.stream().map(promote).filter(isSenior).distinct().forEach(printer);
    }


    public static void example2() {
        List<Student> students = StudentBuilderList.getStudentList();
        Consumer<Student> printer = (Student one) -> {System.out.println(one);};
        Predicate<Student> isSenior = (Student one) -> {return one.batch > 5;};
        Function<Student, Student> promote = (Student one) -> {one.batch++; return one;};

        students.stream().filter(isSenior).peek(printer).map(promote).peek(printer).distinct().collect(Collectors.toList());
        // here we'll come to know that ek baar me ek element pehele pipeline se hokar jaa rha hai
        System.out.println("-----------------------------------------");

        students.stream().filter(isSenior).map(promote).limit(2).peek(printer).collect(Collectors.toList());
        System.out.println("-----------------------------------------");

        students.stream().filter(isSenior).map(promote).limit(2).skip(1).peek(printer).collect(Collectors.toList());
        System.out.println("-----------------------------------------");

    }

    public static void example3() {
        List<Student> students = StudentBuilderList.getStudentList();
        Consumer<Student> printer = (Student one) -> {System.out.println(one);};
        Predicate<Student> isJunior = (Student one) -> {return one.batch < 5;};
        // jab tak true rahe execute kro
        students.stream().takeWhile(isJunior).peek(printer).collect(Collectors.toList());
        System.out.println("-----------------------------------------");

        // jab tak false rahe execute kro
        students.stream().dropWhile(isJunior).peek(printer).collect(Collectors.toList());
    }

    public static void example4() {
        IntFunction<Integer> doubleFunction = value -> value * 2;
        List<Student> students = StudentBuilderList.getStudentList();
        Student[] arr = students.stream().toArray(Student[]::new);
    }

    public static void example5() {
        List<Integer> list = List.of(1,23,4,5,6,7,8,9,10);
        System.out.println("min: "+ list.stream().min(Integer::compare).get());
        System.out.println("max: "+ list.stream().max(Integer::compare).get());
        System.out.println("total: "+ list.stream().count());

        Predicate<Integer> prime =  (Integer a)-> {
            int counter=0;
            for(int i=1;i<a;i++){
                if(a%i==0){
                    counter++;
                }
            }
            return (counter<2);
        };
        System.out.println("Any number which is prime available: "+ list.parallelStream().filter(prime).findAny().get());
        System.out.println("First number which is prime available: "+ list.stream().filter(prime).findFirst().get());
        System.out.println("Any number which is prime available: "+ list.stream().anyMatch(prime));
        System.out.println("Check None prime available: "+ list.parallelStream().filter(prime.negate()).noneMatch(prime));



    }

}
