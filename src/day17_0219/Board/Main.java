package day17_0219.Board;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 3;
        ArrayList<Board> boards = new ArrayList<>();
        //Board[] boardarray = new Board[100];

        Board b1 = new Board(1,"게시판에 오신것을 환영합니다","내용없음","winter","2024.01.02");
        Board b2 = new Board(2,"올 겨울은 많이 춥습니다","내용없음","winter","2024.01.01");
        boards.add(b1);
        boards.add(b2);
        System.out.println("게시물 목록");

        list(boards);
        create(boards);
//        create(boards);
//        create(boards);
//        create(boards);
//        create(boards);
//        create(boards);

        read(boards);
        delete(boards);
        clear(boards);
    }
    public static void list(ArrayList<Board> array){
        int number = 1;
        System.out.println("-------------------------------------------------------");
        System.out.println("no  writer    date       title");
        System.out.println("-------------------------------------------------------");
        for(Board a1 : array){
            System.out.println(number++ +"  " + a1.getBwriter() + "  " + a1.getBdate() + "  " + a1.getBititle());
        }
        System.out.println("-------------------------------------------------------");
    }
    public static void create(ArrayList<Board> array){
        Board b3 = new Board();
//        System.out.println("게시판 번호를 입력하세요.");
//        int cnt = in.nextInt();
//        b3.setBno(cnt);
//        in.nextLine();
        System.out.println("저자를 입력하세요.");
        b3.setBwriter(in.nextLine());
        System.out.println("날짜를 입력하세요.");
        b3.setBdate(in.nextLine());
        System.out.println("타이틀을 입력하세요.");
        b3.setBititle(in.nextLine());
        array.add(b3);
    }
    public static void delete(ArrayList<Board> array){
        System.out.println("삭제할 번호를 입력하세요.");
        int input = in.nextInt();
        array.remove(input+1);
        list(array);

    }
    public static void read(ArrayList<Board> array){
        System.out.println("bon : ");
        int number = in.nextInt();
        System.out.println("###########");
        System.out.println("번호 : " + number);
        System.out.println("제목 : " + array.get(number-1).getBititle());
        System.out.println("내용 : " + array.get(number-1).getBcontent());
        System.out.println("작성자 : " + array.get(number-1).getBwriter());
        System.out.println("날짜 : " + array.get(number-1).getBdate());
        System.out.println("###########");

    }
    public static void uqdate(ArrayList<Board> array){
        System.out.println("업데이트할 번호를 입력하세요 : ");
        int number = in.nextInt();
        array.get(2).setBno(1);
        array.get(2).setBititle(in.nextLine());
        System.out.println();

    }

    public static void clear(ArrayList<Board> array){
        array.clear();
    }

}
