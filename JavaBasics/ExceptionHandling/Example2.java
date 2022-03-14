package ExceptionHandling;

public class Example2 {

	public static void main(String[] args) {
		try
		{
			String str="RCB";
			int a=Integer.parseInt(str);
			System.out.println(a);
		}
        catch(NumberFormatException e)
		{
        	System.out.println("NumberFormatException");
		}
		  finally
	         {
	        	 int a=7;
	        	 int b=11;
	        	 int c=a+b;
	        	 System.out.println(c);
	}

	}}
