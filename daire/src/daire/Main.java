/**
Dairenin Alanını ve Çevresini Hesaplayan Program
Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını
ve çevresini hesaplayan programı yazın.
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
Alan Formülü : π * r * r;
Çevre Formülü : 2 * π * r;

𝜋 sayısını = 3.14 alınız.


 */
package daire;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Dairenin yarıçapını (r) giriniz: ");
		int r=input.nextInt();
		
		System.out.print("Alanını hesaplamak istediğiniz açıyı giriniz: ");
		int a=input.nextInt();
		
		final double pi=3.14;
		
		double alan=pi*r*r;
		double cevre=2*pi*r;
		double daireDilimi=alan*((double)a/360);
		
		System.out.println("Dairenin alanı: "+alan);
		System.out.println("Dairenin çevresi: "+cevre);
		System.out.println("Daire diliminin alanı: "+daireDilimi);
	}

}
