package javabegin;

import javabegin.cartask.Car;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Tesla");
        car.drive();
        car.stop();
    }
}