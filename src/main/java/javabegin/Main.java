package javabegin;

import javabegin.citytask.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Settler settler1 = new Settler("settler1");
        Settler settler2 = new Settler("settler2");
        Settler settler3 = new Settler("settler3");
        Settler settler4 = new Settler("settler4");
        Settler settler5 = new Settler("settler5");

        InterfaceFlat flat1 = new Flat(1, new ArrayList<>());
        InterfaceFlat flat2 = new Flat(2, new ArrayList<>());
        InterfaceFlat flat3 = new Flat(3, new ArrayList<>());
        InterfaceFlat flat4 = new Flat(4, new ArrayList<>());

        flat1.addSettler(settler1);
        flat2.addSettler(settler2);
        flat2.addSettler(settler3);
        flat2.addSettler(settler4);
        flat3.addSettler(settler5);

        InterfaceHouse house1 = new House("ул. Иванова, д. 5", new ArrayList<>());
        InterfaceHouse house2 = new House("ул. Сидорова, д. 4", new ArrayList<>());

        house1.addFlat(flat1);
        house1.addFlat(flat2);
        house1.addFlat(flat3);
        house2.addFlat(flat4);

        InterfaceCity city = new City("Москва", new ArrayList<>());

        city.addHouse(house1);
        city.addHouse(house2);

        city.showSettledList();
    }
}