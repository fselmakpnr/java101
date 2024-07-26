package cinzodyaktakvim;

import java.util.Scanner;

public class cinzodyaktakvim {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Doğum tarihinizi giriniz");
		int yil=scanner.nextInt();
		int sonuc=yil%12;
		
		if(yil>1900 && yil<2025)
		{
			if(sonuc==0)
			{
			System.out.println("Burcunuz:Maymun");
			}
			else if(sonuc==1)
			{
			System.out.println("Burcunuz:Horoz");
			}
			else if(sonuc==2)
			{
				System.out.println("Burcunuz:Köpek");
			}
			else if(sonuc==3)
			{
				System.out.println("Burcunuz:Domuz");
			}
			else if(sonuc==4)
			{
				System.out.println("Burcunuz:Fare");
			}
			else if(sonuc==5)
			{
				System.out.println("Burcunuz:Öküz");
			}
			else if(sonuc==6)
			{
				System.out.println("Burcunuz:Kaplan");
			}
			else if(sonuc==7)
			{
				System.out.println("Burcunuz:Tavşan");
			}
			else if(sonuc==8)
			{
				System.out.println("Burcunuz:Ejderha");
			}
			else if(sonuc==9)
			{
				System.out.println("Burcunuz:Yılan");
			}
			else if(sonuc==10)
			{
				System.out.println("Burcunuz:At");
			}
			else if(sonuc==11)
			{
				System.out.println("Burcunuz:Koyun");
			}
		}
		else
			System.out.println("Hatalı değer girdiniz");
		
	}

}
