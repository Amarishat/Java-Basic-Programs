package FlowControl;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	switch(n)
	{
	case 1:
		System.out.println("Monday");
		break;
	case 2:
		System.out.println("Tuesday");
		break;
	case 3:
		System.out.println("Wednesday");
		break;
	case 4:
		System.out.println("Thursday");
		break;
	case 5:
		System.out.println("Friday");
		break;
	case 6:
		System.out.println("saturday");
		break;
	case 7:
		System.out.println("sunday");
		break;
	default :
		System.out.println("value not found");
		break;
		
	
		
	}
	
		// TODO Auto-generated method stub

	}

}
