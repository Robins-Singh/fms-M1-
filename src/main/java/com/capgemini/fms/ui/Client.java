package com.capgemini.fms.ui;
import com.capgemini.fms.exception.*;
import com.capgemini.fms.dto.*;
import com.capgemini.fms.service.*;
import com.capgemini.fms.util.*;
import java.util.*;
public class Client 
{
	public static void main(String args[])
	{

		new UserRepository();
		char ch;
		UserServiceImpl userServiceobj = new UserServiceImpl();
		do
		{
			System.out.println("What you want to do : ");
			System.out.println("1.Add User.");
			System.out.println("2.View User.");
			System.out.println("3.View All User");
			System.out.println("4.Update User");
			System.out.println("5.Delete User");
			Scanner sc = new Scanner(System.in); 
			int choice  = sc.nextInt();
			switch(choice)
			{
			case 1:{
				
				User user=new User("admin10", 11601234, "XYZ", new Password("@101010#"), 987654323, "admin10@gmail.com");
				userServiceobj.addUser(user);
			}
				break;
			case 2:
			{
				try
				{
					
					User userobj = userServiceobj.viewUserService(11601234);
					System.out.println(userobj.getUserType()+ "     " +userobj.getUserName()+"     "+userobj.getUserID() + "     "+userobj.getUserPhone() + "     "+ userobj.getUserEmail());
				}
				catch(MyException e)
				{
					System.out.println(e.getMessage());
				}
			}
				break;
			case 3:
			{
				try
				{
				List<User> userlist=new ArrayList<User>();
				userlist= userServiceobj.viewAllUsersService();
				for(User userobj:userlist)
				{
					System.out.println(userobj.getUserType()+ "     " +userobj.getUserName()+"     "+userobj.getUserID() + "     "+userobj.getUserPhone() + "     "+ userobj.getUserEmail());
					
				}
				}
				catch(MyException e)
				{
					System.out.println(e.getMessage());
				}
			}
				break;
			case 4:
			{
				userServiceobj.updateUser(11601234,943074522);
			}
				break;
			case 5 : 
			{
				try
				{
					userServiceobj.deleteUser(11601234);
				}
				catch(MyException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
			}
			System.out.println("Do you want to operate more ?(Y|N)");
			ch = sc.next().charAt(0);
		}
		while(ch=='Y'|| ch=='y');
		
	}
}
