package 반복자패턴;

import java.util.ArrayList;
import java.util.List;

import 반복자패턴.domain.Menu;

public class MenuTestDrive {
    private static List<Menu> MENUS = new ArrayList<Menu>();
    public static void main(String[] args){
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu cafeMenu = new CafeMenu();

        addMenuItems(pancakeHouseMenu);
        addMenuItems(dinerMenu);
        addMenuItems(cafeMenu);

        Waitress waitress = new Waitress(MENUS);
        waitress.printMenu();

        // Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        // waitress.printMenu();
    }

    private static void addMenuItems(Menu item){
        MENUS.add(item);
    }
}
