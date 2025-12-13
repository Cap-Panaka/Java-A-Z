import java.util.Scanner;

public class rick
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		
		/* EXP 1
		
		 String name = "";
        
        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);
		
		
		Enter your name: jojo
Hello jojo
		*/
		
		
		
		/*EXP 2
		 String response = "";
        
        while(!response.equals("Q")){
            System.out.print("Press Q to quit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit");
		
		
		
		Press Q to quit: 3
Press Q to quit: 2
Press Q to quit: hehe
Press Q to quit: q
You have quit
		
		/*
		
		
		
	/*	exmp 3
		 int age ;
        
        do{
            System.out.println("Your age can't be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        }while(age < 0);
        
        System.out.println("You are " + age + " years old");
		
		
		Your age can't be negative
Enter your age: -2
Your age can't be negative
Enter your age: 3
You are 3 years old
		*/
		
		
		
		
		
		/*EXP 4
		
		
		Scanner scanner = new Scanner(System.in);
		
		int number = 0;
        
        do{
            System.out.print("Enter a number between 1-10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);
        
        System.out.println("You picked number: " + number); */
		
		/*Enter a number between 1-10: 89
Enter a number between 1-10: 90
Enter a number between 1-10: 6
You picked number: 6*/

    scanner.close();
		
	

	}	
}




