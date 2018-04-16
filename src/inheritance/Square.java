package inheritance;

public class Square extends Quad{

	public Square () {
		System.out.println("Square created");
	}
	public double area () {
		return Math.pow(x, 2);
	}
	
	
	
}
