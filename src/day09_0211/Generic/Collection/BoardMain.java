package day09_0211.Generic.Collection;

import java.util.ArrayList;
import java.util.List;

public class BoardMain {
    public static void main(String[] args) {
        //글을 보관 운영하는 ArrayList생성
        List<Board> boardList = new ArrayList<Board>();


        //객체(Board)추가
        boardList.add(new Board("가","이정수0","3"));
        boardList.add(new Board("나","이정수1","3"));
        boardList.add(new Board("다","이정수2","3"));

        int size = boardList.size();
        System.out.println("총 글의 수 : " + size);

        Board board = boardList.get(2);
        System.out.printf("주제 : %s 내용 : %s 작성자 :  %s",board.getSubject(),board.getWriter(),board.getContent());

        for(Board board1 : boardList){
            System.out.printf("주제 : %s 내용 : %s 작성자 :  %s",board.getSubject(),board.getWriter(),board.getContent());
            System.out.println();
        }

        System.out.println("=========================");


        boardList.remove(1);
        for(Board board1 : boardList){
            System.out.printf("추제 : %s 내용 : %s 작성자 :  %s",board.getSubject(),board.getWriter(),board.getContent());
            System.out.println();
        }



    }
}
