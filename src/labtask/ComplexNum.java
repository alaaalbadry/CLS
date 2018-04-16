package labtask;

public class ComplexNum {
	
	private double real;
	private double imag;
	

	
    public double getReal() {
		return real;
	}
	public void setReal(double real) {
		this.real = real;
	}
	public double getImag() {
		return imag;
	}
	public void setImag(double imag) {
		this.imag = imag;
	}
	public int subReal(int real1,int real2) {
    	
    	int tot=real1 - real2;
  
    	return tot;
    }
	public int subImag(int imag1,int imag2) {
		
		int tot=imag1 - imag2;
		
		return tot;
		
	}
	
	public double [] splitNum(String complex) {
	     String [] arr1 ;

         arr1= complex.split(" +");

    String r=arr1[0];

/**/           double real=Integer.parseInt(r);
	 
	    String [] arr2= arr1[2].split(" i");
	
	        String I=arr2[0];
   
/**/  double imag=Integer.parseInt(I);
      
      double [] array=new double[2];
      array[0]=real;
      array[1]=imag;
      
	      return array;
	}
	
    public String addComplex(String com1,String com2) {
    	ComplexNum comp1=new ComplexNum();
    	ComplexNum comp2=new ComplexNum();
    	double [] arr1=splitNum(com1);
        
        comp1.setReal(arr1[0]);
/**/    comp1.setImag(arr1[1]);
       double [] arr2=splitNum(com2);

         comp2.setReal(arr2[0]);
/**/    comp2.setImag(arr2[1]);

          double R=comp1.getReal()+comp2.getReal();
          double I=comp1.getImag()+comp2.getImag();
             setReal(R);
             setImag(I);
    	
    	return toString();
    }
    public String subComplex(String com1,String com2) {
    	ComplexNum comp1=new ComplexNum();
    	ComplexNum comp2=new ComplexNum();
    	double [] arr1=splitNum(com1);
        
        comp1.setReal(arr1[0]);
/**/    comp1.setImag(arr1[1]);
       double [] arr2=splitNum(com2);

         comp2.setReal(arr2[0]);
/**/    comp2.setImag(arr2[1]);

          double R=comp1.getReal() - comp2.getReal();
          double I=comp1.getImag() - comp2.getImag();
             setReal(R);
             setImag(I);
    	
    	return toString();
    }
	
	@Override
	public String toString() {
		return real+"+"+imag+"i";
	}
	
}
