package javabegin.citytask;

import java.util.List;

public interface InterfaceCity {

    String getName();
    List<InterfaceHouse> getHouseList();
    void showSettledList();
    void addHouse(InterfaceHouse house);
}