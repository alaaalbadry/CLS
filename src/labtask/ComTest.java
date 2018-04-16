package labtask;

import java.util.Scanner;

public class ComTest {

	public static void main(String[] args) {
	
	Scanner Sc=new Scanner(System.in);
	
	ComplexNum co=new ComplexNum();
	

	
	System.out.println("Enter Your First ComplexNum");
	    String complex1 =Sc.nextLine();
	System.out.println("Enter Your Seconed ComplexNum");
	    String complex2 =Sc.nextLine();  
	System.out.println("choose the operation number : 1-add , 2-sub"); 
	       int op =Sc.nextInt();
	   
	     switch(op) {
	     
	     case 1:  System.out.println("the reasult = " + co.addComplex(complex1, complex2));
	                   break; 
     case 2:   System.out.println("the reasult = " + co.subComplex(complex1, complex2));
                   break;
     default : System.out.println("Invalid num Of Operation");  
	     
	       }  
	     
	    }
    }
	      

	
	
	
	
	
	
	
	
	
	
	
	

