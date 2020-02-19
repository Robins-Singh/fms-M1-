package com.capgemini.fms.dto;

public class User {

	private String userType;
	private long userID;
	private String userName;
	private Password userPassword;
	private long userPhone;
	private String userEmail;
	
	public User(String userType, long userID, String userName, Password userPassword, long userPhone,
			String userEmail) {
		super();
		this.userType = userType;
		this.userID =userID;
		this.userName = userName;
		this.userPassword =userPassword;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
	}
	
	
	
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Password getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(Password userPassword) {
		this.userPassword = userPassword;
	}
	public long getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(long userPhone) {
		this.userPhone = userPhone;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String toString()
	{
		return userType+" "+userID+" "+userName+" "+userPassword+" "+userPhone+" "+userEmail+" ";
		
	}
}
