package javabegin.transport;

public class Car extends Transport {

    private int number;

    public Car() {
    }

    public Car(String name, String model, String color, int number) {
        super(name, model, color);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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
