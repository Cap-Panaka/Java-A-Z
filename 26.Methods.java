 public class rick {
    public static void main(String[] args){

         // method =  a block of reusable code that is executed when called ()
		 
		 int age= 20;
		 String name = "Spongebob";
		 
		 HappyBirthday(age,name);
		 
		 
    }
	static void HappyBirthday(int yr, String name)
	{
		System.out.println("Happy birthday to you!");
		System.out.printf("Happy Birthday Dear %s\n",name);
		System.out.printf("You are %d years old\n",yr);
		System.out.println("Happy Birthday to you!\n");
		
	}
	
	/*Happy birthday to you!
Happy Birthday Dear Spongebob
You are 20 years old
Happy Birthday to you! */


   2.
    //retrun 
 public class rick {
    public static void main(String[] args){
		double res = square(3);
		System.out.print(res);
		

	
	}
	static double square(double num)
	{
		
	   return 	num * num ;
	}
	//9.0
	


	
 }

   3. 

   
 public class rick {
    public static void main(String[] args){
	double x = 3;
	System.out.println(cube(3));


	}
	
	static double cube(double number){
	return number*number*number;
	}
	//27
 }	
	
}
4. 


	
 public class rick {
	 public static void main(String[] args)
	 {
		 int age = 21;
		 
		 if(ageCheck(age))
		 {
			 System.out.println("You may sign up!");
		
		 } 
		 else{
			 System.out.println("You must be 18+");
		 }
	 }
	   static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }
        else{
            return false;
        }
    }
	//You may sign up!
	 
    
 }
