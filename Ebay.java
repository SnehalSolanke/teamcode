package classwork;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.id("gh-ac"));
    e1.sendKeys("shoes"+Keys.ENTER);
    Thread.sleep(3000);
    WebElement e2=driver.findElement(By.xpath("(//ul[@class='srp-results srp-grid clearfix'])/li[1]"));
    e2.click();
    Set<String>pcid= driver.getWindowHandles();
    Iterator<String>pc= pcid.iterator();
    String parentid=pc.next();
    String childid=pc.next();
    driver.switchTo().window(childid);
   WebElement addtocart= driver.findElement(By.xpath("//span[text()='Add to cart']"));
   addtocart.click();
   Thread.sleep(3000);
   WebElement checkout= driver.findElement(By.xpath("//span[text()='Checkout 1 item']"));
   checkout.click();
   
    
	}

}
