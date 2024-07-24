/**
 * Sayıları büyükten küçüğe sıralayan programdır.
 */

package sayisiralama;

import java.util.Scanner;

public class sayisiralama {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Lütfen bir sayı giriniz");
		int sayi1=scanner.nextInt();
		
		System.out.println("Lütfen bir sayı giriniz");
		int sayi2=scanner.nextInt();
		
		System.out.println("Lütfen bir sayı giriniz");
		int sayi3=scanner.nextInt();
		
	
		
		if(sayi1>sayi2 && sayi1>sayi3)
		{
	
			if(sayi2>sayi3)
			{
				System.out.println(sayi1+">"+sayi2+">"+sayi3);
			}
			else 
			{
				System.out.println(sayi1+">"+sayi3+">"+sayi2);
			}
		}
		else if(sayi2>sayi1 && sayi2>sayi3)
		{

			if(sayi1>sayi3)
			{
				System.out.println(sayi2+">"+sayi1+">"+sayi3);
			}
			else 
			{
				System.out.println(sayi2+">"+sayi3+">"+sayi1);
			}
			
		}
		else if(sayi3>sayi1 && sayi3>sayi2)
		{

			if(sayi1>sayi2)
			{
				System.out.println(sayi3+">"+sayi1+">"+sayi2);
			}
			else 
			{
				System.out.println(sayi3+">"+sayi2+">"+sayi1);
			}
			
		}
		
		
		
		
		
		
		
	}

}
