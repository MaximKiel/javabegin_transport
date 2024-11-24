package javabegin.citytask;

import java.util.List;

public class Flat implements InterfaceFlat {

    private int number;
    private List<Settler> settlerList;

    public Flat() {
    }

    public Flat(int number, List<Settler> settlerList) {
        this.number = number;
        this.settlerList = settlerList;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public List<Settler> getSettlerList() {
        return settlerList;
    }

    @Override
    public void addSettler(Settler settler) {
        if (settlerList.size() == DEFAULT_CAPACITY) {
            System.out.println("Нельзя заселить более 2-х жителей в квартиру " + number);
        } else {
            settlerList.add(settler);
        }
    }
}