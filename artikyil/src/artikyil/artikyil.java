package artikyil;

import java.util.Scanner;

public class artikyil {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Lütfen bir yıl giriniz");
		int yil=scanner.nextInt();
		
		if(yil%4==0)
		{
			System.out.println(yil+"yili artık yildir.");
		}
		else if(yil%4==0 && yil%100==0)
		{
			System.out.println(yil+" yili artık yildir.");
		}
		else if(yil%4!=0 && yil%100==0)
		{
			System.out.println(yil+"yili artık yil değildir.");
		}
		else
			System.out.println(yil+"yili artık yil değildir.");
		}

}
