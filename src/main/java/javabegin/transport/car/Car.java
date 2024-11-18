package javabegin.transport.car;

import javabegin.transport.Engine;
import javabegin.transport.Transport;

public class Car extends Transport {

    private int number;

    private Engine engine;

    public Car() {
    }

    public Car(String name, String model, String color, int number) {
        super(name, model, color);
        this.number = number;
    }

    public Car(int number, Engine engine) {
        this.number = number;
        this.engine = engine;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void signal() {
        System.out.println("car signal");
    }

    @Override
    public void drive() {
        System.out.println("car drive");
    }

    @Override
    public void stop() {
        System.out.println("car stop");
    }
}
