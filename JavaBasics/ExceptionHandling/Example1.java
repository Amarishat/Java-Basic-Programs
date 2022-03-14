package ExceptionHandling;

public class Example1 {

	public static void main(String[] args) {
		try
		{
			int divisibleByZero=7/0;
			System.out.println("Rest Of Code In try block");
		}
		 catch(ArithmeticException e)
		{
			 System.out.println("ArithmeticException");
		}
         finally
         {
        	 int a=5;
        	 int b=7;
        	 int c=a+b;
        	 System.out.println(c);
         }
	}

}
