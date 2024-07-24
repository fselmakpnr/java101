/**
 * Java ile hesap makinesi
 */
package hesapmakinesi;

import java.util.Scanner;

public class hesapmakinesi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("İlk sayıyı giriniz: ");
		double sayi1=scanner.nextDouble();
		
		System.out.println("İkinci sayıyı giriniz:");
		double sayi2=scanner.nextDouble();
		
		System.out.println("Lütfen yapacağınız işlemi seçiniz");
		
		System.out.println("1-Toplama");
		System.out.println("2-Çıkarma");
		System.out.println("3-Çarpma");
		System.out.println("4-Bölme");
		System.out.println("5-Mod alma");
		
		int secim=scanner.nextInt();
		double  sonuc=0;
		
		switch(secim)
		{
		case 1:
			sonuc=sayi1+sayi2;
			System.out.println("Sonuç:"+sonuc);
			break;
		case 2:
			if(sayi1>sayi2 || sayi1==sayi2)
			{
				sonuc=sayi1-sayi2;
				System.out.println("Sonuç:"+sonuc);
				break;
			}
			else
			
				sonuc=sayi2-sayi1;
			System.out.println("Sonuç:"+sonuc);
			break;
		case 3:
			sonuc=sayi1*sayi2;
			System.out.println("Sonuç:"+sonuc);
			break;
		case 4:
			if(sayi2==0)
			{
				System.out.println("Tanımsız");
				break;
			}
			else
				sonuc=sayi1/sayi2;
			System.out.println("Sonuç:"+sonuc);
			break;
		case 5:
			sonuc=sayi1%sayi2;
			System.out.println("Sonuç:"+sonuc);
			break;
			default:
				System.out.println("Hatalı değer girdiniz!!");
				
		}
		
		
	}

}
