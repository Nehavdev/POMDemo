package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	
//	WebElement searchbox = driver.findElement(By.name(""));	
//	Pagefactory
	
	@FindBy(name="search")
	WebElement searchBox;
	
//	Pagefactory
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchProduct(String strProd) {
		searchBox.sendKeys(strProd);
		searchBox.submit();		
	}
	
	
	public String getHomePageTitle() {
		return driver.getTitle();		
	}
	
//	new method to click on login
	

}
