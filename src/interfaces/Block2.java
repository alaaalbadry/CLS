package interfaces;

public class Block2 extends Block1 implements InterfaceB {
	
    public String  MethodIA1() {
    	
    	return "Iam in implementation of MethodIA1 for Block2";
    	
    }
	
	public String MethodIA2() {
		
		return "Iam in implementation of MethodIA2 for Block2";
		
	}

	public String MethodIB1() 
	{
		
		return "Iam in implementation of MethodIB1 for Block2";
		
	}
	
	public String MethodIB2()
	{
		return "Iam in implementation of MethodIB2 for Block2";
	}
	
}
