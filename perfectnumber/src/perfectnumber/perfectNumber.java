/**
 * Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
 */
package perfectnumber;

import java.util.Scanner;

public class perfectNumber {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int toplam = 0;
        
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }
        
        if (toplam == sayi) {
            System.out.println(sayi + " sayısı mükemmel sayıdır");
        } else {
            System.out.println(sayi + " sayısı mükemmel sayı değildir");
        }
        
        input.close();
    }

}
