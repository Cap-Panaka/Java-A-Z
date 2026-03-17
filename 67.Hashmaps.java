import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //HashMap = A data structure that stores key-value pairs
        //          Keys are unique, but values can be duplicated
        //          Does not maintain any order, but is memory efficient
        //          HashMap<Key, Value>

        HashMap<String, Double> map = new HashMap<>();

        map.put("apple",0.50);
        map.put("orange",0.75);
        map.put("banana",0.25);
        map.put("coconut",1.00);

        map.remove("apple");

        map.put("orange",1000000.00);

        //System.out.println(map);  //{orange=1000000.0, banana=0.25, coconut=1.0}

        //System.out.println(map.get("orange")); //1000000.0

        //System.out.println(map.containsKey("banana")); //true
/*
        if(map.containsKey("banana")){
            System.out.println(map.get("banana"));

        }
        else {
            System.out.println("Key not found");
        }  //0.25
*/
       // System.out.println(map.containsValue(1.00)); 1 == false //true

        //System.out.println(map.size()); //3

        //System.out.println(map);  //{orange=1000000.0, banana=0.25, coconut=1.0}

        for(String key : map.keySet()) {
            System.out.println(key + " : $"+ map.get(key));

            /*orange : $1000000.0
banana : $0.25
coconut : $1.0*/
        }

    }
}
