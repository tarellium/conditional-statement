package webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Usps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
    //step 1 open web browser
		
		WebDriver driver = new FirefoxDriver();
	
	//step 2 enter "https://www.usps.com/"
		
		driver.get("https://www.usps.com/");
	//step 3 click on quick tools
	
		WebElement element1 = driver.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span"));element1.click();
	// step 4 click on find usps location
		WebElement element2 = driver.findElement(By.xpath(".//*[@id='shortcuts-menu']/div[1]/div[3]/div[3]/a/span")); element2.click();
	// step 5 enter zip code as 20878 and click on search after waiting 5 second
	
		Thread.sleep(5000); // this is in millisecond
		WebElement element3 = driver.findElement(By.xpath(".//*[@id='tCityStateZip']"));
		element3.sendKeys("20878");
		element3.submit();
	// zoom the page wait for 5 sec and close the browser
	
	// ask student how to zoom the page
		driver.close();
		
		//WebElement element=driver.findElement(By.xpath(".//*[@id='global-menu']/div/nav/ol/li[2]/a/span"));
	
	
	
	}
	

}
