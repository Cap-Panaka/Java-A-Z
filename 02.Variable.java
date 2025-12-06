public class Main
{
    public static void main(String[] args)
    {
        // ❎ variable = A reusable container for a value.
        //                           A variable behaves as if it was the value it contains.

        // 🟥 Primitive = simple value stored directly in memory (stack)
        // 🟦 Reference = memory address (stack) that points to the (heap)

        // 🟥 Primitive vs 🟦 Reference
        //    ---------                      ---------
        //    int                           string
        //    double                    array
        //    char                        object
        //    boolean

//        2 steps to creating a variable
//            ---------------------
//            1.declaration
//            2.assignment


        int age = 30;
        int year = 2025;
        int quantity = 1;
       // System.out.println("This is the year " + year);

        double price = 19;
        double gpa = 3.5;
        double temperature = -12.5;

       // System.out.println("$" + price);


        char grade ='A';
        char symbol ='!';
        char currency = '$';

        //System.out.println(grade);

        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;

//        if (isStudent) {
//            System.out.println("You are a student");
//        }
//        else {
//            System.out.println("You are not a student");
//        }

        String name ="Cap. Panaka";
        String food ="pizza";
        String email = "bambola123@gmail.com";
        String car="Mustang";
        String color ="red";

//        System.out.println("Hello " + name);
//        System.out.println("Your favourite food is "+ food);
//        System.out.println("Your are "+age+" years old");
//        System.out.println("Your gpa is: "+ gpa);
//        System.out.println("Your average letter grade is: " + grade);
        System.out.println("Your choice is a " + color + " "+ year + " "+ car );
        System.out.println("The price is: " + currency + price);
        if(forSale)
        {
            System.out.println("There is a " + car +" for sale");
        }
        else
        {
            System.out.println("There is a " + car +" not for sale");
        }
    }

}
