package classwork;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipcartAddtocart {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement e1=driver.findElement(By.xpath("//span[text()='✕']"));
	e1.click();
	Thread.sleep(3000);
	WebElement e2=driver.findElement(By.name("q"));
	e2.sendKeys("shoes"+Keys.ENTER);
	Thread.sleep(3000);
    WebElement e3=driver.findElement(By.xpath("(//img[@class='MZeksS'])[1]"));
    e3.click();
    Set<String>pcid= driver.getWindowHandles();
    Iterator<String>pc=pcid.iterator();
    String Parentid=pc.next();
    String childid=pc.next();
    Thread.sleep(3000);
    driver.switchTo().window(childid);
    driver.findElement(By.xpath("//div[text()='Add to cart']")).click();
	

	}

}
