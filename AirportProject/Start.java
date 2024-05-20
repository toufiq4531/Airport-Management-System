import java.lang.*;
import java.util.Scanner;
import classes.*;
import fileio.*;

public class Start
{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in);
		Airport a = new Airport();
		FileReadWrite frw = new FileReadWrite();
		
		System.out.println("-->>");
		System.out.println("Welcome to Airport Management Application.");
		System.out.println("///////////////////////////////////////");
		
		boolean repeat = true;
		
		while (repeat)
		{
			System.out.println("Please Select a option :");
			System.out.println("\t1. Empolyee Management");
			System.out.println("\t2. Flight Management");
			System.out.println("\t3. Flight Ticket Management");
			System.out.println("\t4. Ticket Quantity Add-sell");
			System.out.println("\t5. Exit");
			System.out.println("///////////////////////////////////////");
			
			System.out.print("Select your choice & hit enter : ");
			int choice = sc.nextInt();
			
			switch(choice)
			{
				case 1:
					System.out.println("///////////////////////////////////////");
					System.out.println("You have Selected Employee Management.");
					System.out.println("///////////////////////////////////////");
					
					System.out.println("You have these options : ");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Show All Employees");
					System.out.println("\t4. Search An Employee");
					System.out.println("\t5. Go Back");
					
					System.out.print("Select your option : ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						    System.out.println("///////////////////////////////////////");
					        System.out.println("You have Selected to Insert New Employee.");
					        System.out.println("///////////////////////////////////////");
					
					        System.out.print("Enter Employee ID : ");
					        String eId1 = sc.next();
					        System.out.print("Enter Employee Name : ");
					        String name1 = sc.next();
					        System.out.print("Enter Employee Salary : ");
					        double salary1 =  sc.nextDouble();
					
					        Employee e1 = new Employee();
					        e1.setEid(eId1);
					        e1.setName(name1);
					        e1.setSalary(salary1);
					
					        if(a.insertEmployee(e1))
					        {
								System.out.println("///////////////////////////////////////");
						        System.out.println("Empolyee has been Inserted With ID : "+e1.getEid());
								System.out.println("///////////////////////////////////////");
					        }
					        else
					        {
						        System.out.println("An Empolyee Cannot Inserted.");
								System.out.println("///////////////////////////////////////");
				            }
					        break; 
						
						case 2:
						    System.out.println("////////////////////////////////////////////////");
					        System.out.println("You have Selected to Remove An Existing Employee.");
					        System.out.println("///////////////////////////////////////");
					
					        System.out.print("Enter an Employee ID to Remove : ");
							String eId2 = sc.next();
                            
                            Employee e2 = a.searchEmployee(eId2);
                            
                            if(e2 != null)
							{
								if(a.removeEmployee(e2))
								{
									System.out.println("An Employee Removed with ID : "+e2.getEid());
									System.out.println("///////////////////////////////////////");
							    }
								else
								{
									System.out.println("An Employee Can Not be Removed.");
									System.out.println("///////////////////////////////////////");
							    }
							}
                            else
						    {
								System.out.println("An Employee Does Not Exist.");
								System.out.println("///////////////////////////////////////");
							}	
							break;
							
						case 3:
							System.out.println("///////////////////////////////////////");
							System.out.println("You have Selected to See All Employee");
							System.out.println("///////////////////////////////////////");
							a.showAllEmployees();
							break;
							
						case 4:
							System.out.println("///////////////////////////////////////");
							System.out.println("You Have Selected to Search An Employee");
							System.out.println("///////////////////////////////////////");
							
							System.out.print("Enter an Employee ID to Search : ");
							String eId3 = sc.next();
							
							Employee e3 = a.searchEmployee(eId3);
							
							if(e3 != null)
							{
								System.out.println("///////////////////////////////////////");
								System.out.println("An Employee Found.");
								System.out.println("-->>");
								System.out.println("An Employee ID : "+e3.getEid());
								System.out.println("An Employee Name : "+e3.getName());
								System.out.println("An Employee Salary : "+e3.getSalary());
								System.out.println("///////////////////////////////////////");
							}
							else
							{
								System.out.println("///////////////////////////////////////");
								System.out.println("An Employee Does Not Exist");
								System.out.println("///////////////////////////////////////");
							}
							break;
							
						case 5:
							System.out.println("///////////////////////////////////////");
							System.out.println("You have Selected to Go Back.");
							System.out.println("///////////////////////////////////////");
							
							break;
					}
					
					break; 
					
				case 2:
					System.out.println("///////////////////////////////////////");
					System.out.println("You Have Selected Flight Management.");
					System.out.println("///////////////////////////////////////");
					
					System.out.println("You have these options : ");
					System.out.println("\t1. Insert New Flight.");
					System.out.println("\t2. Remove Existing Flight.");
					System.out.println("\t3. Show All Flight.");
					System.out.println("\t4. Search A Flight.");
					System.out.println("\t5. Go Back.");
					
					System.out.print("Select your option & hit ENTER : ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						    System.out.println("///////////////////////////////////////");
							System.out.println("You Have  to Insert A Flight");
							System.out.println("///////////////////////////////////////");
							
							System.out.print("Enter A Flight ID : ");
						    String fId1 = sc.next();
							System.out.print("Enter A Flight Name : ");
							String name1 = sc.next();
							
							Flight f1 = new Flight();
							f1.setFid(fId1);
							f1.setName(name1);
							
							if(a.insertFlight(f1))
							{
								System.out.println("A Flight Inserted with ID: "+f1.getFid());
								System.out.println("///////////////////////////////////////");
						    }
							else
							{
								System.out.println("A Flight cannot be inserted");
								System.out.println("///////////////////////////////////////");
						    }
							
							break; 
						
						case 2:
						    System.out.println("///////////////////////////////////////");
					        System.out.println("You have Selected to Remove an Existing Flight.");
					        System.out.println("///////////////////////////////////////");
					
					        System.out.print("Enter a Flight ID to Remove : ");
							String fId2 = sc.next();
                            
                            Flight f2 = a.searchFlight(fId2);
                            
                            if(f2 != null)
							{
								if(a.removeFlight(f2))
								{
									System.out.println("A Flight Removed with ID : "+f2.getFid());
									System.out.println("///////////////////////////////////////");
							    }
								else
								{
									System.out.println("A Flight Can Not be Removed.");
									System.out.println("///////////////////////////////////////");
								}
							}
                            else
						    {
								System.out.println("A Flight Does Not Exist.");
							}	
							break;
							
						case 3:
							System.out.println("///////////////////////////////////////");
							System.out.println("You Have Selected See All Flight.");
							System.out.println("///////////////////////////////////////");
							a.showAllFlights();
							break;
							
						case 4:
							System.out.println("///////////////////////////////////////");
							System.out.println("You Have Selected to Search Flight");
							System.out.println("///////////////////////////////////////");
							
							System.out.print("Enter a Flight ID to Search : ");
							String fId3 = sc.next();
							
							Flight f3 = a.searchFlight(fId3);
							
							if(f3 != null)
							{
								System.out.println("A Flight Found.");
								System.out.println("A Flight ID : "+f3.getFid());
								System.out.println("A Flight Name : "+f3.getName());
						
							}
							else
							{
								System.out.println("A Flight Does Not Exist");
								System.out.println("///////////////////////////////////////");
							}
						    break;
							
						case 5:
							System.out.println("///////////////////////////////////////");
							System.out.println("You Have Selected to Go Back.");
							System.out.println("///////////////////////////////////////");
							
							break;
					}
					
					break;
				
				case 3:
				    System.out.println("///////////////////////////////////////");
					System.out.println("You have Selected For Flight Ticket Management.");
					System.out.println("///////////////////////////////////////");
					
					System.out.println("You have these options : \n");
					System.out.println("\t1. Insert New Ticket");
					System.out.println("\t2. Remove Existing Ticket");
					System.out.println("\t3. Show All Ticket");
					System.out.println("\t4. Search A Ticket");
					System.out.println("\t5. Go Back");
					
					System.out.print("Select your option & hit ENTER : ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
							
							System.out.println("///////////////////////////////////////");
							System.out.println("You have Selected to Insert a Ticket for a Flight.");
							System.out.println("///////////////////////////////////////");
							
							System.out.print("Enter Flight ID : ");
							String fId1 = sc.next();
							
							if(a.searchFlight(fId1)!=null)
							{
								System.out.println("Please Select Ticket Type");
								System.out.println("\t1. Domestic Ticket");
								System.out.println("\t2. International Ticket");
								System.out.println("\t3. Go Back");
								
								System.out.print("Enter Ticket Type: ");
								int TicketType = sc.nextInt();
								
								if(TicketType == 1)
								{
									System.out.print("Enter Ticket ID : ");
									String tId5 = sc.next();
									System.out.print("Enter Ticket Name : ");
									String tn1 = sc.next();
									System.out.print("Enter Available Quantity : ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Price : ");
									double pr1 = sc.nextDouble();
									System.out.print("Enter District Name : ");
									String dn1 = sc.next();
									
									Domestic d1 = new Domestic();
									d1.setTid(tId5);
									d1.setName(tn1);
									d1.setAvailableQuantity(aq1);
									d1.setDistrictName(dn1);
									d1.setPrice(pr1);
									
									if(a.searchFlight(fId1).insertTicket(d1))
									{
										System.out.println("Ticket name  "+tn1+"  inserted for Flight ID  "+fId1);
										System.out.println("///////////////////////////////////////");
									}
									else
									{
										System.out.println("Ticket cannot be inserted");
										System.out.println("///////////////////////////////////////");
									}
								}
								else if(TicketType == 2)
								{
			                        System.out.print("Enter Ticket ID : ");
									String tId6 = sc.next();
									System.out.print("Enter Ticket Name : ");
									String tn1 = sc.next();
									System.out.print("Enter Availabe Quantity : ");
									int aq1 = sc.nextInt();
									System.out.print("Enter Price : ");
									double pr2 = sc.nextDouble();
									System.out.print("Enter Country Name : ");
									String cn1 = sc.next();
									
									International i1 = new International();
									i1.setTid(tId6);
									i1.setName(tn1);
									i1.setAvailableQuantity(aq1);
									i1.setPrice(pr2);
									i1.setCountryName(cn1);
									
									
									if(a.searchFlight(fId1).insertTicket(i1))
									{
										System.out.println("Ticket Name  "+tn1+"  inserted for  Flight  ID  "+fId1);
										System.out.println("///////////////////////////////////////");
									}
									else
									{
										System.out.println("Ticket cannot be inserted");
										System.out.println("///////////////////////////////////////");
									}
								}
								else if(TicketType == 3)
								{
									System.out.println("///////////////////////////////////////");
									System.out.println("Going Back.............");
									System.out.println("///////////////////////////////////////");
								}
								else
								{
									System.out.println("///////////////////////////////////////");
									System.out.println("Invalid Type.");
									System.out.println("///////////////////////////////////////");
								}
									
							}
							else
							{
								System.out.println("No Flight ID Found.");
								System.out.println("///////////////////////////////////////");
							}
							
							break;
							
							
					    case 2:
						
						    System.out.println("///////////////////////////////////////");
							System.out.println("You Have Selected to Remove an Existing Ticket.");
							System.out.println("///////////////////////////////////////");
							
							System.out.print("Enter Flight ID : ");
							String fId4= sc.next();
							
							if(a.searchFlight(fId4)!=null)
							{
								System.out.print("Enter Ticket ID : ");
								String tId2=sc.next();
								if(a.searchFlight(fId4).searchTicket(tId2)!=null)
								{
									System.out.print("Enter ID to Remove Ticket.");
									String tId3= sc.next();
									
									Ticket t4 = a.searchFlight(fId4).searchTicket(tId2);
									if(a.searchFlight(fId4).removeTicket(t4))
									{
										System.out.println("Ticket ID Removed With ID : "+t4.getTid());
										System.out.println("///////////////////////////////////////");
									}
									else
									{
										System.out.println(" Ticket Cannot Removed.");
										System.out.println("///////////////////////////////////////");
									}
								}
								else
								{
									System.out.println("No Ticket ID Found.");
									System.out.println("///////////////////////////////////////");
								}
							}
						    else
							{
								System.out.println("No Flight ID Found.");
							}	
					    
						    
					    case 3:
							System.out.println("///////////////////////////////////////");
							System.out.println("You Have Selected See All Tickets.");
							System.out.println("///////////////////////////////////////");
							System.out.println("Enter Flight ID : ");
							String fId6=sc.next();
							Flight f4 = a.searchFlight(fId6);
							if(f4!=null)
							{
								f4.showAllTickets();
							}
							else
							{
								System.out.println("No Ticket Available.");
								System.out.println("///////////////////////////////////////");
							}
							break;
							
						case 4:
							System.out.println("///////////////////////////////////////");
							System.out.println("You Have Selected to Search For a Ticket.");
							System.out.println("///////////////////////////////////////");
							
							System.out.print("Enter Flight ID : ");
							String fId5=sc.next();
							if(fId5!=null)
							{
							    System.out.print("Enter a Ticket ID to Search : ");
							    String tId4 = sc.next();
							
							    Ticket t3 = a.searchFlight(fId5).searchTicket(tId4);
							
							 if(t3 != null)
							 { 
								System.out.println("Ticket Found.");
								System.out.println("Ticket Name : "+t3.getName());
								System.out.println("Ticket Available Quantity : "+t3.getAvailableQuantity());
								System.out.println("Ticket Price : "+t3.getPrice());
							 }
							 else
							 {
								System.out.println("Ticket Does Not Exist");
								System.out.println("///////////////////////////////////////");
							 }
							 
							}
							
							break;
							
						case 5:
							System.out.println("///////////////////////////////////////");
							System.out.println("You Have Selected to Go Back.");
							System.out.println("///////////////////////////////////////");
							
							break;
							
					}

					break;
					
				case 4:
					System.out.println("///////////////////////////////////////");
					System.out.println("You Have Selected For Ticket Quantity Add-sell.");
					System.out.println("///////////////////////////////////////");
					
					System.out.println("You have following options: \n");
					System.out.println("\t1. Add Ticket");
					System.out.println("\t2. Sell Ticket");
					System.out.println("\t3. Show Add Sell History");
					System.out.println("\t4. Go Back");
					
					System.out.print("Select Your Option & hit ENTER : ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1: 
							
							System.out.println("///////////////////////////////////////");
							System.out.println("You Choose to Add a Ticket.");
							System.out.println("///////////////////////////////////////");
							
							System.out.print("Enter Flight ID: ");
							String fId1 = sc.next();
							
							if(a.searchFlight(fId1) != null)
							{
								System.out.print("Enter  Ticket ID : ");
								String tId1 = sc.next();
								
								if(a.searchFlight(fId1).searchTicket(tId1) != null)
								{
									System.out.print("Enter Amount to Add : ");
									int am1 = sc.nextInt();
									
									if(a.searchFlight(fId1).searchTicket(tId1).addQuantity(am1))
									{
										System.out.println("///////////////////////////////////////");
										System.out.println("Ticket Added Successfully.");
										frw.writeInFile("Added :  $"+am1+"  in Ticket ID  "+tId1+"  in Flight ID  "+fId1);
										System.out.println("///////////////////////////////////////");
									}
									else
									{
										System.out.println(" Ticket Cannot be Added");
										System.out.println("///////////////////////////////////////");
									}
								}
								else
								{
									System.out.println("No Ticket ID Found.");
									System.out.println("///////////////////////////////////////");
								}
								
							}
							else
							{
								System.out.println("No Flight ID Found");
								System.out.println("///////////////////////////////////////");
							}
							
							break;
							
						case 2:
						    System.out.println("///////////////////////////////////////");
							System.out.println("You have Selected to Sell a Ticket.");
							System.out.println("///////////////////////////////////////");
							
							System.out.print("Enter Flight ID : ");
							String fId6 = sc.next();
							
							if(a.searchFlight(fId6) != null)
							{
								System.out.print("Enter  Ticket ID : ");
								String tId1 = sc.next();
								
								if(a.searchFlight(fId6).searchTicket(tId1) != null)
								{
									System.out.print("Enter Amount to Sell : ");
									int am2 = sc.nextInt();
									
									if(a.searchFlight(fId6).searchTicket(tId1).sellQuantity(am2))
									{
										System.out.println("///////////////////////////////////////");
										System.out.println("Ticket Has Been Sold .");
										System.out.println("///////////////////////////////////////");
										frw.writeInFile("Sold :  $"+am2+"  in Ticket ID  "+tId1+"  by Flight ID  "+fId6);
									}
									else
									{
										System.out.println(" Ticket Cannot be Sold");
										System.out.println("///////////////////////////////////////");
									}
								}
								else
								{
									System.out.println("No Ticket ID Found.");
									System.out.println("///////////////////////////////////////");
								}
								
							}
							else
							{
								System.out.println("No Flight ID Found.");
								System.out.println("///////////////////////////////////////");
							}
							
			
						
							break;
							
						case 3:
							
							System.out.println("///////////////////////////////////////");
							System.out.println("You Have Selected to Show All Sell History.");
							System.out.println("///////////////////////////////////////");
							
							frw.readFromFile();
							
							break;
							
						case 4:
						    
							System.out.println("///////////////////////////////////////");
							System.out.println("You Have Selected to Go Back.");
							System.out.println("///////////////////////////////////////");
						
							break;
							
						default:
						
							break;
					}
					
					break;
				
				case 5:
					System.out.println("///////////////////////////////////////");
					System.out.println("You Have Selected to Exit");
					System.out.println("///////////////////////////////////////");
					repeat = false;
					break;
				
				    default:
					System.out.println("///////////////////////////////////////");
					System.out.println("Invalid Choice.");
					System.out.println("///////////////////////////////////////");
					break;				    
			}
		}
	}
}