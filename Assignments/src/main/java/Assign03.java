//import java.util.List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assign03 {
WebDriver driver= null;

@Test
public void Flipkart() {
	System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares\\Executables\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	
	String URL= "https://www.flipkart.com/";
	driver.get(URL);
	 
	List<WebElement> links= driver.findElements(By.tagName("a"));
			//driver.findElements(By.tagName("a"));
	System.out.println("Total Links are: " + links.size());
	//Links.getAttribute(name)
		/*
		 * for (WebElement link : links) { System.out.println(link.getText() +
		 * "URL is---" +link.getAttribute("href")); }
		 */
}
}
