package day01_0203;

public class Car {
    int speed;
    Car(){}
    Car(int speed){
        this.speed = speed;
    }

    public final void stop(){
        System.out.println("차를 멈춤");
        this.speed = 0;

    }
    public void speedUp(){
        this.speed += 1;
    }
}
