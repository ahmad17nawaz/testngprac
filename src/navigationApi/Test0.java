package navigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	Thread.sleep(3000);
	driver.navigate().back(); //back
	Thread.sleep(3000);	
	driver.navigate().forward(); //forward
	Thread.sleep(3000);
	driver.navigate().refresh(); //refresh
	
	
}
}
