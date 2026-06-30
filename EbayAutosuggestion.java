package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement e1=driver.findElement(By.id("gh-ac"));
    e1.sendKeys("jersey");
    Thread.sleep(3000);
    List<WebElement>e2=driver.findElements(By.xpath("//li[@role='option']"));
   int count= e2.size();
   System.out.println(count);
   Thread.sleep(3000);
   e2.get(count-5).click();
    
	}

}
