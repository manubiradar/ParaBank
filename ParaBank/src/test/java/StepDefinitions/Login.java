package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.LoginPage;

public class Login {
	WebDriver driver = null;
	LoginPage login;
	

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C://automation//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
//		System.setProperty("webdriver.edge.driver","C:/automation/edgedriver_win64/msedgedriver.exe");
//		driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Assert.assertEquals(driver.getTitle(), "ParaBank | Welcome | Online Banking");
	    
	}

	@When("^user enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username , String password ) {
		login = new LoginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	    
	}

	@And("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		login.clickLoginButton();
	    
	}

	@Then("^user should be navigated to home page$")
	public void user_should_be_navigated_to_home_page() {
		login.verifytitle();
		login.clickLogoutButton();
		driver.close();
	}
	
}
