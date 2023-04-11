package org.chapter16;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student1> student1List = Arrays.asList(
                new Student1("홍길동", 10),
                new Student1("신용권", 20),
                new Student1("김유미", 30)
        );

        double avg = student1List.stream()
                .mapToInt(Student1::getScore) //학생 객체를 점수로 매핑
                .average() //최종 처리 (평균 점수)
                .getAsDouble();

        System.out.println("평균 점수: " + avg);
    }
}
