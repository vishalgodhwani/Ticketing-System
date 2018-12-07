package System_Ticketing;

public class AgentMethods {
	Database d=new Database();
	LoginAccess login_access=new LoginAccess();
	public String UpdateTicket(String username,Database d)
	{
		for(int i=0;i<d.list1.size();i++)
		{
			if(d.list1.get(i).getEmp_name().equals(username))
			{
				int numOfTickets=d.list1.get(i).getNumOfTickets();
				if(numOfTickets>0)
				{
					d.list1.get(i).setNumOfTickets(numOfTickets-1);
					System.out.println("Ticket Updated Successfully");
					return "0";
				}
				else
				{
					System.out.println("No Tickets to update");
					return "0";
				}
			}
		}
		return null;
	}
	public void Logout(Database d)
	{
		System.out.println("Logout Successful");
		login_access.checklogin(d);
	}
}
