package webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklogin {

	private static Class<? extends WebDriver> actualtitle;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new FirefoxDriver();
driver.get("https://fly4.emirates.com");
	/*driver.findElement(By.name("email")).sendKeys("tarellium2@yahoo.com");
	driver.findElement(By.id("pass")).sendKeys("*********");
	driver.findElement(By.id("u_0_q")).click();
	Thread.sleep(5000);
	
	actualtitle = driver.getClass();
			driver.close();*/
	}
	

}
