package labtask3;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Scanner Sc= new Scanner(System.in);
		
		Calculator Cal=new Calculator();
		
		System.out.println("Enter the first num");
		double num1=Sc.nextDouble();
		
		System.out.println("Enter the seconed num");
		double num2=Sc.nextDouble();
		
		while(true) {
		
		System.out.println("choose the num of operation 1-Add / 2-Sub / 3-Mul / 4-Div ");
		int x =Sc.nextInt();
		switch(x) {
		
		case 1: System.out.println("the Result = "+ Cal.add(num1, num2));
		   break;
		case 2: System.out.println("the Result = "+ Cal.sub(num1, num2));
		   break;
		case 3: System.out.println("the Result = "+ Cal.mul(num1, num2));
		   break;
		case 4: System.out.println("the Result = "+ Cal.div(num1, num2));
		   break;
		}
	}

	}

}
