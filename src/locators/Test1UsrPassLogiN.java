package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1UsrPassLogiN {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			
			Thread.sleep(2000);
			driver.findElement(By.name("email")).sendKeys("7209167074");
			
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).sendKeys("ahmad71722");
			
			Thread.sleep(2000);
			driver.findElement(By.name("login")).click();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());

	}

}
