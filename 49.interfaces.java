public class Main {
    public static void main(String[] args) {
        //Interface = A blueprint for a class that specifies a set of abstract methods
        //            that implementing classes MUST define
        //            Supports multiple inheritance-like behavior


        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        FIsh fish = new FIsh();


        rabbit.flee();
        hawk.hunt();

        fish.hunt();
        fish.flee();

        /*THe rabbit is running away
THe hawk is hunting
THE fish is hunting
THe fish is swimming away*/




    }
}
//Interfaces

public interface Predator {

    void hunt();
}

public interface Prey {

    void flee();

}



//Class

public class Rabbit implements Prey {

    @Override
    public void flee(){
        System.out.println("THe rabbit is running away");
    }
}


public class Hawk implements Predator{
    @Override
    public void hunt()
    {
        System.out.println("THe hawk is hunting");
    }

}

public class FIsh implements Prey , Predator{
    @Override
    public void flee()
    {
        System.out.println("THe fish is swimming away");
    }

    @Override
    public void hunt()
    {
        System.out.println("THE fish is hunting");
    }

}





















