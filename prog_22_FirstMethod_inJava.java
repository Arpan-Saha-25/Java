
	/**
	 * Making a Method in java 
	 * 
	 */

public class prog_22_FirstMethod_inJava {

	    public static void function1(){
	        System.out.print("Hello there! :)");
	    }
	    static int sum(int x , int y){
	        System.out.printf("adding : %3d + %3d = ",x,y);
	        return x + y ;
	    }
	    
	    public static void main(String[] args) {
	        
	        // calling a non-static method 
	    	prog_22_FirstMethod_inJava obj = new  prog_22_FirstMethod_inJava();
	        System.out.println(obj.sum(3,4));
	        
	        //calling a static function 
	        System.out.println(sum(30,14));
	        
	        function1();
	        
	    }
	
}
