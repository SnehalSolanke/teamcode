package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAMTagName {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	Thread.sleep(3000);
	driver.get("C:\\Users\\Lenovo\\Downloads\\learningHTML1.html");
	WebElement e1=driver.findElement(By.tagName("a"));
	e1.click();

	}

}
