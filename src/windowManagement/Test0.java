package windowManagement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) throws InterruptedException {
	
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/");
	
		 
		 Thread.sleep(2000);
		 driver.manage().window().minimize();
		 
		 Thread.sleep(2000);
		 driver.manage().window().fullscreen();
		
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		
		// driver.close();
		 
		 if (title.equals("Facebook – log in or sign up")) {
			System.out.println("PASS : Homepage is displayed");
		}
		 else {
			System.out.println("FAILED : Homepage not displayed");
		}
		 
			

	}

}
