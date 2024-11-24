package javabegin.citytask;

import java.util.List;

public interface InterfaceHouse {
    String getAddress();
    List<InterfaceFlat> getFlatList();
    void addFlat(InterfaceFlat flat);
}