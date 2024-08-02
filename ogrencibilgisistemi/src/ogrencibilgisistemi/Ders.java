package ogrencibilgisistemi;

public class Ders {

	Ogretmen dersOgretmeni;
	String isim;
	String kod;
	String kisaltma;
	int not;
	
	Ders(String isim,String kod,String kisaltma)
	{
		this.isim=isim;
		this.kod=kod;
		this.kisaltma=kisaltma;
		this.not=0;
	}
	void print()
	{
		System.out.println("İsmi:"+isim);
		System.out.println("Kodu:"+kod);
		System.out.println("Ders kısaltması:"+kisaltma);
		System.out.println("Not:"+not);
		
	}
	void ogretmenEkle(Ogretmen ogr)
	{
		  if (this.kisaltma.equals(ogr.brans)) {
	            this.dersOgretmeni = ogr;
	            System.out.println("İşlem başarılıdır");
	        } else {
	            System.out.println(ogr.isim + " Akademisyeni bu dersi veremez.");
	        }
	}
	
	void ogretmenYazdir()
	{
		if(dersOgretmeni!=null)
		{
			System.out.println(this.isim +"Dersin Öğretmeni:"+dersOgretmeni.isim);
		}
		else {
            System.out.println(this.isim + " dersin eğitmeni belirsizdir.");
        }
	}
	/*@Override
    public String toString() {
        return "Ders{" +
                "isim='" + isim + '\'' +
                ", kod='" + kod + '\'' +
                ", kisaltma='" + kisaltma + '\'' +
                ", not=" + not +
                ", dersOgretmeni=" + (dersOgretmeni != null ? dersOgretmeni.isim : "Atanmamış") +
                '}';
    }*/
	
}
