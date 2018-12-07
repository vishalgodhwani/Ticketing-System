package System_Ticketing;

import java.util.Scanner;

public class AgentAccess {
	Scanner sc=new Scanner(System.in);
	AgentMethods agent_methods=new AgentMethods();
	public void welcomeagent(String agent_name,Database d)
	{
		String agent_choice="0";
		while(agent_choice!="1"||agent_choice!="2")
		{
			System.out.println();
			System.out.println("1>Update Tickets");
			System.out.println("2>Logout");
			System.out.println("Select Task : ");
			agent_choice=sc.nextLine();
			if(agent_choice.equals("1"))
			{
				agent_choice=agent_methods.UpdateTicket(agent_name,d);
			}
			else if(agent_choice.equals("2"))
			{
				agent_methods.Logout(d);
			}
			else
			{
				System.out.println("Invalid Input");
				System.out.println();
				agent_choice="0";
			}
		}
		
	}
}
