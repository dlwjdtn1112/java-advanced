package Ex02;

public class Car {
    Car(){}


    Tire tire1 =  new HankookTire();
    Tire tire2 =  new HankookTire();

    public void run(){
        tire1.roll();
        tire2.roll();
    }


}
