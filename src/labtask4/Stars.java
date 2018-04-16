package labtask4;

import java.util.Scanner;

public class Stars {

	public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		System.out.println("Enter Any Number");
		int input=Sc.nextInt();
		
		for(int i=0;i<input;i++) {
			for(int j=0;j<=i;j++) {
				
				System.out.print("*");
			
			}
			System.out.println("\n");
		}
		System.out.println("--------------------------------------------------------");
		for(int i=0;i<input;i++) {
			for(int j=0;j<=input-i;j++) {
				
				System.out.print(" ");
			
			}
           for(int j=0;j<=i*2;j++) {
				
				System.out.print("*");
			
			}
		
			System.out.println("\n\t");
		
		}
		System.out.println("__________________________________________________________");
		
		for(int i=0;i<input;i++) {
			for(int j=0;j<input-i;j++) {
				
				System.out.print(" ");
			
			}
           for(int j=0;j<=i*2;j++) {
				
				System.out.print("*");
			
			}
		
			System.out.println("\n\t");
		
		}
		
		for(int i=1;i<input;i++) {
	for(int j=0;j<=i;j++) {
				
				System.out.print(" ");
			
			}
			   
			
		for(int j=1;j<(input-i)*2;j++) {
			
			System.out.print("*");
		
		}
		System.out.println("\n");
		}
			
	}

}
