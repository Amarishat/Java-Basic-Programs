package Operator;

public class Bitwise {

	public static void main(String[] args) {
		int num1=3,num2=5,num3=5;
		//Bitwise AND//
		System.out.println("num1 & num2 =" +(num1 & num2));
		
		//Bitwise OR//
		
	    System.out.println("num1 | num2 =" +(num1 | num2));
	    
	    //Bitwise XOR//
        
	    System.out.println("num1 ^ num2 =" +(num1 ^ num2));
	    
	    //Binary Complement Operator//
	    System.out.println("~num1 =" + ~num1);
	    
	    //Binary Left Shift Operator//
	    num3=num1<< 1;
	    System.out.println("num1 <<1="+num3);
	    
	    //Binary Right Shift Operator//
	    num3=num1>> 1;
	    System.out.println("num1 >>="+num3);
	    
	    //Shift Right Zero Fill Operator//
	    num3=num1>>2;
	    System.out.println("num1 >> 1="+num3);
	    }

}
