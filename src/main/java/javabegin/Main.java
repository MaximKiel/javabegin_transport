package javabegin;

import javabegin.transport.motorbike.Kawasaki;
import javabegin.transport.motorbike.Ural;

public class Main {

    public static void main(String[] args) {
        Kawasaki kawasaki = new Kawasaki("Kawasaki", "K1", "green", 5.5, 2020);
        kawasaki.jump();

        System.out.println();

        Ural ural = new Ural("Ural", "U1", "brown", 3.5, true);
        ural.showInfo();
    }
}