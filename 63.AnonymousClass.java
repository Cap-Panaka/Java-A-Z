public class Main{
    public static void main(String[] args){
        //Anonymous class = A class doesn't have a name , Can't be reused.
        //                  Add custom behavior without having to create a new class.
        //                  Often used for one time uses (TImerTask, Runnable, callbacks)


        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void speak()
            {
                System.out.println("Scooby Doo says Ruh Roh");
            }

        };

        dog1.speak();
        dog2.speak();
    }
}

public class Dog {
    void speak()
    {
        System.out.println("THe dog goes woof");
    }
}



