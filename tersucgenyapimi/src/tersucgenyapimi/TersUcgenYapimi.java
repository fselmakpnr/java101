package tersucgenyapimi;

import java.util.Scanner;

public class TersUcgenYapimi {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int sayi=scanner.nextInt();
		
		for(int i=sayi; i>0;i--)
		{
			for(int j=0;j<i;j++) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		scanner.close();
	}

}
