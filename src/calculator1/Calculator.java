package calculator1;

import java.util.Scanner;

//Class name and File name are same
public class Calculator {
	
	//entry point of java program
	public static void main(String args[])
	{
		//Read the input from keyboard
		//new keyword used to create the object
		
		Scanner scan=new Scanner(System.in);
		
		//declaring the variable[local]
		int numOne,numTwo,result;
		
		System.out.println("Enter the number 1");
		numOne=scan.nextInt();
		System.out.println("Enter the number 2");
		numTwo=scan.nextInt();
		
		
		result = numOne+numTwo;
		
		System.out.println("Addition of two numbers "+ result);
		
	
		System.out.println("Welcome to Stackroute Program");
		
	}
	

}




