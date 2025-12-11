public class String
{
    public static void main(String[] args)
    {
        String name = "Bro Code";
        String hehe = "   Panaka   ";
        String jojo ="Password";

//        int length =  name.length();
//        char letter = name.charAt(0);
//        int index = name.indexOf("o");
//        int lastIndex = name.lastIndexOf("o");

       // name = name.toUpperCase(); //BROCODE
       // name = name.toLowerCase(); //brocode
//        hehe = hehe.trim(); //Panaka
//        name = name.replace("o" , "a"); //bra Cade


        //System.out.println(length); 8
        //System.out.println(letter); B
        //System.out.println(index); 2
        //System.out.println(lastIndex); //5
       // System.out.println(name);
        //System.out.println(hehe);

       // System.out.println(name.isEmpty()); //false

//        if(name.isEmpty())
//
//        {
//            System.out.println("Your name is empty");
//        }
//        else {
//            System.out.println("Hello " + name);
//        }  //Hello Bra Cade

//
//        if(name.contains(" "))
//        {
//            System.out.println("Your name contains space");
//        }
//        else
//        {
//            System.out.println("Your name DOESN'T contain spaces");
//        } //Your name contains space


//        if(name.equals("password"))
//        {
//            System.out.println("Your name can't be password");
//        }
//        else
//        {
//            System.out.println("HEllo "+ name);
//        } //HEllo Bro Code

        if(jojo.equalsIgnoreCase("password"))
        {
            System.out.println("Your name can't be password");
        }
        else {
            System.out.println("Hello " + jojo);
        } //Your name can't be password




    }

}
