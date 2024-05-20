package classes;
import java.lang.*;

public class Domestic extends Ticket
{
	private String districtName;

		
	public Domestic()
	{
		System.out.println("DT-E");
	}

	

			
	public void setDistrictName(String districtName)
	{
		this. districtName = districtName;
	}
	
	public String getDistrictName()
	{
		return districtName;
	}
	
	public void showDetails()
	{
		System.out.println("Ticket ID: " + this.getTid());
		System.out.println("Ticket's Name: " + this.getName());
		System.out.println("Ticket Price: " + this.getPrice());
		System.out.println("Available Ticket Quantity: " + this.getAvailableQuantity());
		System.out.println("District Name: " + districtName);
	}
		
}