package ogrencibilgisistemi;

public class ogrencibilgisistemi {



	public static void main(String[] args)
	{
		Ders matematik = new Ders("Matematik", "MAT101", "MAT");
        Ders fizik = new Ders("Fizik", "FZK101", "FZK");
        Ders kimya = new Ders("Kimya", "KMY101", "KMY");

        Ogretmen o1 = new Ogretmen("Erdem Kara", "90550000000", "MAT");
        Ogretmen o2 = new Ogretmen("Barış Yılmaz", "90550000001", "FZK");
        Ogretmen o3 = new Ogretmen("Berra Kirdar", "90550000002", "KMY");

        matematik.ogretmenEkle(o1);
        fizik.ogretmenEkle(o2);
        kimya.ogretmenEkle(o3);

        Ogrenci s1 = new Ogrenci("İnci Arda", "140144015", 10, matematik, fizik, kimya);
        s1.notAralıkları(50, 90, 40);
        s1.gectiMi();

        Ogrenci s2 = new Ogrenci("Harun Dora", "2211133", 11, matematik, fizik, kimya);
        s2.notAralıkları(100, 80, 50);
        s2.gectiMi();

        Ogrenci s3 = new Ogrenci("Merve Çetin", "221121312", 14, matematik, fizik, kimya);
        s3.notAralıkları(90, 40, 70);
        s3.gectiMi();

        /*o1.print();
        o2.print();
        o3.print();*/

        
	}
}
