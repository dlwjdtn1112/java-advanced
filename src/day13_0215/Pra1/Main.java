package day13_0215.Pra1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  =  new Scanner(System.in);
//        Red[] red = new Red[5];
//
//        for(int i = 0; i < red.length;i++) {
//            Red r1 = new Red();
//            r1.setName(in.nextLine());
//            r1.setAge(in.nextInt());
//            in.nextLine();
//            r1.setBirthday(in.nextLine());
//            red[i] = r1;
//
//        }
//        for(Red r1 : red){
//            r1.display();


//        }

        ArrayList<Red> red  = new ArrayList<>();
        for(int i = 0; i < 5; i++ ){
            Red r1 = new Red();
            System.out.println("멤버 이름을 입력하세요 : ");
            r1.setName(in.nextLine());
            System.out.println("멤버 나이를 입력하세요 : ");
            r1.setAge(in.nextInt());
            in.nextLine();
            System.out.println("멤버 생일을 입력하세요 : ");
            r1.setBirthday(in.nextLine());
            red.add(r1);
        }

        for(Red r : red){
            r.display();
        }
    }
}
