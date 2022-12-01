package synchronization;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Test0 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");

		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(10));

		WebElement user = driver.findElement(By.id("username"));
		w1.until(ExpectedConditions.visibilityOf(user)).sendKeys("admin");
WebElement user1 = driver.findElement(By.id("username"));
w1.until(ExpectedConditions.visibilityOf(user1)).sendKeys("admin");


		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
WebElement button = driver.findElement(By.xpath("//div[text()='Login ']"));
w1.until(ExpectedConditions.elementToBeClickable(button)).click();

		String title = driver.getTitle();
w1.until(ExpectedConditions.titleContains("actiTIME - Login"));		
		System.out.println(title);

		if(title.equals("actiTIME - Login")) {
			System.out.println("Pass:home page is dispalyed");
		}
		else
		{
			System.out.println("Fail:home page is not displayed");
		}
	}
}