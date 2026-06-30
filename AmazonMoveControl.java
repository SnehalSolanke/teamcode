package classwork;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonMoveControl {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	searchbox.sendKeys("Indoor Plants"+Keys.ENTER);
	WebElement plant=driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small puis-padding-left-small puis-padding-right-small']/div/child::a/h2/span)[1]"));
	plant.click();
	Set<String>pcid=driver.getWindowHandles();
	Iterator<String>p=pcid.iterator();
	String parentid=p.next();
	String childid=p.next();
	driver.switchTo().window(childid);
	driver.findElement(By.name("submit.addToCart")).click();
	
	//*[@id="submit.add-to-cart-announce"]
	
	}

}
