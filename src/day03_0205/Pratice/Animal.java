package day03_0205.Pratice;

public  abstract class Animal {
    public int speed;
    double distance;

    Animal(){}
    Animal(int speed){
        this.speed = speed;
    }

    public abstract void run(int hours);

    public double getDistnace(){
        this.distance += this.distance;
        return this.distance;
    }
}
