package 반복자패턴;

import java.util.List;

import 반복자패턴.domain.MenuItem;
import 반복자패턴.iterator.Iterator;

public class PancakeHouseIterator implements Iterator{
    private List<MenuItem> items;
    private int position = 0;

    public PancakeHouseIterator(List<MenuItem> items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items.get(position);
        position += 1;
        return menuItem;
    }
}