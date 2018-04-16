package inheritance;

public class Circle extends Shape {

    private double radius;
    
    public Circle() {
    	System.out.println("Circle Created");
    }
    
    public Circle(double radius) {
		// TODO Auto-generated constructor stub
    	this.radius=radius;
	}
    


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		 double PI=Math.PI;
		 double a=PI*radius*radius;
	    	return a;
	    }
    
	public double area(int y) {
		 return y;
	    }
	
	
	
}
