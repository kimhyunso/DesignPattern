package 반복자패턴;

import 반복자패턴.domain.MenuItem;
import 반복자패턴.iterator.Iterator;

public class DinerMenuIterator implements Iterator{

    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

}