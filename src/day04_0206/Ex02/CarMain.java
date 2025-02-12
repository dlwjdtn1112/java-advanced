package day04_0206.Ex02;

public class CarMain {
    public static void main(String[] args) {
        Car bus = new Car();
        Car taxi = new Car();

        bus.run();
        taxi.run();

        //Car bus = new Car();
        bus.run();

        bus.tire2 = new KumhoTire();
        bus.tire1 = new KumhoTire();

        bus.run();
        bus.run();
        bus.run();
        bus.run();
        bus.run();






    }
}
