package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchName {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	Thread.sleep(3000);
	WebElement e1=driver.findElement(By.name("q"));
	e1.sendKeys("India");
	
	
	

	}

}
