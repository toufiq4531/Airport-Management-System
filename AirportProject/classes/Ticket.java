package classes;
import java.lang.*;
import interfaces.*;

public abstract class Ticket implements IQuantity
{
	private String tId;
	private String name;
	private int availableQuantity;
	private double price;
	
	public void setTid(String tId)
	{
		this.tId= tId;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setAvailableQuantity(int availableQuantity)
	{
		this.availableQuantity=availableQuantity;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public String getTid()
	{
		return tId;
	}
	public String getName()
	{
		return name;
	}
	public int getAvailableQuantity()
	{
		return availableQuantity;
	}
	public double getPrice()
	{
		return price;
	}
	
	public abstract void showDetails();
	
	public boolean addQuantity(int amount)
	{
		if(amount>0)
		{
			System.out.println("Previous Price : "+getPrice());
			System.out.println("Add Amount : "+amount);
			price=price+amount;
			System.out.println("Current Price : "+price);
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean sellQuantity(int amount)
	{
		if(amount>0 && amount<=price)
		{
			System.out.println("Previous Price : "+getPrice());
			System.out.println("Sell Amount : "+amount);
			price=price-amount;
			System.out.println("Current Price : "+price);
			return true;
		}
		else
		{
			return false;
		}
	}
}
	
	