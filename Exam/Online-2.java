public class Customer {

    String customerName;
    int age;
    boolean isStudent;

    // No-parameter constructor
    public Customer() {
    }

    // Parameterized constructor
    public Customer(String customerName, int age, boolean isStudent) {
        this.customerName = customerName;
        this.age = age;
        this.isStudent = isStudent;
    }

    // Method to calculate ticket price
    public double calculateTicketPrice(double baseTicketPrice) {
        if (age <= 12 && isStudent == true) {
            return baseTicketPrice * 0.80;
        } else if (age > 12 && isStudent == true) {
            return baseTicketPrice * 1.10;
        } else {
            return baseTicketPrice * 1.15;
        }
    }
}


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("Is Student: ");
        boolean isStudent = sc.nextBoolean();

        System.out.print("Base Ticket Price: ");
        double baseTicketPrice = sc.nextDouble();

        Customer c1 = new Customer(name, age, isStudent);

        double finalPrice = c1.calculateTicketPrice(baseTicketPrice);

        System.out.println(c1.customerName + "'s ticket price is " + finalPrice + " Tk.");
    }
