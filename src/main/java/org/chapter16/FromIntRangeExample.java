package org.chapter16;

import java.util.stream.IntStream;

public class FromIntRangeExample {
    private static int sum;

    //스트림을 활용해 1부터 100까지 합을 구하기
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 100);
        intStream.forEach(a->sum += a);
        System.out.println("총합: "+sum);
    }
}
