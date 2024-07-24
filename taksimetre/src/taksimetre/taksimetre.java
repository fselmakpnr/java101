package taksimetre;

import java.util.Scanner;

public class taksimetre {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double acilisUcreti=10;
		int kisaMesafe=20;
		double ucret=2.20;
		double tutar=0;
		
		System.out.println("Ne kadar mesafe kat edildiğini yazın (km)?");
		double mesafe=input.nextDouble();
		
		
			//tutar=acilisUcreti+(ucret*mesafe);
		
			if(tutar<20)
			{
				tutar=kisaMesafe;
			}
			else
				tutar=acilisUcreti+(ucret*mesafe);
		
		System.out.println("Taksi ücreti: "+tutar);

	}

}
