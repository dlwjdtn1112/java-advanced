package Board.Board;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        BoardExample b1 = new BoardExample();


//        b1.list();
//        b1.create();
//        b1.create();
//
//        b1.read();
//        b1.list();
//        b1.update();
//        b1.list();
//        b1.clear();
//        b1.list();
        while (true) {
            b1.list();
            int cnt = in.nextInt();
            if (cnt == 1) {
                b1.create();
            } else if (cnt == 2) {
                b1.read();
//                System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.list");
//                System.out.println("메뉴선택:");
                int cnt1 = in.nextInt();
                if (cnt1 == 1) {
                    b1.update();
                } else if (cnt1 == 2) {
                    b1.delete();
                } else if (cnt1 == 3) {
                    b1.list();
                }

            } else if (cnt == 3) {
                b1.clear();
            } else if (cnt == 4) {
                System.out.println("프로그램 종료");
                break;
            }





    }







    }
}
