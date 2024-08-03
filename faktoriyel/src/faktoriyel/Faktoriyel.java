/**
 * Kombinasyon formülü  C(n,r) = n! / (r! * (n-r)!)
 */

package faktoriyel;

import java.util.Scanner;
public class Faktoriyel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String n;
        String r;
        
        while (true) {
            int faktoriyel1 = 1;
            int faktoriyel2 = 1;
            int faktoriyel3 = 1;
            double sonuc = 0;
            
            System.out.println("Kaç elemanlı bir kümede işlem yapmak istediğinizi seçiniz. (Çıkmak için çıkış yazınız)");
            n = scanner.nextLine();
            
            
            if (n.equalsIgnoreCase("çıkış")) 
            {
                break;
            }

            System.out.println("Kaç elemanlı bir kombinasyon yapmak istediğinizi seçiniz. (Çıkmak için çıkış yazınız)");
            r = scanner.nextLine();
            
            
            if (r.equalsIgnoreCase("çıkış")) 
            {
                break;
            }
            
            try {
                int sayi = Integer.parseInt(n);
                int sayi1 = Integer.parseInt(r);

                for (int i = 1; i <= sayi; i++) 
                {
                    faktoriyel1 = faktoriyel1 * i;
                }
                System.out.print(" n!:" + faktoriyel1 + " ");
                
                for (int i = 1; i <= sayi1; i++) 
                {
                    faktoriyel2 = faktoriyel2 * i;
                }
                System.out.print(" r!:" + faktoriyel2 + " ");
                
                int sayi2 = sayi - sayi1;
                for (int i = 1; i <= sayi2; i++) 
                {
                    faktoriyel3 = faktoriyel3 * i;
                }
                System.out.println(" (n-r)!:" + faktoriyel3);
                
                sonuc = (double) faktoriyel1 / (faktoriyel2 * faktoriyel3);
                System.out.println("C(" + n + "," + r + "):" + sonuc);
                
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Lütfen geçerli bir sayı giriniz.");
            }
        }
        
        scanner.close();
        System.out.println("Programdan çıkıldı.");
    }

}
