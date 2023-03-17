package StepDefinitions;

import io.cucumber.java.en.*;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.RegisterPage;

public class Register {
	WebDriver driver = null;
	RegisterPage register ;
	
	@Given("I am on the register page")
	public void i_am_on_the_register_page() {
		System.setProperty("webdriver.chrome.driver", "C://automation//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.edge.driver","C:/automation/edgedriver_win64/msedgedriver.exe");
//		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		Assert.assertEquals(driver.getTitle(), "ParaBank | Register for Free Online Account Access");
	}

	@When("^I enter the details of user such as (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*) (.*)$")
	public void i_enter_the_details_of_user_such_as_FirstName_LastName_Address_City_State_ZipCode_Phone_SSN_Username_Password_Confirm (String FirstName, String LastName, String Address, String City, String State, String ZipCode, String Phone, String SSN, String Username, String Password, String Confirm) {
	   register = new RegisterPage(driver);
	   register.enterFirstName(FirstName);
	   register.enterLastName(LastName);
	   register.enterAddress(Address);
	   register.enterCity(City);
	   register.enterState(State);
	   register.enterZipCode(ZipCode);
	   register.enterPhone(Phone);
	   register.enterSSN(SSN);
	   register.enterUsername(Username);
	   register.enterPassword(Password);
	   register.enterConfirm(Confirm);
	   
	   
	}
	
	@And("I click on Register button")
	public void i_click_on_register_button() {
		register.clickRegisterButton();
	    
	}

	@Then("I verify that registeration is successful")
	public void i_verify_that_registeration_is_successful() {
		
		Assert.assertEquals(driver.getTitle(), "ParaBank | Customer Created");
		driver.close();
	}

	
}
