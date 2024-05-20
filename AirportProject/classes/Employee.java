package classes;
import java.lang.*;

public class Employee
{
	private String eId;
	private String name;
	private double salary;
	
	public void setEid(String eId)
	{
		this.eId = eId;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	
	public String getEid()
	{
		return eId;
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;
	}
}