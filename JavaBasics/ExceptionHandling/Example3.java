package ExceptionHandling;

public class Example3 {

	public static void main(String[] args) {
	   
		try
		{
			String a=null;
			
			System.out.println(a.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
		 finally
         {
        	 int a=7;
        	 int b=11;
        	 int c=a+b;
        	 System.out.println(c);
}

	}

}
