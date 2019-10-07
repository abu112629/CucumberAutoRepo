package Example;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {		
    private WebDriver driver;	
    
    
    //@BeforeClass
    //public static void setUpClass(){
    	
    	
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.operadriver().setup();
		//WebDriverManager.phantomjs().setup();
		//WebDriverManager.edgedriver().setup();
    	
    //}
	@Test				
	public void testEasy() {	
		
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.iedriver().setup();
	    driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}	

