/**
 * Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayıdır.
 */
package palindromnumber;

import java.util.Scanner;

public class PalindromNumber {
	
	
	static boolean isPalindrom(int number)
	{
		int temp=number,reverseNumber=0, lastNumber=0;
	
		while(temp!=0)
		{
			lastNumber=temp % 10;
			reverseNumber=(reverseNumber*10)+lastNumber;
			temp/=10;
		}
		return number==reverseNumber;
	}
	public static void main(String[] args) {
		
		System.out.println("Bir sayı giriniz: ");
		
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		
		 if (isPalindrom(number)) 
		 {
	            System.out.println(number + " bir palindrom sayıdır.");
	     } 
		 else 
		 {
	            System.out.println(number + " bir palindrom sayı değildir.");
	        
		 }
		
	}

}
