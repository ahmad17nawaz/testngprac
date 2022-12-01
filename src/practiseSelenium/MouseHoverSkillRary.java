package practiseSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverSkillRary {
	public static void main(String[] args) {
	WebDriver	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.get("https://www.skillrary.com/");
	WebElement gears = driver.findElement(By.xpath("//a[@class='ignorelink']"));
	Actions a = new Actions(driver);
	a.moveToElement(gears).perform();
	driver.findElement(By.xpath("(//a[@class='ignorelink'])[7]")).click();
	String title=driver.getTitle();
	System.out.println(title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	}

}
