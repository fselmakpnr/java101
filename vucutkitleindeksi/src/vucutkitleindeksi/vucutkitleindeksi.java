package vucutkitleindeksi;

import java.util.Scanner;

public class vucutkitleindeksi {

	public static void main(String[] args) 
	{
		System.out.println("*****VÜCUT KİTLE İNDEKSİ HESAPLAMA*****");
		
		System.out.println("Lütfen güncel kilonuzu(kg) giriniz");
		Scanner input=new Scanner(System.in);
		double kilo=input.nextDouble();
		double sonuc;
		String durum="";
		while(true) 
		{
			System.out.println("Lütfen boyunuzu (m) giriniz");
			double boy=input.nextDouble();
			input.nextLine();
			
			if(boy>0.46 && boy<=2.51)
			{
				sonuc=kilo/(Math.pow(boy,2));
				
				if(sonuc>0 && sonuc<18.5)
				{
					durum="ZAYIF";
				}
				else if(sonuc>=18.5 && sonuc<24.9)
				{
					durum="İDEAL";
				}
				else if(sonuc>=25 && sonuc<29.9)
				{
					durum="ŞİŞMAN";
				}
				else if(sonuc>=30 && sonuc<34.9)
				{
					durum="OBEZ";
				}
				else if(sonuc>=35)
				{
					durum="AŞIRI OBEZ";
				}
				
				
				System.out.println("VÜCUT KİTLE İNDEKSİ:"+sonuc+"");
				System.out.println("Durumunuz:"+durum);
				break;
			}
			else 
            {
                System.out.println("Geçersiz boy bilgisi girdiniz. Lütfen tekrar deneyin.");
            }
			
			
			
		}
		
		
		
				
	
	}

}
