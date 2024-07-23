/**
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programdır.
KDV tutarı = 1.8;
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , 
tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplarız
*/
package kdvhesaplama;

import java.util.Scanner;

public class KdvHesaplama {
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		System.out.print("Ücret tutarını giriniz: ");
		int tutar=input.nextInt();
		
		double kdvOranı=0.18;
		double kdvOranı2=0.8;
		double kdvTutar=kdvOranı*tutar;
		double kdvliTutar;
		
		System.out.println("KDV olmadan tutar: "+tutar);
		
		if(tutar>0 && tutar<1000)
		{
			kdvliTutar=kdvTutar+tutar;
			System.out.println("KDV tutarı: "+kdvTutar);
			System.out.println("KDV'li tutar "+kdvliTutar);
			System.out.println("KDV oranı: "+kdvOranı);
		}
		else
		{
			kdvliTutar=(tutar*0.8)+tutar;
			System.out.println("KDV tutarı: "+tutar*0.8);
			System.out.println("KDV'li tutarı:"+kdvliTutar);
			System.out.println("KDV oranı: "+kdvOranı);
		}
		}
}
