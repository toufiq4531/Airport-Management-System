package classes;
import java.lang.*;
import interfaces.*;

public class Airport implements FlightOperations, EmployeeOperations
{
	private Flight flights[] = new Flight[25];
	private Employee employees[] = new Employee[200];
	
	
	public boolean insertFlight(Flight f)
	{
		boolean flag = false;
		
		for(int i = 0; i<flights.length; i++)
		{
			if(flights[i] == null)
			{
				flights[i] = f;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeFlight(Flight f)
	{
		boolean flag = false;
		
		for(int i = 0; i<flights.length; i++)
		{
			if(flights[i] == f)
			{
				flights[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public Flight searchFlight(String fId)
	{
		Flight f = null;
		
		for(int i = 0; i<flights.length; i++)
		{
			if(flights[i] != null)
			{
				if(flights[i].getFid().equals(fId))
				{
					f = flights[i];
					break;
				}
			}
		}
		return f;
	}
	
	public void showAllFlights()
	{
		for(int i = 0; i<flights.length; i++)
		{
			if(flights[i] != null)
			{
				System.out.println("----------------------");
				flights[i].showDetails();
				System.out.println();
			}
		}
	}
	
	public boolean insertEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == null)
			{
				employees[i] = e;
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	public boolean removeEmployee(Employee e)
	{
		boolean flag = false;
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] == e)
			{
				employees[i] = null;
				flag = true;
				break;
			}
		}
		return flag;
	}

	public Employee searchEmployee(String eId)
	{
		Employee e = null;
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				if(employees[i].getEid().equals(eId))
				{
					e = employees[i];
					break;
				}
			}
		}
		return e;
	}
	
	public void showAllEmployees()
	{
		System.out.println("---------------------");
		
		for(int i=0; i<employees.length; i++)
		{
			if(employees[i] != null)
			{
				System.out.println("Employee Id: " + employees[i].getEid());
				System.out.println("Employee Name: " + employees[i].getName());
				System.out.println("Employee Salary: " + employees[i].getSalary());
				System.out.println();
			}
		}
	}
}