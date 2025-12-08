import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String name;
        double price;
        int quantity;
        char currency ='$';

         System.out.print("What item would you like to buy?: ");
         name = scanner.nextLine();

         System.out.print("What is the price for each?: ");
         price =scanner.nextDouble();

         System.out.print("How many would you like?: ");
         quantity = scanner.nextInt();

         double total = price * quantity;
         System.out.println("\nYou have bought " + quantity + " "+ name+"/s");
         System.out.println("Your total is " + currency +total);

         scanner.close();

    }
}

/*What is the price for each?: 12.99
How many would you like?: 3

You have bought 3 pizza/s
Your total is $38.97*/
