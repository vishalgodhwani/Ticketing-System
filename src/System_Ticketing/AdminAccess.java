package System_Ticketing;

import java.util.Scanner;

public class AdminAccess {
	Scanner sc=new Scanner(System.in);
	AdminMethods method_details=new AdminMethods();
	public void welcomeadmin(Database d)
	{
		String admin_choice="0";
		while(admin_choice!="1"||admin_choice!="2"||admin_choice!="3"||admin_choice!="4")
		{
			System.out.println();
			System.out.println("1>Create Ticket");
			System.out.println("2>Add Agent");
			System.out.println("3>Remove Agent");
			System.out.println("4>View Agent List");
			System.out.println("5>Exit");
			System.out.println("Select Task : ");
			admin_choice=sc.nextLine();
			if(admin_choice.equals("1"))
			{
				admin_choice=method_details.CreateTicket(d);
			}
			else if(admin_choice.equals("2"))
			{
				admin_choice=method_details.AddAgent(d);
			}
			else if(admin_choice.equals("3"))
			{
				admin_choice=method_details.DeleteAgent(d);
			}
			else if(admin_choice.equals("4"))
			{
				admin_choice =method_details.ViewAgent(d);
			}
			else if(admin_choice.equals("5"))
			{
				method_details.Logout(d);
			}
			else
			{
				System.out.println("Invalid Input");
				System.out.println();
				admin_choice="0";
			}
		}
	}
}
