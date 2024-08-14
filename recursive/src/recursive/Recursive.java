package recursive;

import java.util.Scanner;

public class Recursive {
	public void pattern(int current,int n)
	{
		System.out.print(current+" ");
		if(current>0)
		{
			pattern(current-5,n);
		}
		if (current < n) {
            System.out.print((current + 5) + " ");
        }
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Bir n değeri giriniz");
		int n=scanner.nextInt();
		
		Recursive recursive = new Recursive();
        recursive.pattern(n, n);
		
	}
	
}
