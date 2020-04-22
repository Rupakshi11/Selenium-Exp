package testCases;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.*;


public class directBrowserCall {
	@Test
	public static void browserPath() {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
}