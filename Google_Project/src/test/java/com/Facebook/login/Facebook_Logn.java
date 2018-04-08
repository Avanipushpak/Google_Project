package com.Facebook.login;

import org.testng.annotations.Test;

public class Facebook_Logn {
	@Test(priority=1,enabled=false)
	public void Login() {
		System.out.println("This is Login");
	}
	
	@Test(priority=2)
	public void Account() {
		System.out.println("Account");
	}
	
	@Test(priority=3)
	public void searchAccount() {
		System.out.println("Search Account");
	}
	
	@Test(priority=4)
	public void CreateNewAccount() {
		System.out.println("Created new Account");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
