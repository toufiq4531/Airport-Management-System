package classes;
import java.lang.*;

public class International extends Ticket
{
	private String countryName;

		
	public International()
	{
		System.out.println("IT-E");
	}

	
			
	public void setCountryName(String countryName)
	{
		this. countryName = countryName;
	}
	
	public String getCountryName()
	{
		return countryName;
	}
	
	public void showDetails()
	{
		System.out.println("Ticket ID: " + this.getTid());
		System.out.println("Ticket's Name: " + this.getName());
		System.out.println("Ticket Price: " + this.getPrice());
		System.out.println("Available Ticket Quantity: " + this.getAvailableQuantity());
		System.out.println("Country Name: " + countryName);
	}
		
}