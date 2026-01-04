//Car.java

public class Car {

    String model;
    String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void drive()
    {
        System.out.println("You drive the "+ this.color + " " + this.model);
    }



}

//Main.java
public class Main
{
    public static void main(String[] args)
    {



        Car car1 = new Car ("Mustang","Red");
        Car car2 = new Car ("Corvette","Blue");
        Car car3 = new Car ("Charger","Yellow");



        Car[] cars = {car1,car2,car3};

        /*
        for(int i=0;i<cars.length;i++)
        {
            cars[i].drive();
        }

         Car[] cars = {new Car("Mustang", "Red"),
                              new Car("Corvette", "Blue"),
                              new Car("Charger", "Yellow")};

        */

        for(Car car : cars)
        {
            car.drive();
        }



    }
}




/*You drive the Red Mustang
You drive the Blue Corvette
You drive the Yellow Charger */
