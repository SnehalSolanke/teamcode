package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Launch Google and click on Gmail
public class Clickongmailbylink {

	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com");
	WebElement e1=driver.findElement(By.linkText("Gmail"));
	e1.click();

	}

}
