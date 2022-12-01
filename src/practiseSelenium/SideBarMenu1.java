

	package practiseSelenium;

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class SideBarMenu1 {

		public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

  driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
  
   List<WebElement> ele = driver.findElements(By.id("hmenu-content"));
				System.out.println(ele.size());
				for(WebElement b:ele){
	System.out.println(b.getText());
		}
		}
	}

		
	