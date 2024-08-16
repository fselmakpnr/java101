/**
 Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını 
 kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastıran eğer kullanıcının 
 ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazan program.
 
 */


package notortalamasihesabi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Matematik dersinden aldığınız notu giriniz: ");
		int math=input.nextInt();
		
		System.out.print("Fizik dersinden aldığınız notu giriniz: ");
		int physics=input.nextInt();
		
		System.out.print("Kimya dersinden aldığınız notu giriniz: ");
		int chem=input.nextInt();
		
		System.out.print("Türkçe dersinden aldığınız notu giriniz: ");
		int turkish=input.nextInt();
		
		System.out.print("Tarih dersinden aldığınız notu giriniz: ");
		int history=input.nextInt();
		
		System.out.print("Müzik dersinden aldığınız notu giriniz: ");
		int music=input.nextInt();
		
		double result=0;
		result=((math+physics+chem+turkish+history+music)/6);
		System.out.print("Ortalama:"+result+"  ");
		
		if(result>60)
		{
			System.out.println("Sınıfı Geçti");
		}
		else
			System.out.println("Sınıfta Kaldı");
	}

}
