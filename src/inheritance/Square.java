package inheritance;

public class Square extends Quad{

	public Square () {
		System.out.println("Square created with First Constructor");
	}
	public Square(double x) {
		this.x=x;
		System.out.println("Square created with seconed Constructor");
	}
	public double area () {
		return Math.pow(x, 2);
	}
	
	
	
}
