package Interview;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DATA {

	
	public static void main (String[]args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","path");
		 driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().window().maximize();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
}
