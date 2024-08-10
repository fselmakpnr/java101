package boksmaci;

public class Boksor {
		String name;
		int damage;
		int healthy;
		int weight;
		int dodge;
		

		public Boksor(String name,int damage,int healthy,int weight,int dodge)
		{
			this.name=name;
			this.damage=damage;
			this.healthy=healthy;
			this.weight=weight;
			if(dodge>=0 && dodge<=100)
			{
				this.dodge=dodge;
			}
			else
				this.dodge=0;
		}
		
		int hit(Boksor foe)
		{
			System.out.println(this.name+"=>"+foe.name +" "+this.damage+" " +" hasar vurdu.");
			if(foe.isDodge())
			{
				System.out.println(foe.name +" gelen hasarı blokladı");
				return foe.healthy;
			}
			if(foe.healthy-this.damage<0)
			{
				return 0;
			}
			
			
			return foe.healthy-this.damage;
		}
		boolean isDodge()
		{
			double randomNumber=Math.random()*100;
			return randomNumber<=this.dodge;
		}
}

