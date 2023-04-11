package org.chapter16;

import org.chapter15.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FromCollectionExample {
    public static void main(String[] args) {
        List<Student1> studentList = Arrays.asList(
                new Student1("홍길동", 10) ,
                new Student1("신용권", 20),
                new Student1("김자바", 30)
        );

        Stream<Student1> stream = studentList.stream();
        stream.forEach(s-> System.out.println(s.getName()));
    }
}
