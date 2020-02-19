package com.capgemini.fms.service;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.fms.dao.UserDaoImpl;
import com.capgemini.fms.dto.User;
import com.capgemini.fms.exception.MyException;
//import com.capgemini.fms.ui.phoneno;
import com.capgemini.fms.util.UserRepository;

public class UserServiceImpl 
{

	static UserDaoImpl userdaoobj = new UserDaoImpl();
    List<User> userdata = UserRepository.getUser();
    
	public User addUser(User user)
	{
		User userobj = userdaoobj.addUser(user);
		userdata.add(userobj);
		return user;
	}
	
	
	
	public User viewUserService(long id) throws MyException
	{
		if(id==0)
		{
			throw new MyException("ID cannot be zero");
		}
		boolean b=false;
		List<User> userlist =userdaoobj.viewUserDao();
		for(User u:userlist)
		{
			if(u.getUserID()==id)
			{
				b=true;
				return u;
			}
		}
		
		return null;	
		
	}
	
	
	public List<User> viewAllUsersService() throws MyException
	{
		List<User> userlist = new ArrayList<User>();
		userlist =userdaoobj.viewUserDao();
		if(userlist.isEmpty())
		{
			throw new MyException("List is empty.");
		}
		return userlist;
	}
	
	
	static List<User> userlist =userdaoobj.viewUserDao();
	
	public void deleteUser(long id) throws MyException
	{
		if(id==0)
		{
			throw new MyException("ID cannot be zero.");
		}
		else
		{
			for(User u:userlist)
			{
				if(u.getUserID()==id)
				{
				userlist.remove(u);
				}
			}
		}
	}
	
	
	
	
	public void updateUser(int id,long phoneno) {
		// TODO Auto-generated method stub
		List<User> userlist =userdaoobj.viewUserDao();
		for(User u:userlist)
		{
			if(u.getUserID()==id)
			{
				u.setUserPhone(phoneno);
			}
		}
		UserRepository ur=new UserRepository();
		ur.setUser(userlist);
	}
}
