package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase() {	
		prop= new Properties();
		String strPath = System.getProperty("user.dir")+ "//src//test//resources//configFiles//config.properties";
		FileInputStream fin;		
		try {
			fin = new FileInputStream (strPath);
			prop.load(fin);		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();			 
		}
	}
	
	
	public static void initialize() {
		String steBrowser = prop.getProperty("browser");
		if(steBrowser.equalsIgnoreCase("chrome")){		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (steBrowser.equalsIgnoreCase("edge")){		
			WebDriverManager.chromedriver().setup();
			driver = new EdgeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
//		driver.findElement(By.id("username")).sendKeys();
//		driver.findElement(By.id("password")).sendKeys();
//		driver.findElement(By.className("radius")).click();	
		
		
	}

}
