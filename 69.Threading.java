import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Threading = Allows a program to run multiple taks simultaneously
        //            HElps improve performance with time consuming operations
        //            (File I/O, network communications, or any background tasks)

        //How to create a Thread
        //OPtion 1. Extend the Thread class (simpler)
        //OPtion 2. Implement the Runnable interface (better)

        Scanner scanner = new Scanner(System.in);
        System.out.println("You have 5 seconds to enter your name");
        //System.out.print("Enter your name: ");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true);
        thread.start();


        System.out.println("Enter your name: ");
        String name =   scanner.nextLine();
        System.out.println("Hello " + name);


        scanner.close();

    }
 }



public class MyRunnable implements Runnable{
    @Override
    public void run() {

        for(int i = 1; i<=5;i++)
        {
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }

            if(i==5){
                System.out.println("Time's up!");
                System.exit(0);
            }
        }

    }
}






