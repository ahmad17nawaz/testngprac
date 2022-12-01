package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethodPractise {

	public static void main(String[] args) {


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement logo = driver.findElement(By.xpath("//div[@class='atLogoImg']"));
System.out.println(logo.isDisplayed());
		if(logo.isDisplayed()) {
			System.out.println("Pass:Logo Displayed");
		}
		else
		{
			System.out.println("Fail:Logo is not displayed");
		}
		//driver.quit();
	}
}
