package day02_0204.userde;

public class Insuf extends Exception{//사용자정의 예외클래스
    public Insuf(){}
    public Insuf(String message){
        super(message);
    }


}
