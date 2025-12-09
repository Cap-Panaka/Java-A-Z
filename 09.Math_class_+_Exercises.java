//1.public class Main{
//    public static void main(String[] args)
//    {
//
//        //System.out.println(Math.PI);  //3.141592653589793
//                                        // 2.718281828459045
//        //System.out.println(Math.E);
//
//        double result;
//
//        result = Math.pow(2, 3); // 8
//        result = Math.abs(-5); // 5.0
//        result= Math.sqrt(9); // 3.0
//        result = Math.round(3.14); //3.0
//        result = Math.ceil(3.14); //4.0
//        result = Math.floor(3.99);  //3.0
//        result = Math.max(10, 20); //20.0
//        result = Math.min(10, 20); //10.0
//
//
//        System.out.println(result);
//    }
//}



//2
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args)
//    {
//        //HYPOTENUSE c = Math.sqrt(a^2 + b^2)
//        Scanner scanner = new Scanner(System.in);
//
//        double a;
//        double b;
//
//        System.out.print("Enter the length of side A: ");
//        a = scanner.nextDouble();
//
//        System.out.print("Enter the length of side B: ");
//        b= scanner.nextDouble();
//
//        double c= Math.sqrt( Math.pow(a,2) + Math.pow(b,2));
//
//        System.out.println("The hypotenuse (side c) is: "+c);
//
//
//        scanner.close();
//
//    }
//}

//Enter the length of side A: 5
//Enter the length of side B: 12
//The hypotenuse (side c) is: 13.0
//



//3
// circumference = 2 * Math.PI * radius;
// area = Math.PI * Math.pow(radius, 2);
// volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

import java.util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double radius,area,circumference,volume;

        System.out.print("Enter radius: ");
        radius = scanner.nextDouble();

        circumference = 2*Math.PI*radius;
        area=Math.PI*Math.pow(radius,2);
        volume=(4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.printf("The circumference is: %.1fcm\n", circumference);
        System.out.printf("The area is: %.1fcm²\n", area);
        System.out.printf("The volume is: %.1fcm³\n", volume);




        scanner.close();
    }
}

//Enter radius: 5
//The circumference is: 31.4cm
//The area is: 78.5cm²
//The volume is: 523.6cm³
 //
