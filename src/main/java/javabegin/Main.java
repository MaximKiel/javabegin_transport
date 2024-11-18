package javabegin;

import javabegin.transport.Engine;
import javabegin.transport.car.BMW;
import javabegin.transport.car.Car;
import javabegin.transport.car.Toyota;
import javabegin.transport.motorbike.Kawasaki;
import javabegin.transport.motorbike.Ural;

public class Main {

    public static void main(String[] args) {

        Toyota toyota = new Toyota();
        toyota.year = 2000;
        System.out.println(toyota.year);


        BMW bmw = new BMW();
        System.out.println(bmw.year);
    }
}