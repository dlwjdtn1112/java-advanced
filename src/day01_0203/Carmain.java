package day01_0203;

public class Carmain {
    public static void main(String[] args) {
        Car mycar1 = new Car(6);
        SportCar mycar2 = new SportCar(10);
        //mycar1.speed = 3;
        //mycar2.speed = 30;

        System.out.println(mycar1.speed);
        System.out.println(mycar2.speed);
        //mycar1.stop();
        //mycar2.stop();
        mycar1.speedUp();
        mycar2.speedUp();
        System.out.println(mycar1.speed);
        System.out.println(mycar2.speed);
    }
}
