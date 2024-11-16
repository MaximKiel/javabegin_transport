package javabegin.transport;

public class Toyota extends Car {

    public Toyota() {
    }

    public Toyota(String name, String model, String color, int number) {
        super(name, model, color, number);
    }

    @Override
    public void drive() {
        super.signal();
        super.drive();
        System.out.println(super.getName() + " drive");
    }

    @Override
    public void stop() {
        super.stop();
        System.out.println(super.getName() + " stop");
    }
}
