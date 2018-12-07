package System_Ticketing;

public class LoginCheck {
	AdminDetails admin_details=new AdminDetails();
	public int logincheck(String username,String password,Database d)
	{
		int c=0;
		for(int i=0;i<d.list1.size();i++)
		{
			if(d.list1.get(i).getEmp_name().equals(username))
			{
				c=1;
				if(d.list1.get(i).getPassword().equals(password))
				{
					System.out.println("Login Successful");
					System.out.println();
					return 1;
				}
				else
				{
					System.out.println("Password Incorrect");
					System.out.println("Re-enter Details ");
					System.out.println();
					return 0;
				}
			}
		}
		if(c==0)
		{
			System.out.println("Username Incorrect");
			System.out.println("Re-enter Details ");
			System.out.println();
			return 0;
		}
		return c;
	}
	public int checklogin(String password)
	{
		String password1=password;
		if(password1.equals(admin_details.getPassword()))
		{
			System.out.println("Login Successful");
			return 1;
		}
		else
		{
			System.out.println("Password Incorrect");
			System.out.println();
			return 0;
		}
	}
}
