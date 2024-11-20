package javabegin;

public class Main {

    public static void main(String[] args) {

        AircraftWing wing = new AircraftWing();
        wing.setSize(10);
        wing.open();

        Robocop robocop = new Robocop("Robo", wing);

        robocop.on();

        robocop.flight();
        System.out.println(robocop.getName());

        robocop.off();
    }
}