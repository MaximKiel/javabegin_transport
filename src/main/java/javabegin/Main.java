package javabegin;

import javabegin.transport.BMW;
import javabegin.transport.Toyota;

public class Main {

    public static void main(String[] args) {
        BMW bmw = new BMW("BMW", "X5", "black", 1);
        Toyota toyota = new Toyota("Toyota", "Camry", "white", 2);

        bmw.drive();
        bmw.stop();

        System.out.println();

        toyota.drive();
        toyota.stop();
    }
}