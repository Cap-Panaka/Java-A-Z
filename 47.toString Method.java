public class Main{
    public static void main(String[] args){

        // toString() = Method inherited from the Object class
        //              Used to return a string representation of an object
        //              By default , it returns a hash code as a unique identifier.
        //              It can be overridden to provide meaningful details.

        Car car1 =  new Car("FOrd", "Mustang", 2025, "Red");
        Car car2= new Car("Chervolet","Corvette",2026,"Blue");

        System.out.println(car1);
        System.out.println(car2);

        /*Red 2025 FOrd Mustang
Blue 2026 Chervolet Corvette*/

        //System.out.println(car.color + " " + car.year+ " " + car.make+ " "+ car.model);
    }
}


public class Car {
    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return this.color + " " + this.year+ " " + this.make+ " "+ this.model;

    }
}

