public class Main {
    public static void main(String[] args) {
        //Wrapper classes = Allow primitive values (int , char, double, boolean)
        //                   to be used as objects, "Wrap them in object"
        //                   Generally, don't wrap primitives unless you need an object.
        //                   Allows use of Colletions Framework and static Utility methods.

       /* Integer a = new Integer(123);
        Double b = new Double(3.14);
        Character c = new Character('$');
        Boolean d = new Boolean(true); */
/*
        //Autoboxing;
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;
       // String e = "Pizza";

        //Unboxing
        int x = a ;

*/
        /*
        String a =Integer.toString(123);
        String b =Double.toString(3.14);
        String c = Character.toString('@');
        String d = Boolean.toString(false);

        String x= a+b+c+d;

        System.out.println(x);  //1233.14@false
*/

        /*

        int a=Integer.parseInt("123");
        double b=Double.parseDouble("3.14");
        char c= "Pizza".charAt(0);
        boolean d = Boolean.parseBoolean("true");

        String x = a+ b+ c + d;

        System.out.println(x);  //java: bad operand types for binary operator '+'
                                //first type:  double
                                //second type: boolean


         */

        char letter = '$';
        char l2 = 'B';
        System.out.println(Character.isLetter(letter)); //false
        System.out.println(Character.isUpperCase(l2)); //true
        
        
        
        

    }
}
