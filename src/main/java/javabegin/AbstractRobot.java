package javabegin;

public abstract class AbstractRobot implements IRobot {

    private String name;

    public AbstractRobot() {
    }

    public AbstractRobot(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
