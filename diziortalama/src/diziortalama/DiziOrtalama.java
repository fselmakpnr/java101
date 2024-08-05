package diziortalama;

public class DiziOrtalama {

	public static void main(String[] args) {
		
		double[]sayilar= {1,2,3,4,5};
		double toplam=0;
		
		for(int i=0;i<sayilar.length;i++)
		{
			toplam+=(1.0/(sayilar[i]));
		}
		
		double harmonikOrtalama=sayilar.length/toplam;
		System.out.println("Toplam:"+toplam);
		System.out.println("Harmonik Ortalama:"+harmonikOrtalama);
	}

}
