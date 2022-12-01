package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0UserPass{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("12345");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
