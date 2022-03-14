package Basics;

import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.io.InputStreamReader;

public class BufferedReader1 {

//	public BufferedReader(InputStreamReader inputStreamReader) {
//		// TODO Auto-generated constructor stub
//	}
//
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
//	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a number");
	int a = Integer.parseInt(br.readLine());
	System.out.println("you entered is "+ a);
	
	}

}


