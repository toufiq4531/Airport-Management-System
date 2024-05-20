package interfaces;
import java.lang.*;
import classes.*;


public interface TicketOperations
{
	boolean insertTicket(Ticket t);
	boolean removeTicket(Ticket t);
	Ticket searchTicket(String tid);
	void showAllTickets();
}