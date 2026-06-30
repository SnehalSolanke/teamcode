package classwork;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMoveControlAddToCart {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("books");
	WebElement e2=driver.findElement(By.id("nav-search-submit-button"));
	e2.click();
	Thread.sleep(3000);
	WebElement e3=driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 puis-line-clamp-3-for-col-4-and-8 s-link-style a-text-normal'])[1]"));
    e3.click();
   Set<String>pcid= driver.getWindowHandles();
   Iterator<String>p=pcid.iterator();
   String parentid=p.next();
   String childid= p.next();
   Thread.sleep(3000);
   driver.switchTo().window(childid);
   driver.findElement(By.name("submit.addToCart")).click();
    
	}

}
