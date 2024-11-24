package javabegin.citytask;

import java.util.List;

public class City implements InterfaceCity {

    private String name;
    private List<InterfaceHouse> houseList;

    public City() {
    }

    public City(String name, List<InterfaceHouse> houseList) {
        this.name = name;
        this.houseList = houseList;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<InterfaceHouse> getHouseList() {
        return houseList;
    }

    @Override
    public void showSettledList() {
        System.out.println("Город: " + name);
        houseList.forEach(house -> {
            System.out.println("Дом: " + house.getAddress());
            house.getFlatList().forEach(flat -> {
                System.out.println("- Квартира: " + flat.getNumber());
                if (flat.getSettlerList().isEmpty()) {
                    System.out.println("-- Никто не живет");
                } else {
                    flat.getSettlerList().forEach(settler -> System.out.println("-- Житель " + settler.getName()));
                }
            });
            System.out.println();
        });
    }

    @Override
    public void addHouse(InterfaceHouse house) {
        houseList.add(house);
    }
}