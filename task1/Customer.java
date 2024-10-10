package task1;

public class Customer {
    String firstName;
    String lastName;
    String username;
    int id;
    static int counter = 0;


    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = counter++;
        }


    public String toString() {
        return "First name: " + firstName + "\n" + "Last name: " + lastName + "\n" + "Username: "+ username + "\n" +"User ID: "+ id;
    }
    }

