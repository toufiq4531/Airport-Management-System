package interfaces;
import java.lang.*;
import classes.Flight;

public interface FlightOperations
{
	boolean insertFlight(Flight f);
	boolean removeFlight(Flight f);
	Flight searchFlight(String fid);
	void showAllFlights();
}