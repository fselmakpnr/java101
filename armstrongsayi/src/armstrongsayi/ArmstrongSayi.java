package armstrongsayi;

import java.util.Scanner;

public class ArmstrongSayi {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lütfen armstrong sayısını hesaplamak istediğiniz sayıyı giriniz");
		int sayi=scanner.nextInt();
		int basamakSayisi=0;
		int geciciSayi=sayi;
		int basamakDegeri;
		int result=0;
		int basPow;
		
		while(geciciSayi!=0)
		{
			geciciSayi/=10;
			basamakSayisi++;
		}
		
		
		
		geciciSayi=sayi;
		
		while(geciciSayi!=0)
		{
			basPow=1;
			basamakDegeri=geciciSayi%10;
			
			for(int i=1;i<=basamakSayisi;i++)
			{
				basPow*=basamakDegeri;
			}
			
			result+=basPow;
			geciciSayi/=10;
		}
		if(result==sayi)
		{
		System.out.println(sayi+" sayısı bir armstrong sayıdır");
		}	
		else
			System.out.println(sayi+" sayısı bir armstrong sayı değildir");
	}
	

}
