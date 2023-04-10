package org.chapter15;

import com.sun.source.tree.Tree;

public class Student1 implements Comparable<Student1> {
    public String id;
    public int score;

    public Student1(String id, int score) {
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Student1 o) {
        //코드 작성
        if(score<o.score) {
            return -1;
        } else if (score==o.score) {
            return 0;
        }else {
            return 1;
        }

    }
}
