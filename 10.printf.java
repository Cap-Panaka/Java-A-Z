//1
// public class Main{
//    public static void main(String[] args)
//    {
//        // printf() is a method used to format output
//
//        // % [flags] [width] [.precision] [specifier-character]
//
//        // [specifier-character]
//
//        String name = "Spongebob";
//        char firstLetter = 'S';
//        int age= 30;
//        double height = 60.5;
//        boolean isEmployed = true ;
//
//        System.out.printf("Hello %s\n", name);
//        System.out.printf("Your name starts with a %c\n", firstLetter);
//        System.out.printf("You are %d years old\n",age);
//        System.out.printf("You are %f inches tall\n",height);
//        System.out.printf("Emplyed: %b\n",isEmployed);
//
//        System.out.printf("%s is %d years old", name, age);
//    }
//
    //Hello Spongebob
    //Your name starts with a S
    //You are 30 years old
    //You are 60.500000 inches tall
    //Emplyed: trueSpongebob is 30 years old

//}


//2

// printf() is a method used to format output
//
//        // % [flags] [width] [.precision] [specifier-character]

//public class Main{
//    public static void main(String[] args)
//    {
//        double price1=9.99;
//        double price2 = 10000090.15;
//        double price3 = -54.01;
//
//        // + = output a plus
//        // , = comma grouping separator
//        // ( = negative numbers are enclosed in ()
//        // space = display a minus if negative, space if positive
//
//        System.out.printf("%+.2f\n", price1);
//        System.out.printf("%.2f\n", price2);
//        System.out.printf("%+.2f\n", price3);
//
//
//        System.out.printf("%,.2f\n", price2);
//
//        System.out.printf("%(2f\n", price3);
//
//        System.out.printf("% .2f\n", price1);
//        System.out.printf("% .2f\n", price2);
//        System.out.printf("% .2f\n", price3);
//
////+9.99
////10000090.15
////-54.01
//// 10,000,090.15
////(54.010000)
//// 9.99
//// 10000090.15
////-54.01
//
//    }
//}

//3
public class Main
{
    public static void main(String[] args)
    {
        // [width]

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("id: %04d\n", id1);
        System.out.printf("id: %04d\n", id2);
        System.out.printf("id: %04d\n", id3);
        System.out.printf("id: %04d\n", id4);


        System.out.printf("id: %4d\n", id1);
        System.out.printf("id: %4d\n", id2);
        System.out.printf("id: %4d\n", id3);
        System.out.printf("id: %4d\n", id4);

        System.out.printf("id: %-4d\n", id1);
        System.out.printf("id: %-4d\n", id2);
        System.out.printf("id: %-4d\n", id3);
        System.out.printf("id: %-4d\n", id4);

        //id: 0001
        //id: 0023
        //id: 0456
        //id: 7890
        //id:    1
        //id:   23
        //id:  456
        //id: 7890
        //id: 1
        //id: 23
        //id: 456
        //id: 7890
    }
}
