package com.JUnitPractice.com;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Parents {
	public WebDriver driver;
	public WebDriverWait wait;
	
	@Before
	public void OpenBrowser() {
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--disable-notifications");
		driver = new ChromeDriver(ops);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	protected void openFacebook(String url) {
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	protected void enterCredentials(String username, String pass) {
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.id("u_0_b")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
	protected void validateMainPage() {
		WebElement message = driver.findElement(By.xpath("//div[text()='Messenger']"));
		if(message.isDisplayed()){
			System.out.println("Expected text is correct: Test 'validateObject' has Passed");
		}else {
			System.out.println("Expected text is incorrect: Test 'validateObject' has failed");
			System.out.println("Expected text : " + message);		
	}}
		protected void logOut() {
			WebElement closeOptions = driver.findElement(By.id("userNavigationLabel"));
			closeOptions.click();
			driver.manage().timeouts().implicitlyWait(15,  TimeUnit.SECONDS);
			WebElement closeSession = driver.findElement(By.xpath("(//span[contains(@class,'_54nh')])[7]"));
			closeSession.click();
			driver.manage().timeouts().implicitlyWait(15,  TimeUnit.SECONDS);
			WebElement sessionClosed = driver.findElement(By.xpath("//*[@id=\"u_0_b\"]"));
			if(sessionClosed.isDisplayed()){
				System.out.println("Test 'closeSession' has passed");
			}else{
				System.out.println("Test 'closeSession' has failed");}
		}
		@After
		public void closeWindows() {
			driver.quit();
		}
		}