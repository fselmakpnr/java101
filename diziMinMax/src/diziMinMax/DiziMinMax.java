package diziMinMax;

import java.util.Scanner;

public class DiziMinMax {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Girilen Sayi:");
		
		int sayi=input.nextInt();
		
		int[] sayilar= {2,4,5,6,7,9};
		
		  double enYakinKucuk = Double.NEGATIVE_INFINITY;
	      double enYakinBuyuk = Double.POSITIVE_INFINITY;
		
		for(int i=0;i<sayilar.length;i++)
		{
			if(sayilar[i]<sayi)
			{
				if(enYakinKucuk==0 || sayilar[i]>enYakinKucuk)
				{
					enYakinKucuk=sayilar[i];
				}
			}
			if(sayilar[i]>sayi)
			{
				if(enYakinBuyuk==0 || sayilar[i]<enYakinBuyuk)
				{
					enYakinBuyuk=sayilar[i];
				}
			}
		}
		
		if (enYakinKucuk !=Double. NEGATIVE_INFINITY) 
		{
            System.out.println("En yakın en küçük sayı: " + enYakinKucuk);
        } 
		else 
		{
            System.out.println("Verilen sayıdan küçük bir sayı bulunamadı.");
        }
        
        if (enYakinBuyuk != Double.POSITIVE_INFINITY) 
        {
            System.out.println("En yakın en büyük sayı: " + enYakinBuyuk);
        } 
        else 
        {
            System.out.println("Verilen sayıdan büyük bir sayı bulunamadı.");
        }
        
		
	}
}