package 반복자패턴.iterator;

import 반복자패턴.domain.MenuItem;

public interface Iterator{
    boolean hasNext();
    MenuItem next();
}