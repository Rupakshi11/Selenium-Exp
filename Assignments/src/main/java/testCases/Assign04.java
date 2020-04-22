package testCases;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign04 {

	WebDriver driver= null;
	@Test
	public void ebay() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();

	String eBay= "https://in.ebay.com/";
	driver.get(eBay);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("Apple watches");
	Select category= new Select (driver.findElement(By.id("gh-cat")));
	category.selectByValue("281");
	driver.findElement(By.id("gh-btn")).click();
	System.out.println("oming in");
//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	//tagName[@attribute='value'][@attribute='value'][@attribute='value']
	
	List<WebElement> results= driver.findElements(By.linkText("href"));
	System.out.println(results.size());
	int i =0;
	while(results.iterator().hasNext()) {
		if(i > results.size()) {
			System.out.println("Killiing infinte loop");
			return;
		}
		System.out.println(i + "="+results.get(i).getText());
		i++;
		
	}
	System.out.println(results.toString());
/*	List<WebElement> results= driver.findElements(By.className("sresult"));
	System.out.println("Total: " +results.size());
		
		
		  for(WebElement result:results) {
		  System.out.println("Apple watches Results: "+ result.getAttribute("href"));
		  
		  }
		  
		  List<WebElement> li =
		  driver.findElements(By.id("srp-river-results-listing59"));
		  System.out.println(li.containsAll(li));
		 
	}*/
	}
}
