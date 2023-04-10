package org.chapter16;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVsStreamExample {
    public static void main(String[] args) {
        //asList를 사용해 list에 바로 값 입력
        List<String> list = Arrays.asList("홍길동", "신용권", "김자바");

        //iterator 이용
        Iterator<String> iterator = list.iterator();
        //iterator가 남아있을 때까지 반복
        while(iterator.hasNext()){
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println();

        //stream 이용
        Stream<String> stream = list.stream();
        //변수 name 마다 반복하면서 name 출력
        stream.forEach(name-> System.out.println(name));
    }
}
