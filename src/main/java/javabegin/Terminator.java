package javabegin;

public class Terminator extends AbstractRobot {

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
