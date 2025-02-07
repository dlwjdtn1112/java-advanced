package day05_0207.innerClass.ex02;

public class ABMain {
    public static void main(String[] args) {
        //A객체 생성
        A a = new A();
        //B 객체 생성
        a.useB();
        A.B.field2 = 30;
        System.out.println(A.B.field2);
    }
}
