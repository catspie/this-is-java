package org.chapter15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<Student>();

        set.add(new Student(1, "홍길동"));
        set.add(new Student(2, "신용권"));
        set.add(new Student(1, "조민우"));

        //반복자 얻기
        Iterator<Student> iterator = set.iterator();
        //객체 수만큼 루핑
        while (iterator.hasNext()) {
            //한 개의 객체를 가져온다.
            Student student = iterator.next();
            System.out.println(student.studentNum + ":" + student.name);
        }
    }
}
