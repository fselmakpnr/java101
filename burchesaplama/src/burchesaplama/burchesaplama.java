package burchesaplama;

import java.util.Scanner;

public class burchesaplama {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Doğduğunuz günü yazınız");
		int gun=scanner.nextInt();
		
		System.out.println("Doğduğunuz ayı yazınız");
		int ay=scanner.nextInt();
		
		System.out.println("Doğum Tarihiniz: "+gun+"."+ay);
		
		if(ay==1)
		{
			if(gun>0 && gun<22)
			{
				System.out.println("Burcunuz Oğlak");
			}
			else if(gun>=22 && gun<=31)
			{
				System.out.println("Burcunuz Kova");
			}
		}
		else if(ay==2)
		{
			if(gun>0 && gun<20)
			{
				System.out.println("Burcunuz Kova");
			}
			else if(gun>=20 && gun<=29)
			{
				System.out.println("Burcunuz Balık");
			}
		}
		else if(ay==3)
		{
			if(gun>0 && gun<21)
			{
				System.out.println("Burcunuz Balık");
			}
			else if(gun>=21 && gun<=31)
			{
				System.out.println("Burcunuz Koç");
			}
		}
		else if(ay==4)
		{
			if(gun>0 && gun<21)
			{
				System.out.println("Burcunuz Koç");
			}
			else if(gun>=21 && gun<=30)
			{
				System.out.println("Burcunuz Boğa");
			}
		}
		else if(ay==5)
		{
			if(gun>0 && gun<22)
			{
				System.out.println("Burcunuz Boğa");
			}
			else if(gun>=22 && gun<=31)
			{
				System.out.println("Burcunuz İkizler");
			}
		}
		else if(ay==6)
		{
			if(gun>0 && gun<23)
			{
				System.out.println("Burcunuz İkizler");
			}
			else if(gun>=23 && gun<=30)
			{
				System.out.println("Burcunuz Yengeç");
			}
		}
		else if(ay==7)
		{
			if(gun>0 && gun<23)
			{
				System.out.println("Burcunuz Yengeç");
			}
			else if(gun>=23 && gun<=31)
			{
				System.out.println("Burcunuz Aslan");
			}
		}
		else if(ay==8)
		{
			if(gun>0 && gun<23)
			{
				System.out.println("Burcunuz Aslan");
			}
			else if(gun>=23 && gun<=31)
			{
				System.out.println("Burcunuz Başak");
			}
		}
		else if(ay==9)
		{
			if(gun>0 && gun<23)
			{
				System.out.println("Burcunuz Başak");
			}
			else if(gun>=23 && gun<=30)
			{
				System.out.println("Burcunuz Terazi");
			}
		}
		else if(ay==10)
		{
			if(gun>0 && gun<23)
			{
				System.out.println("Burcunuz Terazi");
			}
			else if(gun>=23 && gun<=31)
			{
				System.out.println("Burcunuz Akrep");
			}
		}
		else if(ay==11)
		{
			if(gun>0 && gun<22)
			{
				System.out.println("Burcunuz Akrep");
			}
			else if(gun>=22 && gun<=30)
			{
				System.out.println("Burcunuz Yay");
			}
		}
		else if(ay==12)
		{
			if(gun>0 && gun<22)
			{
				System.out.println("Burcunuz Yay");
			}
			else if(gun>=22 && gun<=31)
			{
				System.out.println("Burcunuz Oğlak");
			}
		}
		else
		{
			System.out.println("Lütfen geçerli bir değer giriniz");
		}
	}

}
