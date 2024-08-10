package boksmaci;

public class Mac {
	
	Boksor b1;
	Boksor b2;
	int minWeight;
	int maxWeight;
	
	public Mac(Boksor b1,Boksor b2,int minWeight,int maxWeight)
	{
		this.b1=b1;
		this.b2=b2;
		this.minWeight=minWeight;
		this.maxWeight=maxWeight;
		
	}
	
	void run ()
	{
		if(isCheck())
		{ 
			double randomStart = Math.random();
            boolean b1Starts = randomStart < 0.5;
            
            System.out.println("İlk vuruşu " + (b1Starts ? b1.name : b2.name) + " yapıyor!");
            
            if (b1Starts) {
                this.b2.healthy = this.b1.hit(this.b2);
            } 
			 else 
			 {
	                this.b1.healthy = this.b2.hit(this.b1);
	            
			 }
            
            while(b1.healthy>0 && b2.healthy>0)
			{
				System.out.println("------Yeni Round------");
				
				 
				this.b2.healthy=this.b1.hit(this.b2);
				//System.out.println(b2.healthy);
				if(isWin())
				{
					break;
				}
				this.b1.healthy=this.b2.hit(this.b1);
				//System.out.println(b2.healthy);
				if(isWin())
				{
					break;
				}
				
				System.out.println(this.b1.name +" Health:"+this.b1.healthy);
				System.out.println(this.b2.name +" Health:"+this.b2.healthy);
			}
		}
		else
			System.out.println("Athletes weights do not match");
	}
	
	boolean isCheck()
	{
		return ((this.b1.weight>=minWeight && this.b1.weight<=maxWeight) &&(this.b2.weight>=minWeight && this.b2.weight<=maxWeight));
	}
	boolean isWin()
	{
		if(this.b1.healthy==0)
		{
			System.out.println(this.b2.name +" kazandı.");
			return true;
		}
		if(this.b2.healthy==0)
		{
			System.out.println(this.b1.name +" kazandı.");
			return true;
		}
		return false;
	}
}
