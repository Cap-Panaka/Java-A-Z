public class Main {
    public static void main(String[] args) {

        //Polymorphism= "POLY" = "MANY"
        //              "MORPH" = "SHAPE"
        //              objects can identify as other objects.
        //              objects can be treated as objects of a common superclass.

        Car car = new Car();
        Bike  bike = new Bike();
        Boat boat = new Boat();

       /* car.go();
        bike.go();
        boat.go();*/

        Vehicle[] vehicles = {car,bike,boat};

        for(Vehicle vehicle : vehicles){
            vehicle.go();

          /*You drive the car
You ride the bike
You sail the boat*/
        }

    }


}

public abstract class Vehicle {

    abstract void go();

}


public class Car extends Vehicle{
    @Override
    void go()
    {
        System.out.println("You drive the car");
    }

}


public class Bike extends Vehicle{
    @Override
    void go()
    {
        System.out.println("You ride the bike");
    }

}




public class Boat extends Vehicle{

    @Override
    void go()
    {
        System.out.println("You sail the boat");
    }
}











