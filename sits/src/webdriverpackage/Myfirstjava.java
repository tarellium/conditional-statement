package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Myfirstjava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		/*System.out.println("hello to java");
		
int number ;   // declaring the varible
number= 122;   // assigning
System.out.println("the number is =" +number);
//System.out.println() uses to print any information
System.out.println(number);
// double num2;
//num2= 150.2;
//ystem.out.println("the num2 is = $ "+num2)*/
		
	 //HOW TO VERIFY TITLE OF THE PAGE
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		System.out.println(driver.getTitle());
		
		if (driver.getTitle().contentEquals ("Welcome: MercuryTours"))
		{
            System.out.println("Test Passed!");
            
		}
		else{System.out.println("Test failed");
		}
	
		Thread.sleep(5000);
driver.close();

System.exit(0);




	}

}
