//Main.java
public class Main {
    public static void main(String[] args) {

        // Inheritance = One class inherits the attributes and methods
        //                         from another class.
        //                         Child <- Parent <- Grandparent

        Dog dog = new Dog();
        Cat cat = new Cat();


        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        Plant plant = new Plant();

        System.out.println(plant.isAlive);
        plant.photosynthesis();



    }
}

//Organism.java

public class Organism {

    boolean isAlive;

    Organism(){
        isAlive = true;
    }
}

//Plant.java

public class Plant extends  Organism{

    void photosynthesis()
    {
        System.out.println("The plant absorbs sunlights");
    }
}

//Animal.java

public class Animal extends Organism{


    void eat(){
        System.out.println("This animal is eating");
    }
}

//Cat.java
public class Cat extends Animal{

    int lives = 9;

    void speak() {
        System.out.println("The cat goes *meow*");
    }
}


//DOg.java

public class Dog extends Animal{

    int lives = 1;

    void speak(){
        System.out.println("The dog goes *woof*");
    }
}

