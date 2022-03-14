package Basics;

import java.util.Scanner;

public class FunctionSample {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two numbers");
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	int result=sum(num1,num2);
	System.out.println("Result is "+result);// TODO Auto-generated method stub

	}
	static int sum(int a, int b) {
		int s=a+b;
		return s;
	}

}
