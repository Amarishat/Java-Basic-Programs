package Basics;

import java.util.Scanner;

public class SUMOfArrays {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int[] array=new int[10];
	int sum=0;
	System.out.println("Enter the elements");
	for(int i=0;i<10;i++) {
		array[i]=s.nextInt();
		
	}
	for(int num : array) {
		sum=sum+num;
		// TODO Auto-generated method stub
	}
     System.out.println("Sum of array elements is:"+sum);
     
	}

}
