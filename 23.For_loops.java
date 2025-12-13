import java.util.Scanner;

public class rick
{
	public static void main(String[] args) throws InterruptedException
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How many seconds to count from?: ");
		int start = scanner.nextInt();
		
		
		for(int i = start ; i> 0; i--){
		System.out.println(i);
		Thread.sleep(1000);
		}
		
		System.out.println("HAPPY NEW YEAR!");
		
		/*20
20
19
18
17
16
15
14
13
12
11
10
9
8
7
6
5
4
3
2
1
HAPPY NEW YEAR!*/
		
		
		
		
		
		/*Exp 1
		System.out.print("Enter how many times you want to loop: ");
		int max = scanner.nextInt();
		
		for(int i = 1; i<=max ; i++)
		{
			System.out.println(i);
		} 
		
		Enter how many times you want to loop:3
		1
		2
		3
		
 
		
		*/
		
		
		scanner.close();
		
		
	}
	
} 
