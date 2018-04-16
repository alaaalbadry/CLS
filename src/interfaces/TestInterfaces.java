package interfaces;

public class TestInterfaces {

	public static void main(String[] args) {
		
		InterfaceA ia=new Block2();
		     
		  System.out.println(ia.MethodIA1()); 
		  System.out.println(ia.MethodIA2());
		  
		System.out.println(((InterfaceB)ia).MethodIB1()); //((InterfaceB)ia).MethodIB1()
		System.out.println(((InterfaceB)ia).MethodIB2()); //((InterfaceB)ia).MethodIB2()
		
		InterfaceB ib=new Block2();
		
		System.out.println(ib.MethodIA1()); 
		System.out.println(ib.MethodIA2());
		
		System.out.println(ib.MethodIB1()); 
		System.out.println(ib.MethodIB2()); 
		
		
		String var1=((Block1)ia).MethodBlock1();
		System.out.println("var1 : "+ var1);
		
		String var2=((Block2)ia).MethodBlock1();
		System.out.println("var2 : "+ var2);
		
		String var3=ia.toString();
		System.out.println("var3 : "+ var3);
		
		String var4=ib.toString();
		System.out.println("var4 : "+ var4);
		
		InterfaceA ic= new Block3();  //Cannot instantiate the type Block3
		       
		String var5=ic.toString();
		System.out.println("var5 : "+ var5);
		
		Object o1=new Block2(); 
		
		System.out.println(((InterfaceA)o1).MethodIA1());
		System.out.println(((InterfaceB)o1).MethodIA1());
		System.out.println(((Block2)o1).MethodIA1());
		

	}

}
