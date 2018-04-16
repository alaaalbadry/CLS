package inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Shape R1=new Rectangle(10,10);
		Quad Q1= new Quad();
		
		System.out.println(R1.area());//override from shape
		
		Rectangle r1=new Rectangle();
		
		System.out.println(r1.area(4));//overload from rectangle
		
		Shape C1=new Circle(10);
		System.out.println(C1.area());
		
		Circle c1=new Circle(10);
		System.out.println(c1.area(10)+" #### "+c1.area());
		
		Shape S1=new Square(10);
		
		System.out.println(S1.area());
	

       
       
	}

}
