package teestNG;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class stream {
	
	
	@Test
	public void getstream()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/cart");
	    List<WebElement> ls =	driver.findElements(By.xpath("//tbody/tr/td[2]"));
	    System.out.println(ls);
	}

}
