package task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu;

    public Cafe() {
        coffeeMenu = new ArrayList<>();
    }

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void addCoffee(String coffeeName) {
        coffeeMenu.add(coffeeName);
    }
    public void loadMenuData(){
        try {
            File file = new File("coffees.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                coffeeMenu.add(scanner.nextLine());
            }
        } catch(FileNotFoundException e) {
            System.out.println("File not found, check path and filename");
        }
    }
}


