package org.chapter13;

import jdk.jshell.execution.Util;

public class UtilExample {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("홍길동", 35);
        Integer age = org.chapter13.Util.getValue(pair,"홍길동");
        System.out.println(age);

        ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
        Integer childAge = org.chapter13.Util.getValue(childPair,"홍삼순");
        System.out.println(childAge);

        /*OtherPair<String, Integer> otherPair = new OtherPair<String, Integer>("홍삼원", 20);
        //otherPair는 Pair을 상속하지 않으므로 예외가 발생해야 합니다.
        int otherPair = org.chapter13.Util.getValue(otherPair,"홍삼원");
        System.out.println(otherPair);*/
    }
}
