package org.chapter15;

import java.util.Objects;

public class Student {
    //필드값
    public int studentNum;
    public String name;

    //생성자
    public Student(int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

    //eqauls, hashcode 메소드 오버라이딩
    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student student = (Student) o;
            return (studentNum == student.studentNum) && (name.equals(student.name));
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return studentNum + name.hashCode();
    }

}
