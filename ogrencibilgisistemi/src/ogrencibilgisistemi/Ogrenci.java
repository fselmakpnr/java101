package ogrencibilgisistemi;

public class Ogrenci {
	String isim;
	String ogrNo;
	int yas;
	double average;
	Ders matematik;
	Ders fizik;
	Ders kimya;
	boolean isPass;
	
	Ogrenci(String isim,String ogrNo,int yas,Ders matematik,Ders fizik,Ders kimya)
	{
		this.isim=isim;
		this.ogrNo=ogrNo;
		this.yas=yas;
		this.average=average;
		this.matematik=matematik;
		this.fizik=fizik;
		this.kimya=kimya;
		this.isPass = false;
		ortalamaHesabi();
		
	}
	void print()
	{
		System.out.println("İsmi:"+isim);
		System.out.println("Ogrenci No:"+ogrNo);
		System.out.println("Yaş:"+yas);
		System.out.println("Ortalama:"+average);
		System.out.println("Ders 1:"+matematik);
		System.out.println("Ders 3:"+fizik);
		System.out.println("Ders 3:"+kimya);
	}
	void notAralıkları(int matematik,int fizik,int kimya)
	{
		if(matematik>=0 && matematik<=100)
		{
			this.matematik.not=matematik;
		}
		if(fizik>=0 && fizik<=100)
		{
			this.fizik.not=fizik;
		}
		if(kimya>=0 && kimya<=100)
		{
			this.kimya.not=kimya;
		}
		ortalamaHesabi();
	}
	void gectiMi()
	{
		 if (this.matematik.not == 0 || this.fizik.not == 0 || this.kimya.not == 0) 
		 {
	            System.out.println("Notlar tam olarak girilmemiş");
	     } 
		 	else 
		 	{
	            this.isPass = isCheckPass();
	            notuYazdir();
	            System.out.println("Ortalama : " + this.average);
	            if (this.isPass)
	            {
	                System.out.println("Sınıfı Geçti. ");
	            } 
	            else 
	            {
	                System.out.println("Sınıfta Kaldı.");
	            }
	        
		 	}	
		 }
	void ortalamaHesabi()
	{
		 this.average = (this.fizik.not+ this.kimya.not + this.matematik.not) / 3.0;
	}
	
	public boolean isCheckPass() 
	 {
		 ortalamaHesabi();
	        return this.average > 55;
	  }

	
	void notuYazdir()
	{
		System.out.println("=========================");
        System.out.println("Öğrenci : " + this.isim);
        System.out.println("Matematik Notu : " + this.matematik.not);
        System.out.println("Fizik Notu : " + this.fizik.not);
        System.out.println("Kimya Notu : " + this.kimya.not);
	}

    /*@Override
    public String toString() {
        return "Ogrenci{" +
                "isim='" + isim + '\'' +
                ", ogrNo='" + ogrNo + '\'' +
                ", yas=" + yas +
                ", average=" + average +
                ", isPass=" + isPass +
                '}';
    }*/
}
