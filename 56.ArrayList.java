import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //ArrayList = A resizeable array that stores objects (autoboxing)
        //            Arrays are fixed in size , but ArrayLists can chang.
       /* ArrayList<Double> list = new ArrayList<>();

        list.add(3.14);
        list.add(1.54);
        list.add(2.90);  //[3.14, 1.54, 2.9]

        System.out.println(list); */


        ArrayList<String> fruits= new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Watermelon");


    //    fruits.remove(1);  //[Apple, Banana, Watermelon]

    //    fruits.set(1, "Pineapple"); //[Apple, Pineapple, Banana, Watermelon]

    //    System.out.println(fruits.get(1)); //Orange

    //    System.out.println(fruits.size()); //4

    //    Collections.sort(fruits); //[Apple, Banana, Orange, Watermelon]

        for(String fruit:fruits){
            System.out.println(fruit);
        }
        
        /*Apple
Orange
Banana
Watermelon*/


        //System.out.println(fruits);



    }
  
}



//Practice prob
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.println("Enter the # of food you would like: ");
        int numOfFood = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= numOfFood; i++) {

            System.out.println("Enter food #" + i + ": ");
            String food = sc.nextLine();
            foods.add(food);
        }
        System.out.println(foods);

        sc.close();
        
        /*Enter the # of food you would like: 
4
Enter food #1: 
Pizza
Enter food #2: 
Hotdog
Enter food #3: 
Hamburger
Enter food #4: 
Taco
[Pizza, Hotdog, Hamburger, Taco]*/

    }
}









