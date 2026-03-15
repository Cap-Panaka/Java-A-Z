public class Main {
    public static void main(String[] args) {
        //THey help protect object data and add rules for accessing or modifying them.
        //GETTERS = Methods that make a field READABLE
        //SETTERS = MEthods that make a field WRITABLE

        Car car = new Car("Charger", "Yellow", 10000);

        //car.model="Corvette";
        car.setColor("Blue");
        car.setPrice(-1000);

        /*Price can't be negative
Blue Charger $10000*/

        System.out.println(car.getColor() + " "+ car.getModel()+" "+ car.getPrice());
    }
}


public class Car {
    private final String model;
    private String color;
    private int price;


    Car(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    String getModel()
    {
        return this.model;
    }
    String getColor()
    {
        return this.color;
    }
    String getPrice()
    {
        return "$" +this.price;
    }

    void setColor(String color)
    {
        this.color = color;
    }
    void  setPrice(int price)
    {
        if(price < 0)
        {
            System.out.println("Price can't be negative");
        }
        else {
            this.price = price;
        }
    }


}
