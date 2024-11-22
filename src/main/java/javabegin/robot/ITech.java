package javabegin.robot;

public interface ITech {

    default void on() {
        System.out.println("default on");
    }

    default void off() {
        System.out.println("default off");
    }
}
