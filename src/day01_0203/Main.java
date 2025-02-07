package day01_0203;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        SmartPhone MyPhone = new SmartPhone("Galaxy","White");

        MyPhone.wifi = true;

        MyPhone.setWifi(MyPhone.wifi);

        System.out.println(MyPhone.color);
        System.out.println(MyPhone.model);

        Phone P = new Phone("s25","h");
        P.color = "white";
        P.model = "s25";
        System.out.println(P.color);
        System.out.println(P.model);
        P.bell();
        MyPhone.bell();
        MyPhone.internet();

        System.out.println("--------------");
        //Phone으로 부터 상속받는 필드 읽어서 출력
        System.out.println(MyPhone.model);
        System.out.println(MyPhone.color);

        //Smart{hone의 필드 읽어서 출력
        System.out.println(MyPhone.wifi);

        //Phone으로 부터 상속받는 메소드 호출
        MyPhone.bell();

        //SmartPhone으로 상속받는 메소드 호출
        MyPhone.setWifi(true);
        System.out.println("-------------");

        MyPhone.bell();



    }

}
