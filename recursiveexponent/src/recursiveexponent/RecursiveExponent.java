package recursiveexponent;

import java.util.Scanner;

public class RecursiveExponent {

	static int power(int base,int exp)
	{
			if(exp==0)
			{
				return 1;
			}
			return base*power(base,exp-1);
	}
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int base = input.nextInt();
		
		System.out.print("Enter enter the number to be the exponent: ");
		int exp = input.nextInt();
		
		int result=power(base,exp);
		
		System.out.println("Result:"+result);

	}

}
