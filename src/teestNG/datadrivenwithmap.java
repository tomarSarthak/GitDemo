package teestNG;

import java.awt.geom.RectangularShape;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datadrivenwithmap {
	
	 @Test(priority = -1)
	    public void signIn() {
	        System.out.println("Signing In");
	    }
	
	@Test(priority = 0)
    public void OpenBrowser() {
        System.out.println("Opening The Browser");
    }
 
    @Test(dependsOnMethods = { "signIn", "OpenBrowser" })
    public void LogOut() {
        System.out.println("Logging Out");
    }
    
   
	
	
	
}
