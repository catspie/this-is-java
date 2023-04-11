package org.chapter16;

import org.chapter15.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpressionExample {
    public static void main(String[] args) {
        List<Student1> list = Arrays.asList(
                new Student1("홍길동", 90),
                new Student1("신용권", 92)
        );

        Stream<Student1> stream = list.stream();
        stream.forEach(s ->{
            String name = s.getName();
            int score = s.getScore();
            System.out.println(name+"-"+score);
        });
    }
}
