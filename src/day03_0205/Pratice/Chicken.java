package day03_0205.Pratice;

public class Chicken extends Animal implements Cheat{


    Chicken(){}
    Chicken(int speed){

        this.speed = speed;
        //fiy();
    }

    public void run(int hours){
        this.distance = this.speed * hours;

    }
    public void fiy(){
        this.speed *= 2;
    }
}
