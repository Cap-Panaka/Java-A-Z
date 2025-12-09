//  \(A=P(1+\frac{r}{n})^{nt}\)
import java.util.Scanner;
 public class Main{
     public static void main(String[] args)
     {
         Scanner scanner = new Scanner(System.in);
         // Compound interest calculator

         double principal;
         System.out.print("Enter the principal amount: ");
         principal = scanner.nextDouble();

         double rate;
         System.out.print("Enter the interest rate (in %): ");
         rate = scanner.nextDouble()/100;

         int timesCompounded;

         System.out.print("Enter the # of times compounded per year: ");
         timesCompounded= scanner.nextInt();

         int years;
         System.out.print("Enter the # of years: ");
         years = scanner.nextInt();

         double amount= principal * Math.pow(1 + rate/timesCompounded, timesCompounded*years);

         System.out.printf("The amount after %d years is $%.2f", years, amount);
         scanner.close();
     }
 }
 
 //Enter the principal amount: 10000
//Enter the interest rate (in %): 2
//Enter the # of times compounded per year: 4
//Enter the # of years: 2
//The amount after 2 years is $10407.07
