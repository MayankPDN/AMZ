package Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Working {
	static WebDriver driver;
	
	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium testing related\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.ca/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Body Shaver");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(By.id("a-autoid-0-announce")).click();
		Select select = new Select(driver.findElement(By.id("a-autoid-0-announce")));
		
		select.selectByVisibleText("Newest Arrivals");	
	}

}
