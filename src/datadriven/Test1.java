package datadriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./Book1.xlsx"); //we used file input stream to specify the path
		//go to this location & load the data // through the EXception
		
		Workbook wb = WorkbookFactory.create(fis);
				// selenium go and take data from excel sheet
		//import Workbook and WorkbookFactory
		
		String url = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
   		String un = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
        String pwd =  wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
	
                     WebDriver driver = new ChromeDriver();
                     driver.manage().window().maximize();
                     driver.get(url);//reading data from property file
                     // url is the key
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
	}

}
