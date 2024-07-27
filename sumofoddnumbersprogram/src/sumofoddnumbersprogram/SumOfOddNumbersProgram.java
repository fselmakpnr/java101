/**
 * Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden ve 
 * girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.
 */


package sumofoddnumbersprogram;

import java.util.Scanner;

public class SumOfOddNumbersProgram 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int result=0;
		int number=0;
		do 
		{
		System.out.print("Enter a number: ");
		number = input.nextInt();
        
        if(number%4==0 && number%2==0)
			{
        	result+=number;
			}
        
        System.out.println("current total:" +result);
		
		}
		while(number%2==0);
			System.out.println("final total:"+result);
			input.close();
	}

}
