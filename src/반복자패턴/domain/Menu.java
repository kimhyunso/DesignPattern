package 반복자패턴.domain;

import java.util.Iterator;

public interface Menu {
    void addItem(String name, String description, boolean vegetarian, double price);
    Iterator<MenuItem> createIterator();
}
