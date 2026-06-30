package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHoverover {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement e1=driver.findElement(By.xpath("//span[text()='Prime']"));
	e1.click();
	
			
	}

}
