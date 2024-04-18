package 반복자패턴;

import 반복자패턴.domain.Menu;
import 반복자패턴.domain.MenuItem;
// import 반복자패턴.iterator.Iterator;
import java.util.Iterator;
import java.util.List;

public class Waitress{
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;
    private List<Menu> menus;

    public Waitress(List<Menu> menus){
        this.menus = menus;
    }

    public void printMenu(){
        Iterator<Menu> menuIterator = menus.iterator();
        while (menuIterator.hasNext()){
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    // public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu){
    //     this.pancakeHouseMenu = pancakeHouseMenu;
    //     this.dinerMenu = dinerMenu;
    //     this.cafeMenu = cafeMenu;
    // }

    // public void printMenu(){
    //     Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
    //     Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
    //     Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();

    //     System.out.println("메뉴\n-------\n아침 메뉴");
    //     printMenu(pancakeIterator);

    //     System.out.println("\n점심 메뉴");
    //     printMenu(dinerIterator);

    //     System.out.println("\n디저트 메뉴");
    //     printMenu(cafeIterator);
    // }

    private void printMenu(Iterator<MenuItem> iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + ", ");
            System.out.println(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

}