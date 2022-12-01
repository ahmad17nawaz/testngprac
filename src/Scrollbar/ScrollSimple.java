package Scrollbar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollSimple {

	public static void main(String[] args) {

		WebDriver	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://smallwebsite.us/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Contact Form']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();",ele);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
}