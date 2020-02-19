package com.capgemini.fms.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.capgemini.fms.dto.Password;
import com.capgemini.fms.dto.User;

public class UserRepository {

	static List<User> user = new CopyOnWriteArrayList<User>();
	public UserRepository(){
	user.add(new User("admin1", 11602269, "Robins", new Password("@11111#"), 943074575, "admin1@gmail.com"));
	user.add(new User("admin2", 11602270, "Satyam", new Password("@22222#"), 943074576, "admin2@gmail.com"));
	user.add(new User("admin3", 11601234, "Reedam", new Password("@33333#"), 943074577, "admin3@gmail.com"));
	user.add(new User("admin4", 11602272, "Akash",  new Password("@44444#"), 943074578, "admin4@gmail.com"));
	user.add(new User("admin5", 11602273, "Rishab", new Password("@55555#"), 943074579, "admin5@gmail.com"));
	user.add(new User("user1",  11716361, "Himan",  new Password("@66666#"), 943074580, "user1@gmail.com"));
	user.add(new User("user2",  11716362, "Vishal", new Password("@77777#"), 943074581, "user2@gmail.com"));
	user.add(new User("user3",  11716363, "Ashish", new Password("@88888#"), 943074582, "user3@gmail.com"));
	user.add(new User("user4",  11716360, "Sachin", new Password("@99999#"), 943074583, "user4@gmail.com"));
	user.add(new User("user5",  11716364, "Kamal",  new Password("@00000#"), 943074584, "user5@gmail.com"));
	
	}
	public static List<User> getUser() {
		return user;
	}
	public static void setUser(List<User> user) {
		UserRepository.user = user;
	}
	
}
