/**
 * Java ile girilen sayının harmonik serisini bulan programdır.
 */
package harmonikseri;

import java.util.Scanner;

public class HarmonikSeri {

	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Lütfen harmonik sayısını hesaplamak istediğiniz sayıyı giriniz");
		double sayi=scanner.nextInt();
		double toplam=0;
		
		for(double i=1; i<=sayi;i++)
		{
			toplam=toplam+(1/i);
			
		}
		System.out.println("Harmonik Seri:"+toplam);
	}
	
}
