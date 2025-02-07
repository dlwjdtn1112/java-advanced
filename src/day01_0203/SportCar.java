package day01_0203;

public class SportCar extends Car{

    public void speedUp(){
        this.speed += 10;
    }
    SportCar(int speed){
        //super();
        this.speed = speed;
    }
}
