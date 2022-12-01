package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbCordinatesOfTextboxElement {

	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
			WebElement tbe = driver.findElement(By.id("email"));
			Point loc = tbe.getLocation();
			int x = loc.getX();
			System.out.println("x-coordinates" + x);
			int y = loc.getY();
			System.out.println("y-coordinates" + y);
			driver.close();
			
			
	}

}
