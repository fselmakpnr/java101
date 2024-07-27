package ucgenyapimi;

import java.util.Scanner;

public class YildizUcgenYapimi {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Bir sayı giriniz:");
		int sayi=scanner.nextInt();
		
		for(int i=1; i<=sayi;i++)
		{
			for(int j=1;j<=(sayi-1);j++)
			{
				System.out.println("");
			}
			for(int k=1;k<=(2*i)-1;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
