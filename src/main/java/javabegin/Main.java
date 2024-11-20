package javabegin;

public class Main {

    public static void main(String[] args) {
        Robocop robocop = new Robocop("Robo");
        robocop.flight();
        System.out.println(robocop.getName());

        Terminator terminator = new Terminator();
        terminator.move();
    }
}