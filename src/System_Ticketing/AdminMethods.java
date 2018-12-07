package System_Ticketing;

import java.util.Scanner;

public class AdminMethods {
	Scanner sc=new Scanner(System.in);
	LoginAccess login_access=new LoginAccess();
	static int a=0;
	int c=0;
	public String CreateTicket(Database d)
	{
		System.out.println();
		System.out.println("Enter the agent name : ");
		String agent_name=sc.nextLine();
		for(int i=0;i<d.list1.size();i++)
		{
			if(d.list1.get(i).getEmp_name().equals(agent_name))
			{
				c=1;
				int numOfTickets=d.list1.get(i).getNumOfTickets();
				if(numOfTickets<2)
				{
					d.list1.get(i).setNumOfTickets(numOfTickets+1);
					System.out.println("Ticket Assigned Successfully.");
					return "0";
				}
				else if(numOfTickets>=2)
				{
					System.out.println("Cannot assign more tickets to "+d.list1.get(i).getEmp_name()+".");
					System.out.println("Re-assign Ticket.");
					return "0";
				}
			}
		}
		if(c==0)
		{
			System.out.println("Invalid Agent Name");
			return "0";
		}
		return agent_name;
	}
	public String AddAgent(Database d)
	{
		System.out.println();
		System.out.println("The number of agents = "+d.list1.size()+".");
		System.out.println("Enter employee id : ");
		int emp_id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee name : ");
		String emp_name=sc.nextLine();
		System.out.println("Enter employee age : ");
		int emp_age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter employee password : ");
		String password=sc.nextLine();
		AgentDetails details=new AgentDetails(emp_id, emp_name, emp_age, password,0);
		d.list1.add(details);
		System.out.println("Agent Successfully Added");
		System.out.println("The number of agents = "+d.list1.size()+".");
		System.out.println();
		return "0";
	}
	public String DeleteAgent(Database d)
	{
		System.out.println();
		System.out.println("The number of employees = "+d.list1.size());
		System.out.println("Enter the employee id you want to remove from database : ");
		int emp_id=sc.nextInt();
		int c=0;
		for(int i=0;i<d.list1.size();i++)
		{
			if(d.list1.get(i).getEmp_id()==emp_id)
			{
				c=1;
				d.list1.remove(i);
				System.out.println("Employee successfully removed");
				System.out.println("The number os employees = "+d.list1.size());
				return "0";
			}
		}
		if(c==0)
		{
			System.out.println("Incorrect employee id");
			return "0";
		}
		System.out.println();
		return null;
	}
	public String ViewAgent(Database d)
	{
		System.out.println();
		System.out.println("List of Agents : ");
		for(int i=0;i<d.list1.size();i++)
		{
			System.out.println(d.list1.get(i));
		}
		System.out.println();
		return "0";
	}
	public void Logout(Database d)
	{
		System.out.println("Logout Successful");
		System.out.println();
		login_access.checklogin(d);
	}
}
