package ogrencibilgisistemi;

public class Ogretmen {
	String isim;
	String telno;
	String brans;
	
	Ogretmen(String isim,String telno,String brans)
	{
		this.isim=isim;
		this.telno=telno;
		this.brans=brans;
		
	}
	
	void print()
	{
		System.out.println("İsmi:"+isim);
		System.out.println("Telefon No:"+telno);
		System.out.println("Branşı:"+brans);
	}
	/*@Override
    public String toString() {
        return "Ogretmen{" +
                "isim='" + isim + '\'' +
                ", telno='" + telno + '\'' +
                ", brans='" + brans + '\'' +
                '}';
    } */
}
