package day02_0204.exception;

import day04_0206.Ex02.KumhoTire;

public class Car {
    public Tire tire;
    public KumhoTire tire2;

    public void run(){
        tire2.roll();//타이어를 끼여놓으면 자동차가 움직인다.
    }

}
