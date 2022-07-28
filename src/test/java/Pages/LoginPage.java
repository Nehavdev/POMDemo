package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{
	
//	WebElement searchbox = driver.findElement(By.name(""));	
//	Pagefactory
	
	@FindBy(name="search")
	WebElement searchBox;
	
//	Pagefactory
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	

	
	

}
