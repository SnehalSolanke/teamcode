package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartSearch {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://www.google.com");
	WebElement search=driver.findElement(By.id("APjFqb"));
	search.sendKeys("India"+Keys.ENTER);
	
	
	
	
	}

}
