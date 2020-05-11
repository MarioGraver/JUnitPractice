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
		enterCredentials("user","pass");
	}
	@Test
	public void MainPage() {
		openFacebook("http://www.facebook.com");
		enterCredentials("user11","pass22");
		validateMainPage();
	}
	@Test
	public void exitfacebook() {
		openFacebook("http://www.facebook.com");
		enterCredentials("user11","pass22");
		logOut();
	}
	

}
