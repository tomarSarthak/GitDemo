package teestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter {
	
	
	
	
	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Cedric",36 },
	   { "Anne", 37},
	 };
	}
	
	 
    // test method declares that its data should be supplied by the Data Provider
//named "test1"
	@Test(dataProvider = "test1")
	public void verifyData1(String n1, Integer n2) {
	 System.out.println(n1 + " " + n2);
	}
	
	
	@DataProvider(name="data")
	public Object[][] createdata()
	{
		
		return new Object[][] {{"username", "password"},{"rawan","sarthak"}};
		
	}
	
	
	@Test(dataProvider ="data")
	public void show(String val,String val2)
	{
		System.out.println( val2);
	}
	
}
