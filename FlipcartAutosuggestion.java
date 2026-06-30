package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	WebElement e1=driver.findElement(By.xpath("//span[text()='✕']"));
	e1.click();
	Thread.sleep(3000);
	
	WebElement e2=driver.findElement(By.name("q"));
	e2.sendKeys("toys");
	Thread.sleep(3000);
	List<WebElement>e3=driver.findElements(By.xpath("//ul/li"));
	
	int count=e3.size();
	Thread.sleep(3000);
	System.out.println(count);
	e3.get(count-1).click();

	}

}
