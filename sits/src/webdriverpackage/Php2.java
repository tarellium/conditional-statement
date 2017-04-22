package webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Php2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*(I) : Web driver Home work:
	    1. http://www.phptravels.net/
		2. Click on My Account (By Xpath)
		3. Signup link (By Xpath)
		4. Enter First name, Last name, Mobile number, Email, Password and Confirm password
		5. Click on Signup button
		6. Click on Signout Button */
		
		
		
			
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.phptravels.net/");
	
	WebElement element = driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/a"));
	element.click();
	
	
    WebElement element1 = driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a"));
	
	element1.click();
	
	driver.findElement(By.name("firstname")).sendKeys("george");
	
	driver.findElement(By.name("lastname")).sendKeys("benson");
	
	driver.findElement(By.xpath(".//*[@id='headersignupform']/div[5]/input")).sendKeys("4564512121");
	
	// register 10 account with George1234@gmail.com
	int x=1;
	{ 
	
		driver.findElement(By.xpath(".//*[@id='headersignupform']/div[6]/input")).sendKeys("George1234"+x+"@gmail.com");
	}
	
	driver.findElement(By.xpath(".//*[@id='headersignupform']/div[7]/input")).sendKeys("George1234");
	//enter password
	driver.findElement(By.xpath(".//*[@id='headersignupform']/div[8]/input")).sendKeys("George1234");
	// confirm pass word
	driver.findElement(By.xpath(".//*[@id='headersignupform']/div[9]/button")).click();
	
	// sighn up 
	
	driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
	
    //driver.findElement(By.xpath("html/body/div[2]/div/div/div[2]/ul[2]/li[2]/ul/li[2]/a")).click();
	
	
	
	//driver.findElement(By.name("firstname")).sendKeys("george");*/

	
	
	/*WebElement element3 = driver.findElement(By.xpath("My Account "));
	element3.click();

	WebElement element4 = driver.findElement(By.xpath("My Account "));
	element4.click();*/
	Thread.sleep(5000);
	
	driver.close();


	}

}
