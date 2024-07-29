package advancedcalculator;

import java.util.Scanner;

public class AdvancedCalculator {
	
	static void plus()
	{

		Scanner input=new Scanner(System.in);
		System.out.println("Kaç adet sayı gireceksiniz");
		int counter=input.nextInt();
		int number,result=0;
		
		for(int i=0;i<=counter;i++)
		{ 
			System.out.print(i + ". sayı :");
			 number=input.nextInt();

			 result+=number;
		}
		System.out.println("Sonuç: "+result);
	}
	
	static void minus()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Kaç adet sayı gireceksiniz");
		int counter=input.nextInt();
		int number,result=0;
		
		for(int i=0;i<=counter;i++)
		{ 
			System.out.print(i + ". sayı :");
			 number=input.nextInt();
			 if(i==1)
			 {
				 result+=number;
				 continue;
			 }
			 result-=number;
		}
		System.out.println("Sonuç: "+result);
	}
	
	static void times() {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Kaç adet sayı gireceksiniz: ");
	    int counter = input.nextInt();
	    int number, result = 1;

	    for (int i = 1; i <= counter; i++) {
	        System.out.print(i + ". sayı :");
	        number = input.nextInt();

	        if (number == 0) {
	            result = 0;
	            break;
	        }
	        result *= number;
	    }
	    System.out.println("Sonuç: " + result);
	}

	static void divided()
	{

		Scanner input=new Scanner(System.in);
		System.out.println("Kaç adet sayı gireceksiniz");
		int counter=input.nextInt();
		double number,result=0.0;
		
		for(int i=0;i<=counter;i++)
		{ 
			System.out.print(i + ". sayı :");
			 number=input.nextDouble();
			 if(i==1)
			 {
				 result=number;
				 continue;
			 }
			 if(i!=1 && number==0)
			 {
				 System.out.println("Böleni 0 giremezsiniz");
				 continue;
			 }
			 result/=number;
		}
		System.out.println("Sonuç: "+result);
	}
	
	static void power()
	{
		Scanner input=new Scanner(System.in);
		 System.out.print("Taban değerini giriniz");
		 int base=input.nextInt();
		 
		 System.out.print("Üs değerini giriniz");
		 int exp=input.nextInt();
		
		 int result=1;
		 
		 for(int i=1;i<=exp;i++)
		 {
			 result*=base;
		 }
		 
		 System.out.println("Sonuç: "+result);
	}
	
	static void factorial()
	{
		Scanner input=new Scanner(System.in);
		
		System.out.print("Hesaplanacak sayıyı giriniz");
		int number=input.nextInt();
		
		int result=1;
		
		for(int i=1;i<=number;i++)
		{
			result*=i;
		}
		System.out.println("Sonuç: "+result);
		
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int select;
		String menu="1-Toplama"
				+ " 2-Çıkarma"
				+ " 3-Çarpma"
				+ " 4-Bölme"
				+ " 5-Üs Alma"
				+ " 6-Faktöriyel"
				+ " 0-Çıkış";
		
		do 
		{
			System.out.println(menu);
			System.out.println("Lütfen yapılacak işlemi seçiniz");
			select=input.nextInt();
		
				switch(select)
				{
				case 1:
					plus();
					break;
				case 2:
					minus();
					break;
				case 3:
					times();
					break;
				case 4:
					divided();
					break;
				case 5:
					power();
					break;
				case 6:
					factorial();
					break;
				case 0:
					input.close();
					break;
				default:
		            System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
				}
		
		}
		while(select!=0);
	
	}
}
