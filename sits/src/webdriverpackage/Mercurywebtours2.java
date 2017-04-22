package webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mercurywebtours2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//open fire fox web driver
		WebDriver driver = new FirefoxDriver();
	//launch http://newtours.demoaut.com/
		driver.get("http://newtours.demoaut.com/");
	// print the title of the page
         System.out.println(driver.getTitle());
	//click on register link
		driver.findElement(By.linkText("REGISTER")).click();
	//enter first name
		driver.findElement(By.name("firstName")).sendKeys("TARIKU");
	//enter last name
		driver.findElement(By.name("lastName")).sendKeys("GELAN");
	//enter phone
		driver.findElement(By.name("phone")).sendKeys("240 481 0879");	
	//enter email
		driver.findElement(By.id("userName")).sendKeys("tarejksdh@gmail.com");
	//enter Address
		driver.findElement(By.name("address1")).sendKeys("12007 swallow falls ct");
	//enter city
		driver.findElement(By.name("city")).sendKeys("silverspring");		
	//enter state province
		driver.findElement(By.name("state")).sendKeys("maryland");
	//enter postal code
		driver.findElement(By.name("postalCode")).sendKeys("56565");
    //Country
		driver.findElement(By.name("country")).sendKeys("united states");
	//enter Username
		driver.findElement(By.id("email")).sendKeys("taremail@gmail.com");
	//enter password
		driver.findElement(By.name("password")).sendKeys("tarpass@gmail.com");
	//confirm  password
	    driver.findElement(By.name("confirmPassword")).sendKeys("tarejksdh@gmail.com");
	//click on submit link
	   driver.findElement(By.name("register")).click();
	   driver.getPageSource().contains
			   ("Thank you for registering You may now sign-in using the "
			   		+ "user name and password you've just entered");
	// close the browser
	   driver.close();
	   
	   
	}

}
