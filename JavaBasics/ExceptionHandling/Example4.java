package ExceptionHandling;

public class Example4 {

	public static void main(String[] args) {
		
	int a[]=new int[7];	
	try
	{
	a[8]=99;
	System.out.println(a[8]);
	}
     catch(ArrayIndexOutOfBoundsException e)
     {
    	System.out.println("ArrayIndexOutOfBoundException"); 
     }
	 finally
     {
    	 int a1=7;
    	 int b=11;
    	 int c=a1+b;
    	 System.out.println(c);
}
	}

}
