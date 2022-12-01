import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Step 1: Launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.planetsuperheroes.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Step 2: Mouse hover on Profile and click on login/signup button
		WebElement profile = driver.findElement(By.xpath("(//img[@class='d-inline mx-auto'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(profile).perform();
    	 WebElement loginbutton = driver.findElement(By.xpath("//button[text()='LOGIN/SIGNUP']"));
		 loginbutton.click();
		
		 //CONFIRMATION ON LOGIN PAGE DISPLAY
		String loginheader = driver.findElement(By.xpath("//h1[text()='Welcome']")).getText();
		
		if(loginheader.equalsIgnoreCase("Welcome"))
		{
			System.out.println("login page display successfully");
		}
		else 
		{
			System.out.println("login page not open");
		}
		
		//STEP 3:Entering mobile no and click on continue
		driver.findElement(By.name("username")).sendKeys("7209167074");//Entering phone number
		driver.findElement(By.xpath("//div[text()='Continue']")).click();//Clicking on continue button
		
		//We can't automate this OTP function using selenium because everytime its generating new OTP
		
		driver.findElement(By.xpath("//div[text()='Enter OTP']"));//entering OTP
		
		
		//CONFIRMATION ON Successfully OTP generation
		String otpheader = driver.findElement(By.xpath("//div[text()='Enter OTP']")).getText();
		
		if(otpheader.equalsIgnoreCase("Enter OTP"))
		{
			System.out.println("OTP Sended successfully");
		}
		else 
		{
			System.out.println("OTP Not Sended");
		}
		
		
		driver.findElement(By.xpath("//div[text()='Continue']")).click();//clicking on continue button
		driver.close();
	}
}
