package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assign04 {

	WebDriver driver= null;
	@Test
	public void ebay() {

	System.setProperty("webdriver.chrome.driver",
			"D:\\Softwares\\Executables\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
	String eBay= "https://in.ebay.com/";
	driver.get(eBay);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Apple watches");
	Select category= new Select (driver.findElement(By.id("gh-cat")));
	category.selectByValue("281");
	driver.findElement(By.id("gh-btn")).click();
	
	List<WebElement> results= driver.findElements(By.id("srp-river-results"));
	System.out.println("Total: " +results.size());
		
		/*
		 * for(WebElement result:results) {
		 * System.out.println("Apple watches Results: "+ result.getAttribute("href"));
		 * 
		 * }
		 * 
		 * List<WebElement> li =
		 * driver.findElements(By.id("srp-river-results-listing59"));
		 * System.out.println(li.containsAll(li));
		 */
	}
	
}
