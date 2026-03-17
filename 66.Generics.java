import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Generics = A concept where you can write a class, interface, or method
        //           that is compatible with different data types.
        //           <T> type parameter (placeholder that gets replaced with a real type)
        //           <String> type argument (specifies the type)

        /*Box<String> box = new Box<>();

        box.setItem("banana");  //banana

        System.out.println(box.getItem()); */

        /*
        Box<Double> box = new Box<>();
        box.setItem(3.14);
        System.out.println(box.getItem()); //3.14
*/

        Product<String , Double> product1 = new Product<>("apple",0.50);
        Product<String , Double> product2 = new Product<>("pineapple",0.10);


        System.out.println(product1.getItem() +" "+product1.getPrice());
        System.out.println(product2.getItem() +" "+product2.getPrice());
    }
}


public class Product<T, U> {

    T item ;
    U price ;

    Product(T item, U price) {
        this.item = item;
        this.price = price;
    }

    public T getItem() {
        return this.item;
    }
    public U getPrice() {
        return this.price;
    }
}


public class Box<T> {

    T item;

    public void setItem(T item)
    {
        this.item = item;
    }

    public T  getItem()
    {
        return this.item;
    }



}













