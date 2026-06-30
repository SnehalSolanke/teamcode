package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchtagName {

	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement e1=driver.findElement(By.tagName("textarea"));
	e1.sendKeys("India");

	}

}
