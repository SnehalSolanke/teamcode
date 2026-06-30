package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazoncustomerservicepartiallink {
// Launch Amazon & click on Customer Service by using Partial Link
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	Thread.sleep(3000);
	WebElement e1=driver.findElement(By.partialLinkText("Service"));
	e1.click();

	}

}
