package System_Ticketing;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Database d=new Database();
		LoginAccess login_access=new LoginAccess();
		login_access.checklogin(d);
	}
}
