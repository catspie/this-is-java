package org.chapter15;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    //코드 작성

    public List<Board1> getBoardList() {
        List<Board1> list = new ArrayList<Board1>();
        list.add(new Board1("제목1", "내용1"));
        list.add(new Board1("제목2", "내용2"));
        list.add(new Board1("제목3", "내용3"));
        return list;
    }


}
