package System_Ticketing;

import java.util.Scanner;

public class LoginAccess {
	Scanner sc =new Scanner(System.in);
	public void checklogin(Database d) {
		LoginCheck login_check=new LoginCheck();
		String choice="0";
		int b=0;
		boolean u;
		System.out.println("Uncode Ticketing System");
		outer:
		while(choice!="1"||choice!="2")
		{
			System.out.println("1>Agent Login");
			System.out.println("2>Admin Login");
			System.out.println("Enter appropriate choice : ");
			choice=sc.nextLine();
			if(choice.equals("1"))
			{
				System.out.println("Welcome");
				while(b==0)
				{
					System.out.println("Enter Username : ");
					String agent_username=sc.nextLine();
					System.out.println("Enter Password : ");
					String agent_password=sc.nextLine();
					b=login_check.logincheck(agent_username, agent_password,d);
					if(b==1)
					{
						AgentAccess agent_access=new AgentAccess();
						agent_access.welcomeagent(agent_username,d);
						break outer;
					}
					else
					{
						b=0;
					}
				}
			}
			else if(choice.equals("2"))
			{
				System.out.println();
				System.out.println("Welcome Shravani");
				System.out.println();
				while(b==0)
				{
					System.out.println("Enter Password: ");
					String admin_password=sc.nextLine();
					b=login_check.checklogin(admin_password);
					if(b==1)
					{
						AdminAccess admin_access=new AdminAccess();
						admin_access.welcomeadmin(d);
						break outer;
					}
					else
					{
						b=0;
					}
				}
			}
			else
			{
				System.out.println("Invalid Input");
				System.out.println("Enter valid input");
			}
		}
	}
}
