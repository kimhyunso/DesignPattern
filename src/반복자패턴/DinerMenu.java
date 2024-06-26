package 반복자패턴;

import 반복자패턴.domain.Menu;
import 반복자패턴.domain.MenuItem;
// import 반복자패턴.iterator.Iterator;
import java.util.Iterator;

public class DinerMenu implements Menu{
    
    static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("채식주이자용 BLT",
        "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
        addItem("BLT",
        "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
        
        addItem("오늘의 스프y",
        "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
        addItem("핫도그",
        "샤워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);
    }

    @Override
    public void addItem(String name, String description, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS){
            System.err.println("죄송합니다, 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
        }else{
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public static int getMaxItems() {
        return MAX_ITEMS;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    // public MenuItem[] getMenuItems() {
    //     return menuItems;
    // }

    public void setMenuItems(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public Iterator<MenuItem> createIterator(){
        return (Iterator<MenuItem>) new DinerMenuIterator(menuItems);
    }
}
