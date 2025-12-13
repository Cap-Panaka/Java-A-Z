import java.util.Scanner;
import java.util.Random;

public class rick
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int guess;
		int attempts=0;
		int min=1;
		int max=100;
		int randomNumber= random.nextInt(min,max+1);
		
		System.out.println("Number guessing game");
		System.out.println("Guess a number between "+ min + "-"+max+"\n");
		
		do
		{
			System.out.println("Enter a guess: ");
			guess = scanner.nextInt();
			attempts++;
			
			if(guess>randomNumber)
			{
				System.out.println("TOO HIGH!Try again");
			}
			else if(guess<randomNumber)
			{
				System.out.println("TOO LOW!Try again");
			}
			else
			{
				System.out.println("CORRECT!The number was"+ randomNumber);
				System.out.println("# of attempts:"+ attempts);
			}
			
		}
		while(guess!=randomNumber);
		
		
		
		
		
		
		scanner.close();
	}
	
}


/*Enter a guess:
3
TOO LOW!Try again
Enter a guess:
4
TOO LOW!Try again
Enter a guess:
10
TOO LOW!Try again
Enter a guess:
20
TOO LOW!Try again
Enter a guess:
34
TOO LOW!Try again
Enter a guess:
50
TOO LOW!Try again
Enter a guess:
70
TOO HIGH!Try again
Enter a guess:
60
TOO LOW!Try again
Enter a guess:
66
CORRECT!The number was66
# of attempts:9*/
