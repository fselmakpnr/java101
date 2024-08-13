package mayintarlasi;

import java.util.Scanner;

import java.util.Random;

public class MayinTarlasi {

	public static void main(String[] args) {
		System.out.println("-MAYIN TARLASI OYUNU-");
		Scanner scan=new Scanner(System.in);
		boolean deger=true;
		
		while(deger)
		{
		System.out.println("Lütfen oynamak istediğiniz boyutları giriniz");
		System.out.println("Satır giriniz");
		int row=scan.nextInt();
		
		System.out.println("Sütun giriniz");
		int col=scan.nextInt();
		
		if(row<=2 || col<=2)
		{
			System.out.println("Tekrar sayı giriniz");
			
			continue;
		}
		
		
		
		Minefield mine=new Minefield(row,col);
		mine.run();
		deger=false;
		}
		scan.close(); 
	}

}
