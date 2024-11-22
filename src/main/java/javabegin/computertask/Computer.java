package javabegin.computertask;

public class Computer implements InterfaceComputer {

    private String name;
    private InterfaceMonitor monitor;

    public Computer() {
    }

    public Computer(String name, Monitor monitor) {
        this.name = name;
        this.monitor = monitor;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setMonitor(InterfaceMonitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public InterfaceMonitor getMonitor() {
        return monitor;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void on() {
        System.out.println("Компьютер " + name + " включился, используется монитор " + monitor.getName());
    }

    @Override
    public void off() {
        System.out.println("Компьютер " + name + " выключился, используется монитор " + monitor.getName());
    }
}
