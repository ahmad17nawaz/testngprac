package navigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");//navigate to other website
		
		
		Thread.sleep(3000);
		driver.navigate().back();//backward the page
		
		Thread.sleep(3000);
		driver.navigate().forward();//forward  the page
		
		
		Thread.sleep(3000);
		driver.navigate().refresh();//refresh the page 
		
		driver.quit(); 
		//close the page
		
	}

}
