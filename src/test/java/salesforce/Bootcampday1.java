package salesforce;

	
	import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.remote.RemoteWebDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Bootcampday1 {
				
				public static RemoteWebDriver driver;
				
				public static void main(String[] args) {
				
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);
				
				driver.get("https://login.salesforce.com");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("harikrishnan@qeagle.com");
				driver.findElement(By.id("password")).sendKeys("Leaf@1234");
				driver.findElement(By.id("Login")).click();
				Thread.sleep(7000);
				
				driver.executeScript("arguments[0].click();", <clicking-webelement>);
				driver.findElement(By.xpath("slds-r5")).click();
				driver.findElement(By.xpath(""));
				driver.findElement(By.xpath(""));
				
				
				
				
				
				
				}
			

		}



