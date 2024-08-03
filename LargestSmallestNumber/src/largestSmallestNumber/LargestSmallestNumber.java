package largestSmallestNumber;

import java.util.Scanner;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Kaç tane sayı gireceksiniz?");
		int sayi=input.nextInt();
		
		int largest = Integer.MIN_VALUE;
	    int smallest = Integer.MAX_VALUE;
	      
		for(int i=1;i<=sayi;i++)
		{		
			System.out.println(i+".sayiyi giriniz");
			int currentNumber=input.nextInt();
			
			 if(currentNumber>largest)
			 {
				 largest=currentNumber;
			 }
			 if(currentNumber<smallest)
			 {
				 smallest=currentNumber;
			 }
		      
			 
		        
		        
		      
		}
		 System.out.println("En büyük sayı: " + largest);
	       
		 System.out.println("En küçük sayı: " + smallest);
		 
		input.close();
	}

}
