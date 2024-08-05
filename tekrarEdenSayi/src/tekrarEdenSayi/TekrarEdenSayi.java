package tekrarEdenSayi;

import java.util.Arrays;

public class TekrarEdenSayi {

	public static void main(String[] args) 
	{
			int sayilar[]= {2,2,3,3,4,5,6,4,6,7,8,9,10,10,10};
			
			Arrays.sort(sayilar);
			
			int tekrarEden = Integer.MIN_VALUE;
			  
			
			for(int i=1;i<sayilar.length;i++)
			{
				if(sayilar[i]==sayilar[i-1] && sayilar[i]%2==0)
				{
					 if (sayilar[i] != tekrarEden) 
					 {
		                    System.out.println(sayilar[i]);
		                    tekrarEden = sayilar[i];
		             }
				}
			}
	}

}
