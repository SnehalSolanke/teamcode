package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleClick {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Lenovo/Downloads/learningHTML1.html");
	WebElement e1=driver.findElement(By.name("username"));
	e1.sendKeys("snehal");
	e1.sendKeys(Keys.CONTROL+"A");
	e1.sendKeys(Keys.CONTROL+"C");
	
	WebElement e2=driver.findElement(By.name("fname"));
	e2.sendKeys(Keys.CONTROL+"V");

	}

}
