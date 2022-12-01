package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidthOfFbButton {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement btn = driver.findElement(By.name("login"));
		Dimension size = btn.getSize();
		int h = size.getHeight();
		System.out.println("the height of login button : "+h);
		int w = size.getWidth();
		System.out.println("the width of login button :"+w);
		
		String attr = btn.getAttribute("type");
		System.out.println("the attribute is: "+attr);
		driver.close();
	}

}
