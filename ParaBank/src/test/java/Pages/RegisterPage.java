package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	WebDriver driver;
	
	
	By text_FirstName=By.xpath("//input[@id='customer.firstName']");
	By text_LastName=By.xpath("//input[@id='customer.lastName']");
	By text_Address=By.xpath("//input[@id='customer.address.street']");
	By text_City=By.xpath("//input[@id='customer.address.city']");
	By text_State=By.xpath("//input[@id='customer.address.state']");
	By text_ZipCode=By.xpath("//input[@id='customer.address.zipCode']");
	By text_Phone=By.xpath("//input[@id='customer.phoneNumber']");
	By text_SSN=By.xpath("//input[@id='customer.ssn']");
	By text_Username=By.xpath("//input[@id='customer.username']");
	By text_Password=By.xpath("//input[@id='customer.password']");
	By text_Confirm=By.xpath("//input[@id='repeatedPassword']");
	By btn_register=By.xpath("//tbody/tr[13]/td[2]/input[1]");
	
	public RegisterPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void enterFirstName(String FirstName) {
		
		driver.findElement(text_FirstName).sendKeys(FirstName);
	}
	
public void enterLastName(String LastName) {
		
		driver.findElement(text_LastName).sendKeys(LastName);
	}

public void enterAddress(String Address) {
	
	driver.findElement(text_Address).sendKeys(Address);
}

public void enterCity(String City) {
	
	driver.findElement(text_City).sendKeys(City);
}

public void enterState(String State) {
	
	driver.findElement(text_State).sendKeys(State);
}

public void enterZipCode(String ZipCode) {
	
	driver.findElement(text_ZipCode).sendKeys(ZipCode);
}

public void enterPhone(String Phone) {
	
	driver.findElement(text_Phone).sendKeys(Phone);
}

public void enterSSN(String SSN) {
	
	driver.findElement(text_SSN).sendKeys(SSN);
}

public void enterUsername(String Username) {
	
	driver.findElement(text_Username).sendKeys(Username);
}

public void enterPassword(String Password) {
	
	driver.findElement(text_Password).sendKeys(Password);
}

public void enterConfirm(String Confirm) {
	
	driver.findElement(text_Confirm).sendKeys(Confirm);
}

public void clickRegisterButton() {
	
	driver.findElement(btn_register).click();
}

}
