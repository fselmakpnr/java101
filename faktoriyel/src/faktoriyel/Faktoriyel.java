package faktoriyel;

import java.util.Scanner;
public class Faktoriyel {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String deger;
	
		
		while(true)
		{
			int faktoriyel=1;
			System.out.println("Hesaplanmasını istediğiniz sayıyı giriniz.Çıkmak için çıkış yazınız");
			deger=scanner.nextLine();
			if(deger.equalsIgnoreCase("çıkış"))
			{
			 break;
			}
		    
			else
			{
				int sayi=Integer.parseInt(deger);
				for(int i=1;i<=sayi;i++)
				{
					faktoriyel=faktoriyel*i;
					
				}
				System.out.println(faktoriyel);
			}
		}

		scanner.close();
		System.out.println("Programdan çıkıldı.");
	}

}
