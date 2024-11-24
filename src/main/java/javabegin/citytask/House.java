package javabegin.citytask;

import java.util.List;

public class House implements InterfaceHouse {

    private String address;
    private List<InterfaceFlat> flatList;

    public House() {
    }

    public House(String address, List<InterfaceFlat> flatList) {
        this.address = address;
        this.flatList = flatList;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public List<InterfaceFlat> getFlatList() {
        return flatList;
    }

    @Override
    public void addFlat(InterfaceFlat flat) {
        flatList.add(flat);
    }
}