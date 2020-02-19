package com.capgemini.fms.servicetest;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.capgemini.fms.dto.Password;
import com.capgemini.fms.dto.User;
import com.capgemini.fms.exception.MyException;
import com.capgemini.fms.service.UserServiceImpl;

import junit.framework.Assert;

public class UserServiceTest {
	UserServiceImpl userServiceobj = new UserServiceImpl();
	
	@Test
	public void addUserTest()
	{
		User user=new User("admin10", 11601234, "XYZ", new Password("@101010#"), 987654323, "admin10@gmail.com");
		Assert.assertEquals(user,userServiceobj.addUser(user) );
	}
	@Test
	public void viewUserServiceTest()
	{
		User user=new User("admin1", 11602269, "Robins", new Password("@11111#"), 943074575, "admin1@gmail.com");
		try {
			Assert.assertEquals(user, userServiceobj.viewUserService(11602269));
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void viewAllUsersService()
	{
		Throwable exception = assertThrows(Exception.class,()->{
			userServiceobj.viewAllUsersService();
		});
		assertEquals("List is empty.", exception.getMessage());
	}

}
