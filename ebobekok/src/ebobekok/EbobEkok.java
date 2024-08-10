package ebobekok;

import java.util.Scanner;

public class EbobEkok {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("İlk sayıyı giriniz:");
		int s1=input.nextInt();
		
		System.out.print("İkinci sayıyı giriniz:");
		int s2=input.nextInt();
		
		
		int ebob=1;
		
		
		for(int i=1;i<=s1;i++)
		{
			if(s1%i==0 && s2%i==0)
			{
				//System.out.println(i);	
				ebob=i;
			}
			
		}
		int ekok=(s1*s2)/ebob;
		
		System.out.println("Ebob:"+ebob);
		System.out.println("Ekok:"+ekok);
		
	}

}
