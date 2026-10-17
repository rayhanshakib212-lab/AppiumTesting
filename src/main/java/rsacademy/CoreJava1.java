package rsacademy;

import java.util.ArrayList;

public class CoreJava1 {

	public static void main(String[] args) {
        System.out.println( "Hello, we are going to practice!" );
        
     int num = 0;
     double dec =0.888;
     int [] arr2 = {1,2,3,4,5,6};
     int [] evennumbers = new int [100];
     ArrayList<String> a = new ArrayList<String>();
     
     
     for(int i=0; i<arr2.length;i++) {
    	 
    	 if(arr2[i]%2==0) {
    	     System.out.println(arr2[i]+ " is even");
    	    //break;

    	 }else {
    		 System.out.println(arr2[i]+" not even");
    	 }
    	 
     }
     
     ArrayList<String> namelist = new ArrayList<String>();
     namelist.add("tim");
     namelist.add("jim");
     namelist.add("sal");
     System.out.println(namelist.get(1));
     
     
     
     String s = " rahul shetty academy";
    String[] splittedString= s.split(" ");

     
     
     
     
        
        
        
        
        
        
        

	}

}
