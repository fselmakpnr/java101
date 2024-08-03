/**
 * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran program
 */
package kuvvetbulma;

import java.util.Scanner;

public class KuvvetBulma {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	      
        System.out.println("Enter a number:");
        int number = input.nextInt();
        
       
        System.out.println("Powers of 4 less than " + number + ":");
        int power4 = 1;
        while (power4 < number) {
            System.out.println(power4);
            power4 *= 4;
        }
      
        System.out.println("Powers of 5 less than " + number + ":");
        int power5 = 1;
        while (power5 < number) {
            System.out.println(power5);
            power5 *= 5;
        }
        
        input.close();
    }

}
