package javabegin.citytask;

import java.util.List;

public interface InterfaceFlat {

    int DEFAULT_CAPACITY = 2;

    int getNumber();
    List<Settler> getSettlerList();
    void addSettler(Settler settler);
}