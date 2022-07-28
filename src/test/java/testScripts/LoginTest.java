package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.HomePage;
import base.TestBase;

public class LoginTest extends TestBase{
	HomePage homePage;
	
	public void setup() {
		initialize();
	}
	


@Test
public void searchItemTest() {
	homePage = new HomePage();
	homePage.searchProduct("Apple");
	String strTitle= homePage.getHomePageTitle();
	Assert.assertEquals(strTitle, "Search - Apple");
	System.out.println("Test1");
	
}

}
