package teestNG;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(teestNG.listner.class)
public class DifferentAnnotation2 {
	
	public static WebDriver driver ;;
	
 
	@Test(priority=1)
	public static void OpenBrowser()
	{
		
		//System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.demoqa.com");
		String expectedTitle="Free QA Automation Tools For Everyone";
		
	    String orignaltitle=driver.getTitle();
	    System.out.println(orignaltitle);
	    Assert.assertEquals(orignaltitle, expectedTitle,"Title should be as Expected");   
		 
	}
	
	@Test(priority=2)
	public static void BrowserClose()
	{
		driver.close();
		Reporter.log("Driver closed after testing");
	}
	
	static int i = 1;
	 
	 @Test (successPercentage = 60, invocationCount = 3,priority=3) //Failing Within Success
	 public static void AccountTest() {
	 if(i < 2)
	 Assert.assertEquals(i , i);
	 i++;
	 }
	
	 @Test(priority=1 ) // Skip Test
	 public static void SkipTest() {
	 throw new SkipException("Skipping The Test Method ");
	 }
	

	
}
