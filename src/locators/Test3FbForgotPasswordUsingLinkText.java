package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3FbForgotPasswordUsingLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("identify_email")).sendKeys("7209167074");
		
		Thread.sleep(3000);
		driver.findElement(By.id("did_submit")).click();
		
				driver.close();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
