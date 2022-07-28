package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.SearchResultPage;
import base.TestBase;

public class PlaceOrderTest extends TestBase{
	HomePage homePage;
	
	SearchResultPage resultPage;
	
	public void setup() {
		initialize();
	}
	

	@Test
	public void searchItemTest() {
		homePage = new HomePage();
		homePage.searchProduct("Apple");
		String strTitle= homePage.getHomePageTitle();
		Assert.assertEquals(strTitle, "Search - Apple");
		
	}
	
	
	@Test
	public void addItemtoCartTest() {
		homePage = new HomePage();
		resultPage = new SearchResultPage();
		homePage.searchProduct("Apple");
		String strTitle= homePage.getHomePageTitle();
		Assert.assertEquals(strTitle, "Search - Apple");
		resultPage.addToCartTest();
		
	}
}
