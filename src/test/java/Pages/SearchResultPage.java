package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class SearchResultPage extends TestBase{
	
	

		
		@FindBy(xpath="(//div[@class='product-thumb'])[1]")
		WebElement item;
		
		@FindBy(xpath="(//div[@title='Add to Cart'])[1]")
		WebElement addToCartBtn;
		
		
		public SearchResultPage() {
			PageFactory.initElements(driver, this);
		}
		
	
		
		public void addToCartTest() {
			Actions action= new Actions(driver);			
//			action.moveToElement(item).perform();
			action.moveToElement(item).click(addToCartBtn).perform();	
				
		}
		
}




