package exponentcalculator;

import java.util.Scanner;

public class ExponentCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.print("Enter enter the number to be the exponent: ");
		int expNumber = input.nextInt();
		
		int result=1;
		
		for(int i=1;i<=expNumber;i++)
		{
			result*=number;
		}
		
		System.out.print("Result:"+result);
	}

}
