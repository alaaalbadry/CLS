package exceptions;

public class Handling {

	public static void main(String[] args) {
		String [] array;
		
		try {
			  array=new String [5];
			  array[0]=null;
			  System.out.println(array[0]);
			   array[6]="Hello";
			 int g=5/0;
			 
		}catch(ArithmeticException ex) {
			ex.printStackTrace();
			System.out.println(" \n");
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		
		}
		

	}

}
