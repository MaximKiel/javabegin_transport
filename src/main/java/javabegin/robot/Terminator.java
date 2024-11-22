package javabegin.robot;

public class Terminator extends AbstractRobot {

    public Terminator() {
    }

    public Terminator(String name, IWing iWing) {
        super(name, iWing);
    }

    @Override
    public void move() {
        System.out.println("Terminator move");
    }

    @Override
    public void stop() {
        System.out.println("Terminator stop");
    }

    @Override
    public void flight() {
        System.out.println("Terminator flight");
    }
}
