//import java.util.Random;
//
//public class Main
//{
//    public static void main(String[] args)
//    {
//        Random random = new Random();
//
//        int number1;
//        int number2;
//        int number3;
//
//        number1 =random.nextInt(1,101); //87
//        number2 =random.nextInt(1,101); // 56
//        number3 =random.nextInt(1,101);//11 (random)
//
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);
//
//    }
//
//
//}

//2
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Random random = new Random();

        double num; //0.5495336113614218

        boolean isHeads;
        isHeads = random.nextBoolean();

        num= random.nextDouble();
         System.out.println(num);
       // System.out.println(isHeads);

        if(isHeads)
        {
            System.out.println("HEADS");
        }
        else
        {
            System.out.println("Tails");
        }

    }
}

//0.6800870796856809
//HEADS
//
