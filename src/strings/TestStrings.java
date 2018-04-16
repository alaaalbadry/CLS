package strings;

import java.util.concurrent.SynchronousQueue;

public class TestStrings {

	public static void main(String[] args) {
		 
	/*	String s="Alaa";  //		 String is immutable // mn no3 primitive byt3'zn as constant
		
		s.concat("fathy");
		System.out.println(s);
		s=s.concat(" Fathy");
		System.out.println(s);
		s=s.concat(" Albadry");
     System.out.println(s);     */
		
		String s0="193.131.168.252";
		String s1="Alaa Fathy";
		String s2=new String("Alaa");
		String s3="ALAA";
		String s4="Fathy";
//		System.out.println(s1.equals(s4));
//		System.out.println(s1.equalsIgnoreCase(s2));
//		System.out.println(s1.equals(s3));
//		
//		if(s1==s2) {
//			System.out.println("equal");
//		}else {
//			System.out.println("not equal");
//		}
//		if(s1==s3) {
//			System.out.println("equal");
//		}else {
//			System.out.println("not equal");
//		}
//		System.out.println(s1.compareTo(s2)+"\n "+s1.compareTo(s4)+" \n"+s1.compareToIgnoreCase(s3));
//System.out.println(s0.replace(".", "\n")); // split by replace
	
//		for(int i=0;i<s0.length();i++) {
//			if(s0.contains(".")) {
//				s0=s0.replace(".", "\n");	
//			}
//			
//		}
//		System.out.println(s0);
	
	
//		 System.out.println(s0.substring(0,3)+"\n"+s0.substring(4,7)+"\n"+s0.substring(8,11)+"\n"+s0.substring(12,15));
		 String s20=new String("alaa");
		 String str1="alAa";
		 String str2="alaa";
		
		System.out.println(equals(str1,str2));//false
		
		System.out.println(equalsIgnorCase(str1,str2));//false
		
		
//		System.out.println(str1.compareToIgnoreCase(str2));//true 0
		
		
	
	}
		
	 public static boolean equals(String str1,String str2) {
		boolean s=false;
		 if(str1.length()!=str2.length()) {
			s= false;
		 }
		 else {
	 for(int i=0;i<str1.length();i++) {
			 
				 if(str1.charAt(i)==str2.charAt(i)) {
			    s=true;
				 }else {
				s= false;
				break;	
				 }
				
		 }
		 }
		return s;
	 }
		public static boolean equalsIgnorCase(String s1,String s2) {
			
			if(s1.length() != s2.length()) {
				return false;
			}else {
				for(int i=0;i<s1.length();i++) {
					if(s1.charAt(i)!=s2.charAt(i)&&s1.compareToIgnoreCase(s2)!=0) {
						return false;
					}
				}
			}
			
			return true;
		}
		
		
		
		
	}


