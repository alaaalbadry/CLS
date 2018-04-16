package ComputekLab;

public class Student {

	private String firstName,lastName;
	
	private int age;
	
	double mathScore;
	double sienceScore;
	public Student(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Student(String firstName, String lastName, int age, double mathScore, double sienceScore) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.mathScore = mathScore;
		this.sienceScore = sienceScore;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMathScore() {
		return mathScore;
	}
	public void setMathScore(double mathScore) {
		this.mathScore = mathScore;
	}
	public double getSienceScore() {
		return sienceScore;
	}
	public void setSienceScore(double sienceScore) {
		this.sienceScore = sienceScore;
	}
	
	
	public static String getSchoole() {
		
		return "pronto";
	}
	public double Avg() {//(double mathScore,double ScienceScore) {
		
		 double Average =0;
		 
		 Average= (mathScore+sienceScore)/2;
		 
		 return Average;
		 
	}
	
}
