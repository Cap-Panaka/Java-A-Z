import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        //Runtime polymorphism = When the method that gets executed is decided
        //                       at runtime based on the actual type of the object

        Scanner sc = new Scanner(System.in);

        Animal animal;

        System.out.println("WOuld you like a dog or a cat? (1 = dog , 2= cat): ");
        int choice = sc.nextInt();

        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }



    }
}


public abstract  class Animal {

    abstract void speak();

}


public class Dog extends Animal{
    @Override
    void speak() {
        System.out.println("The dog goes uff");
    }
}


public class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("The cat goes meow");
    }
}






















