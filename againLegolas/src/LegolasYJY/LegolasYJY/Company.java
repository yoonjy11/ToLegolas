package LegolasYJY;

public class Company
{
	private String name;
	private int cash;
	
	
	public Company(String name, int cash)
	{
		super();
		this.name = name;
		this.cash = cash;
	}


	public String getName()
	{
		return name;
	}
	public int getCash()
	{
		return cash;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCash(int cash)
	{
		this.cash = cash;
	}
	
}
