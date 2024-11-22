package javabegin.robot;

public class Robocop extends AbstractRobot {

    public Robocop() {
    }

    public Robocop(String name, IWing iWing) {
        super(name, iWing);
    }

    @Override
    public void move() {
        System.out.println("Robocop move");
    }

    @Override
    public void stop() {
        System.out.println("Robocop stop");
    }

    @Override
    public void flight() {
        System.out.println("Robocop flight - " + getIWing().getSize());
    }

    @Override
    public void on() {
        System.out.println("on with beep");
    }
}
