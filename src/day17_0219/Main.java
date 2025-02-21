package day17_0219;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public void delete(int cnt){


    }

    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();

        for(int i = 0; i < 3;i++){
            Item i1 = new Item();
            System.out.println("책 아이디를 입력하세요.");
            i1.setId(in.nextInt());
            in.nextLine();
            System.out.println("책 제목을 입력하세요");
            i1.setName(in.nextLine());
            System.out.println("책 저자를 입력하세요");
            i1.setAuthor(in.nextLine());
            items.add(i1);

        }
        int count = 1;
        for(Item a: items){
            System.out.println(count +". 책 저자 : " + a.getAuthor() + " 책 제목 : " + a.getName() + " 책 아이디 : " +a.getId());
            count++;
        }

//        items.get(1).setAuthor(in.nextLine());
//        items.get(1).setName(in.nextLine());
//        items.get(1).setName(in.nextLine());
//        items.clear();

        System.out.println("번호를 입력하세요.");
        int v1 = in.nextInt();
        System.out.println("책 저자 : " + items.get(v1).getAuthor() + " 책 이름 " + items.get(v1).getName() + "책 아이디 : "+items.get(v1).getId() );






    }
}
