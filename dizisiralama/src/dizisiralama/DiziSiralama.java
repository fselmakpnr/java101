package dizisiralama;

import java.util.Scanner;
import java.util.Arrays;
public class DiziSiralama {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Dizinin boyutunu giriniz n: ");
		
		int n=input.nextInt();
		   
		int[] dizi = new int[n];
		
		System.out.println("Dizinin elemanlarını giriniz");
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Dizinin "+(i+1)+". elemanı: ");
			dizi[i]=input.nextInt();
		}
		
		Arrays.sort(dizi);
		
		System.out.print("Sıralama: ");
		
		for(int i =0; i < n; i++) 
		{
			
            System.out.print(+dizi[i] + " ");
        }
		
				
	
	}

}
