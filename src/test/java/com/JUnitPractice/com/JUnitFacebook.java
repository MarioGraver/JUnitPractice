package com.JUnitPractice.com;

import org.junit.Test;

public class JUnitFacebook extends Parents{
	
	@Test
	public void navigateToWebPage() {
		openFacebook("http://www.facebook.com");
	}
	@Test
	public void Credentials() {
		openFacebook("http://www.facebook.com");
		enterCredentials("alberto.graver@gmail.com","Albertano@123");
	}
	@Test
	public void MainPage() {
		openFacebook("http://www.facebook.com");
		enterCredentials("alberto.graver@gmail.com","Albertano@123");
		validateMainPage();
	}
	@Test
	public void exitfacebook() {
		openFacebook("http://www.facebook.com");
		enterCredentials("alberto.graver@gmail.com","Albertano@123");
		logOut();
	}
	

}
