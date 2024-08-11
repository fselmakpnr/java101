package sayitahminoyunu;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class SayiTahmin {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random random=new Random();
		int sayı=random.nextInt(100);

		int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

      
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                
                if (isWrong) 
                {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } 
                else 
                {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (selected == sayı) 
            {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + sayı);
                isWin = true;
                break;
            } 
            else 
            {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > sayı) 
                {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } 
                else 
                {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }
        System.out.println("Tutulan sayı:"+sayı);
       
        if (!isWin) 
        {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) 
            {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }

    }

	
}
