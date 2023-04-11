package org.chapter16;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "홍길동", "김자바", "신용권",
                "람다식", "박병렬"
        );

        //순차 처리
        Stream<String> stream = list.stream();
        //해당 클래스가 print 메소드 참조
        stream.forEach(ParallelExample :: print);
        System.out.println();

        //병렬 처리
        Stream<String> parallelStram = list.parallelStream();
        parallelStram.forEach(ParallelExample :: print);
    }

    private static void print(String str) {
        System.out.println(str+":"+ Thread.currentThread().getName());
    }
}
