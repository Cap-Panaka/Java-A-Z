//1.
// import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args)
//    {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your name: ");
//        String name = scanner.next();
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        System.out.print("What is your gpa: ");
//        double gpa = scanner.nextDouble();
//
//        System.out.print("Are you a student? (true/false)");
//        boolean isStudent = scanner.nextBoolean();
//
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age +" years old");
//        System.out.println("Your gpa is " + gpa);
//        System.out.println("Student: " + isStudent);
//
//        if(isStudent)
//        {
//            System.out.println("You are enrolled as a student");
//        }
//        else
//        {
//            System.out.println("You are NOT enrolled as a student");
//        }
//
//
//        scanner.close();
//    }
//
//
//}


//Hello Nafiz
//You are 20 years old
//Your gpa is 60.0
//Student: false
//You are NOT enrolled as a student

//2.
// import java.util.Scanner;
//public class Main
//{
//    public static void main(String[] args)
//    {
//        //COMMON ISSUES
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Enter your favourite color");
//        String color = scanner.nextLine();
//
//        System.out.println("You are " + age + " years old");
//        System.out.println("You like the color " + color);
//
//
//        scanner.close();
//    }
//
//}

//Enter your age: 20
//Enter your favourite color
//red
//You are 20 years old
//You like the color red


//3.
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        //Calculate area of a rectangle

        double width = 0;
        double  height = 0;
        double area = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width: ");
        width =  scanner.nextDouble();

        System.out.print("Enter the width: ");
        height =  scanner.nextDouble();

        area = width * height;

        System.out.println("The area of the rectangle is: " + area + "cm^2");


        scanner.close();
    }

}


//Enter the width: 3.2
//Enter the width: 4.3
//The area of the rectangle is: 13.76cm^2
