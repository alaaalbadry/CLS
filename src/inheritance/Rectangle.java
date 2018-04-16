package inheritance;

public class Rectangle  extends Quad{
	
	public Rectangle() {
		System.out.println("Rectangle created");
	}


	public double area() {
		Quad Q=new Quad();
		Q.getX();
		Q.getY(); 
		return x*y;
		
	}
	
	public double area(int x) {
		
		return x;
		
	}
	
}
