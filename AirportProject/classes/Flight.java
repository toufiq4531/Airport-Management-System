package classes;
import java.lang.*;
import interfaces.*;


public class Flight implements TicketOperations
{
	private String fId;
	private String name;
	private Ticket tickets[] = new Ticket[50]; 

	
	public Flight()
	{
		System.out.println("E-Flight"); 
	}
	
	public Flight (String fId, String name)
	{
		System.out.println("P-Flight");
		this.fId = fId;
		this.name = name;
	}
	
	public void setFid(String fId)
	{
	    this.fId = fId;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getFid()
	{
		return fId;
	}
	public String getName()
	{
		return name;
	}
	
	public void showDetails()
	{
		System.out.println("------------------------");
		System.out.println("Flight ID: " + fId);
		System.out.println("Flight Name: " + name);
		System.out.println();
	}

	
	public boolean insertTicket(Ticket t)
	{
		boolean flag = false;
		
		for(int i = 0; i<tickets.length; i++)
		{
			if(tickets[i] == null)
			{
				tickets[i] = t;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeTicket(Ticket t)
	{
		boolean flag = false;
		
		for(int i = 0; i<tickets.length; i++)
		{
			if(tickets[i] == t)
			{
				tickets[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public Ticket searchTicket(String tId)
	{
		Ticket t = null;
		
		for(int i = 0; i<tickets.length; i++)
		{
			if(tickets[i] != null)
			{
				if(tickets[i].getTid() == tId)
				{
					t = tickets[i];
					break;
				}
			}
		}
		return t;
	}
	
	public void showAllTickets()
	{
		for(int i = 0; i<tickets.length; i++)
		{
			if(tickets[i] != null)
			{
				System.out.println("----------------------");
				tickets[i].showDetails();
				System.out.println();
			}
		}
	}
		
}
