package day09_0211.Generic.ex01;

public class Main {
    public static void main(String[] args) {
//        Box<String> stringBox = new Box<>();
//        stringBox.setItem("인형");
//        stringBox.setItem("기차 장난감");
//        stringBox.setItem("곰돌이 인형");
//
//
//
//        System.out.println(stringBox.getItem());
//        System.out.println(stringBox.getItem());

        Box<Integer> StringBox = new Box<>();
        StringBox.setItem(1);
        StringBox.setItem(2);
        StringBox.setItem(3);
        System.out.println(StringBox.getItem());
        GALAXY<String> glalxy = new GALAXY<>();
        glalxy.setName("s25");
        glalxy.setName("s24");
        glalxy.setName("s23");
        System.out.println(glalxy.getName());




    }
}
