package day03_0205.Pratice;

public class Dog extends Animal{
    Dog(){}
    Dog(int speed){
        super(speed);
        //this.speed = speed;
    }

    public void run(int hours){
        this.distance = (this.speed * hours) / 4;

    }
}
