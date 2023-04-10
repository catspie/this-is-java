package org.chapter15;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        //최고 점수를 받은 아이디 저장
        String name = null;
        //최고 점수 저장
        int maxScore = 0;
        //점수 합계 저장
        int totalScore = 0;

        //평균 점수
        double avg = 0;

        //작성위치, map을 이용해 구현
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {
            Map.Entry<String, Integer> entry = entryIterator.next();
            totalScore += entry.getValue();
            for (Map.Entry<String, Integer> entry1 : entrySet) {
                if (entry1.getValue() > maxScore) {
                    name = entry1.getKey();
                    maxScore = entry1.getValue();
                }
            }
        }
        avg = totalScore / map.size();


        System.out.println("평균점수: " + avg);
        System.out.println("최고점수: " + maxScore);
        System.out.println("최고점수를 받은 아이디: " + name);

    }
}
