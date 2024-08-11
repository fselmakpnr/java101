package maashesaplayici;

public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	int currentYear=2021;
	
	
	public Employee(String name,double salary,int workHours,int hireYear)
	{
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
		
	}
	public double tax()
	{
		if(this.salary>1000)
		{
			return this.salary*0.03;
			
		}
		return 0;
	}
	public int bonus()
	{
		if(this.workHours>40)
		{
			return (this.workHours-40)*30;
			
		}
		return 0;
	}
	
	public double raisily()
	{
	    int yearsWorked = this.currentYear - this.hireYear;
		if(yearsWorked<10)
		{
			return (salary*0.05)+salary;
			
		}
		else if(yearsWorked>9 &&yearsWorked<20)
		{
			return (salary*0.1)+salary;
			
		}
		else if(yearsWorked>19)
		{
			return (salary*0.15)+salary;
		
		}
		return 0;
	}
	
	public double totalSalary()
	{
        double tax = tax();
        int bonus = bonus();
        double raise = raisily();
        return ((bonus + raise)-tax);
    }
	
	  @Override
	    public String toString() {
	        return "Employee Information:\n" +
	               "Name: " + this.name + "\n" +
	               "Salary: " + this.salary + "\n" +
	               "Work Hours: " + this.workHours + "\n" +
	               "Hire Year: " + this.hireYear + "\n" +
	               "Tax: " + tax() + "\n" +
	               "Bonus: " + bonus() + "\n" +
	               "Salary Raise: " + raisily()+"\n"  +
	               "Total Salary: " + totalSalary();
	    }
	
}
