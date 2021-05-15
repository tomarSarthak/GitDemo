package teestNG;

import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent {
	
	
	
	@Test
	public void openBrowser()
	{
		ExtentSparkReporter html=new ExtentSparkReporter("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
