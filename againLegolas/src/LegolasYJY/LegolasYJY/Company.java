package LegolasYJY.LegolasYJY;

public class Company
{
	private String name, bigo;
	private int cash;
	
	
	public Company(String name, int cash, String bigo)
	{
		super();
		this.name = name;
		this.cash = cash;
		this.bigo = bigo;
	}


	public String getName()
	{
		return name;
	}
	public int getCash()
	{
		return cash;
	}
	public String getBigo()
	{
		return bigo;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCash(int cash)
	{
		this.cash = cash;
	}
	public void setBigo(String bigo)
	{
		this.bigo = bigo;
	}
	
}
