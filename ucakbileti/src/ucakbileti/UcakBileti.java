/**
 * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. 
 * İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */

package ucakbileti;

import java.util.Scanner;

public class UcakBileti {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("İsminizi Giriniz");
		String isim=scanner.nextLine();
		System.out.println("İsim:"+isim);
		
		System.out.println("Yaşınızı Giriniz");
		int yas=scanner.nextInt();
		if(yas<=0)
			{
			System.out.println("Geçerli bir sayi giriniz");
			}
		else
			{
			System.out.println("Yaş:"+yas);
			}
		System.out.println("Yolculuk Tipinizi Giriniz");
		System.out.println("Tek Yön- 1 Çift Yön- 2");
		
		int yolculukTipi=scanner.nextInt();
		if(yolculukTipi==1 || yolculukTipi==2)
		{
			System.out.println("Yolculuk Tipi:"+yolculukTipi);
		}
		else
		{
			System.out.println("Geçerli bir sayi giriniz");
		}
		
		System.out.println("Yolculuk mesafesini Giriniz");
		int yolculukMesafe=scanner.nextInt();
		
		if(yolculukMesafe<=0)
		{
			System.out.println("Geçerli bir sayi giriniz");
		}
		else
			{
			System.out.println("Mesafe:"+yolculukMesafe);
			double km=0.10;
			double fiyat=km*yolculukMesafe;
			double yeniFiyat;
		
		if(yolculukTipi==1)
			{
					
				if(yas<12)
				{
					yeniFiyat=fiyat/2;
				}
				else if(yas>=12 && yas<=24)
				{
					yeniFiyat=(fiyat*90)/100;
				}
				else if(yas>65)
				{
					yeniFiyat=(fiyat*70)/100;
				}
				else
				{
					yeniFiyat=fiyat;
				}
				System.out.println("Fiyat:"+yeniFiyat);
			}
		else if(yolculukTipi ==2)
		{
			
			if(yas<12)
			{
				yeniFiyat=fiyat;
			}
			else if(yas>=12 && yas<=24)
			{
				yeniFiyat=(((fiyat*90)/100)*1.6);
			}
			else if(yas>65)
			{
				yeniFiyat=((fiyat*70)/100)*1.6;
			}
			else
			{
				yeniFiyat=fiyat*1.6;
			}
			System.out.println("Fiyat:"+yeniFiyat);
		}
		
			}
	}
}
