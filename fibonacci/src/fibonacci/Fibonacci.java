package fibonacci;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Fibonacci serisinin kaç elemanlı olmasını istiyorsunuz?Yazınız.");
		int eleman=input.nextInt();
		
		int n1=0;
		int n2=1;
		
		System.out.print(n1+n2);
		
		for(int i=2;i<=eleman;i++)
		{
		    int yeni=n1+n2;
			System.out.print(" "+yeni);
			 n1 = n2;
	         n2 = yeni;
		}
		input.close();
	}

}
