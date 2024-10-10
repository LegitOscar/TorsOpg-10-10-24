package task1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();


        customers.add(new Customer("Mike","Larry","Marry23"));
        customers.add(new Customer("John","Oswald","Grim"));
        customers.add(new Customer("Jack","Frost","Frozone"));

         printCustomers(customers);
        }
    public static void printCustomers(ArrayList<Customer> customers){
        for(Customer c : customers){

            System.out.println(c);}
    }

}
