package labtask2;


	import java.util.Scanner;
import java.util.StringTokenizer;

	public class Spliter {
		
		

		
		public static void main(String[] args) {
			
			
			
		
			Scanner Sc=new Scanner(System.in);
			
			System.out.println("Enter IP address");
			String ip =Sc.nextLine();
			StringTokenizer st=new  StringTokenizer(ip,".");
			while(st.hasMoreTokens()) {
				System.out.println(st.nextToken()+" "+st.countTokens()+" "+st.hasMoreElements());
			}
			
			
						
		/*		
				String x [] =ip.split(" .");
				
			for (String i:x) {
				System.out.println(i);
			}
			*/

			
		}
		
		
	}



