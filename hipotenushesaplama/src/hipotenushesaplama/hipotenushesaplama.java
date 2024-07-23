package hipotenushesaplama;

import java.util.Scanner;

public class hipotenushesaplama {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		double hipotenus;
		
		System.out.print("Üçgenin ilk kenar uzunluğunu giriniz: ");
		double kenar1=input.nextDouble();
		
		System.out.print("Üçgenin ikinci kenar uzunluğunu giriniz: ");
		double kenar2=input.nextDouble();
	
		hipotenus=Math.sqrt(Math.pow(kenar1,2)+Math.pow(kenar2,2));
		System.out.println("Üçgenin hipotenüs uzunluğu: "+hipotenus);
		
		double alan=(kenar1*kenar2)/2;
		System.out.println("Üçgenin alanı: "+alan);
	}

}
