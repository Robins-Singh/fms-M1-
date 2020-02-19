package com.capgemini.fms.dao;

import java.util.*;
import com.capgemini.fms.util.*;
import com.capgemini.fms.dto.User;

public class UserDaoImpl {
     static  List<User> list = new ArrayList<User>();
     List<User> userdata = UserRepository.getUser();
    
    public User addUser(User user)
  	{
  		return user;
  	}
    
  	 public User viewUser(long id)
  	{
  		for(User userobj:list)
  		{
  			if(userobj.getUserID()==id)
  			{
  				return userobj;
  			}
  		}
  		return null;
  	}
  	 
  	public List<User> viewUserDao()
  	{
  		return userdata;
  	}
  	
  	public User updateUser(User user)
  	{
  		return user;
  		
  	}
  	
  	public void deleteUser(long id)
  	{
  		for(User userobj:list)
  		{
  			if(userobj.getUserID()==id)
  			{
  				list.remove(userobj);
  			}
  		}
  	}
      
      
}
