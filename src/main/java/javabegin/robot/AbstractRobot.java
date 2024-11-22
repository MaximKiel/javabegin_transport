package javabegin.robot;

public abstract class AbstractRobot implements IRobot, ITech {

    private String name;
    private IWing wing;

    public AbstractRobot() {
    }

    public AbstractRobot(String name, IWing iWing) {
        this.name = name;
        this.wing = iWing;
    }

    @Override
    public void on() {
        System.out.println("on");
    }

    @Override
    public void off() {
        System.out.println("off");
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public IWing getIWing() {
        return wing;
    }

    public void setWing(IWing wing) {
        this.wing = wing;
    }
}
