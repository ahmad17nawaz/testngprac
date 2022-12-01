package practiseSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {
	
	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	WebElement el = driver.findElement(By.xpath("//h2[@class='_8eso']/../h2"));
	System.out.println(el.getText());
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7209167074");
	driver.findElement(By.id("pass")).sendKeys("ahmad71722");
	driver.findElement(By.name("login")).click();
	driver.findElement(By.id("jsc_c_2p")).click();
	driver.findElement(By.name("Log Out")).click();
	String title1 = driver.getTitle();
	System.out.println(title1);
	System.out.println("logged out successfully");
	driver.close();
}
}
