package day03_0205.Interface;

public class Pet implements Animal,Tail{
    @Override
    public void cry() {
        System.out.println("애완동물은 운다");

    }
    public void play(){
        System.out.println("애완동물은 논다.");
    }

    @Override
    public void isTail() {
        System.out.println("꼬리가 있다.");

    }
}
