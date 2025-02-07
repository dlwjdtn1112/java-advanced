package day04_0206.vehicleEx;

import day01_0203.ABCD.B;

public class DriverMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);

        Bike b1 =  new Bike();
        driver.drive(b1);

        //driver.drive(hourse);
    }
}
