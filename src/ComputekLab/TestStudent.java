package ComputekLab;

public class TestStudent {

	public static void  main(String[] args) {
		
		Student s1=new Student("yehia","zak",20,1.0,5.0);  
		Student s2=new Student("alaa","fathy",30,2.0,2.0);  
		//double ALL=s1.Avg();
		
		s1.setFirstName("mariam");
		
		String nameSchool=Student.getSchoole();
	
		System.out.println(
				" \n\t"+"Name Of School : "+nameSchool+
				"\n**Student1**"+
				" \n\t"+"FirstName : "+s1.getFirstName()+
				" \n\t"+"LastName : "+s1.getLastName()+
				" \n\t"+"Age : "+s1.getAge()+
				" \n\t"+"Average = "+s1.Avg()+
				"\n**Student2**"+
				" \n\t"+"FirstName : "+s2.getFirstName()
				+" \n\t"+"LastName : "+s2.getLastName()
				+" \n\t"+"Age : "+s2.getAge()
				+" \n\t"+"Average : "+s2.Avg());
		/*public String pearson() {
			String m=s1.getFirstName()
         String    n=s1.getLastName();
			 
			 return m;
		}*/
	float x=10.5f;
	int y=(int)x;
	System.out.println(y+" ");
	int c=y>>1;
	int z=100>>1;
	System.out.println("\n"+z+" "+c);
	
	
	}

}
