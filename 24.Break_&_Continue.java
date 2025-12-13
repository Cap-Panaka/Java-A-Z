public class rick {
    public static void main(String[] args){
        
        // break = break out of a loop (STOP)
        // continue = skip current iteration of a loop (SKIP)

        for(int i = 0; i < 10; i++){
            if(i == 4){
                //break; // 0 1 2 3
                continue; // 0 1 2 3 5 6 7 8 9
            }
            System.out.print(i + " ");
        }
    }
}
