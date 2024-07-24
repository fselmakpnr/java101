/**
 * Java ile hava sıcaklığına göre etkinlik öneren programdır.
 */

package etkinlikonerme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.print("Hava sıcaklığını giriniz: ");
		int heat=input.nextInt();
		
		if(heat<5)
		{
			System.out.print("Kayak yapabilirsiniz!");
		}
		else if(heat>=5 && heat<15)
		{
			System.out.print("Sinemaya gidebilirsiniz!");
		}	
		else if(heat>=15 && heat<25)
		{
			System.out.print("Pikniğe gidebilirsiniz!");
		}
		else if(heat>=25)
		{
			System.out.print("Yüzmeye gidebilirsiniz");
		}
		
		

	}

}
