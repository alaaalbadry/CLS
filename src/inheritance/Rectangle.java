package inheritance;

public class Rectangle  extends Quad{
	
	public Rectangle() {
		System.out.println("Rectangle created");
	}
public Rectangle(double x,double y) {
	this.x=x;
	this.y=y;
}

	public double area() {
		 
			return  x*y;
	}
	
	public double area(int x) {
		
		return x;
		
	}
	
}
