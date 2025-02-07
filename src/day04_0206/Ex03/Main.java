package day04_0206.Ex03;

public class Main {
    public static void main(String[] args) {
        ABCimpl abCimpl = new ABCimpl();

        InterfaceA ia = abCimpl;
        ia.methodA();

        InterfaceB ib = abCimpl;
        ib.methodB();

        InterfaceC ic = abCimpl;
        ic.methodC();
    }
}

//자식인터페이스를 구현 구현 클래스 자식 인터페이스의메소드뿐만 아니라 부모 인터페이스 모든 추상메소드를 재정의 해야 하며 구현 객체는 자식 및 부모 인테페이스 변수에 대입될 수 있다.
//자식인터페이스 변수 new 구현클래스();
// 부모인터페이스1 변수 = 구현클래스();

