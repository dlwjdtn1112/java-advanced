package day02_0204.exception;

public class Exception01 {
    public static void main(String[] args) {
        Parent p1=  new Child();
        Child c1 = (Child)p1;

        p1.method1();
        c1.method3();

        p1.method1();
        c1.method3();
        c1.method3();
    }

}