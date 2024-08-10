package boksmaci;

public class BoksMaci {

	public static void main(String[] args) {
		Boksor b1=new Boksor("Buse Naz",10,120,90,100);
		Boksor b2=new Boksor("Yu Wu",20,85,95,0);
		
		Mac mac=new Mac(b1,b2,90,95);
		mac.run();
	}

}
