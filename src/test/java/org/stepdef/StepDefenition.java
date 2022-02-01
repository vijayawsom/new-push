package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefenition {
	WebDriver driver;
	
	@Given("^user is on Fb page on chrome browser$")
	public void user_is_on_Fb_page_on_chrome_browser()  {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	   
	}

	@When("^user enter username and password$")
	public void user_enter_username_and_password() {
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("vijay");
	    
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("1234");
	}

	@When("^click login button$")
	public void click_login_button()  {
		
		WebElement btnlogin = driver.findElement(By.name("login"));
		btnlogin.click();
	}

	@Then("^user should check home page is vissible or not$")
	public void user_should_check_home_page_is_vissible_or_not()  {
	    
		System.out.println("Invalid");
	}

}
