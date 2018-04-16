package labtask3;

public class Calculator {
	
	
	private double num1;
	private double num2;
	

	
	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}

	public double add(double num1,double num2) {
		double x=num1+num2;
		return x;
	}
	
	public double sub(double num1,double num2) {
		double x=num1-num2;
		return x;
	}
	
	public double mul(double num1,double num2) {
		double x=num1*num2;
		return x;
	}
	public String div(double num1,double num2) {
		String str;
		double x=0;
		if(num2==0) {
			return str="error";
		}else {
			
			 x=num1/num2;
			 str=Double.toString(x);
		}
		return str;
	}
	
	
	
	

}
