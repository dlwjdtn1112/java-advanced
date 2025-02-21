package Board.Board;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class BoardExample {
    static int n = 1;

    static Scanner in = new Scanner(System.in);

    ArrayList<Board> array1 = new ArrayList<Board>();




    public void list(){

        int number = 1;
        System.out.println("[게시물 목록]");
        System.out.println("-------------------------------------------------------");
        System.out.println("no   writer    date       title");
        System.out.println("-------------------------------------------------------");
        //LocalDate dateOnly = array1.get(2).getBdate().toLocalDate();
        //System.out.println(dateOnly);
        for(Board board : array1){
            LocalDate dateOnly = array1.get(number-1).getBdate().toLocalDate();
            System.out.println(number++ +"  " + board.getBwriter() + "  "+ dateOnly +"  " + board.getBititle());
        }

        System.out.println("-------------------------------------------------------");
        mainMenu();


    }
    public void mainMenu(){
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.println("메뉴 선택:");

    }

    public void create(){

        Board b3 = new Board();
        System.out.println("[새 게시물 입력]");



        System.out.println("제목: ");
        b3.setBititle(in.nextLine());

        System.out.println("내용: ");
        b3.setBcontent(in.nextLine());

        System.out.println("작성자: ");
        b3.setBwriter(in.nextLine());

        b3.setBdate(LocalDateTime.now());

        array1.add(b3);
    }

    public void read(){
        System.out.println("bon : ");
        int number = in.nextInt();
        System.out.println("#####################");
        System.out.println("번호 : " + number);
        System.out.println("제목 : " + array1.get(number-1).getBititle());
        //System.out.println("내용 : " + array1.get(number-1).getBcontent());
        System.out.println("작성자 : " + array1.get(number-1).getBwriter());
        //System.out.println("날짜 : " + array1.get(number-1).getBdate().atStartOfDay());
        System.out.println("#####################");
        System.out.println("보조 메뉴 : 1.Update | 2.Delete | 3.List");
        System.out.println("메뉴 선택:");


    }
    public void clear(){
        array1.clear();
    }
    public void update(){
//        System.out.println("bon :");
//        int number = in.nextInt();
////        array1.get(number-1).setBno(in.nextInt());
////        in.nextLine();
//        System.out.println("수정할 제목 : ");
//        array1.get(number-1).setBititle(in.nextLine());
//        //in.nextLine();
//        System.out.println("수정할 내용 : ");
//        array1.get(number-1).setBcontent(in.nextLine());
//        //in.nextLine();
//        System.out.println("수정할 작성자 : ");
//        array1.get(number-1).setBwriter(in.nextLine());
//        //in.nextLine();
////        System.out.println("수정할 날짜를 입력하세요.");
////        array1.get(number-1).setBdate(in.nextLine());
        System.out.println("bon :");
        int number = in.nextInt();
        in.nextLine(); // nextInt()가 소비하지 않은 개행 문자를 처리

        System.out.println("수정할 제목 : ");
        array1.get(number-1).setBititle(in.nextLine());

        System.out.println("수정할 내용 : ");
        array1.get(number-1).setBcontent(in.nextLine());

        System.out.println("수정할 작성자 : ");
        array1.get(number-1).setBwriter(in.nextLine());
        array1.get(number-1).setBdate(LocalDateTime.now());

    }
    public void delete(){
        System.out.println("bon :");
        int number = in.nextInt();
        array1.remove(number-1);
    }

}
