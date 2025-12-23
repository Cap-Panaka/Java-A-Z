public class Passenger {

    String name;
    double distanceTravelled ;
    boolean isPremiumMember;

    public Passenger ()
    {

    }

    // Parameterized constructor
    public Passenger(String  name, double distanceTravelled, boolean isPremiumMember)
        {
        this.name = name;
        this.distanceTravelled = distanceTravelled;
        this.isPremiumMember = isPremiumMember;
        }

    // Method to calculate ticket price
    public double calculateFare()
    {
        if(distanceTravelled >=15 && isPremiumMember == true)
        {
            return (distanceTravelled * 9 ) -10 ;
        }
        else if (distanceTravelled < 15 && isPremiumMember == true)
        {
            return (distanceTravelled * 10 ) - 9 ;

        }
        else
        {
            return distanceTravelled * 11;
        }
    }
}


import java.util.Scanner;

public class Main
{
    public static void main(String args[])
 {
    Scanner scanner = new Scanner(System.in);

     System.out.println("Name: ");
     String name = scanner.nextLine();

     System.out.println("Distance Travelled: ");
     int distanceTravelled = scanner.nextInt();

     System.out.println("Premium Member: ");
     boolean premiumMember = scanner.nextBoolean();


     Passenger passenger = new Passenger(name,distanceTravelled,premiumMember);

     double fare = passenger.calculateFare();
     System.out.println(passenger.name +"'s fare is "+fare );

    scanner.close();
 }
}
