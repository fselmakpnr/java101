/**
 * Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e 
 * tam bölünen sayıların ortalamasını hesaplayan programdır
 */

package ciftsayibulma;

import java.util.Scanner;

public class CiftSayiBulma {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz: ");
		int sayi=input.nextInt();
		
		int sayiAdet=0;
		int toplam=0;
		double sonuc=0;
		for(int i=0;i<=sayi;i++)
		{	
			
			if(i%3==0 && i%4==0)
			{
				toplam+=i;
				sayiAdet++;
				sonuc=(toplam/sayiAdet);
				
			}
			
		}
		System.out.println("Ortalama: "+sonuc);
	}

}
