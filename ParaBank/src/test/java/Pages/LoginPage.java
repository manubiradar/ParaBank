package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	By text_username_login=By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
	By text_password_login=By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
	By btn_login=By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
	By btn_logout=By.xpath("//a[contains(text(),'Log Out')]");
	
	
public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void enterUsername(String username) {
		
		driver.findElement(text_username_login).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(text_password_login).sendKeys(password);
	}
	
	public void clickLoginButton() {
		
		driver.findElement(btn_login).click();
	}
	
	
	public void clickLogoutButton() {
		
		driver.findElement(btn_logout).click();	
	}
	
	
	public void verifytitle() {
		String expectedTitle = "ParaBank | Accounts Overview";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
//        System.out.println(actualTitle);
    }
	
	

}
