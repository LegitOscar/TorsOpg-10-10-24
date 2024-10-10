package task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Cafe cafe = new Cafe();

    cafe.loadMenuData();

    ArrayList<String> coffeeMenu = cafe.getCoffeeMenu();

    System.out.println("Coffee Menu: ");
    for(String coffee : coffeeMenu) {
        System.out.println(coffee);
    }
    }
}
