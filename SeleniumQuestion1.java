package classwork;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumQuestion1 {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	//WebElement e1=driver.findElement(By.id("gh-ac-wrap"));
	WebElement e1=driver.findElement(By.name("_sacat"));
	Select s=new Select(e1);
	s.selectByValue("267");
	WebElement e2=driver.findElement(By.xpath("//span[text()='Search']"));
	e2.click();
	Thread.sleep(5000);
	WebElement e3=driver.findElement(By.xpath("(//img[@role='presentation'])[1]"));
	e3.click();
	Thread.sleep(5000);
	WebElement e4=driver.findElement(By.xpath("//div[@id='s0-1-0-17-8-65[3]-24[11]-0-1-3-0-4-1[0]-7-2-container']"));
	e4.click();
	Thread.sleep(5000);
	Set<String>pcid=driver.getWindowHandles();
	Iterator <String>pc=pcid.iterator();
	String parentid=pc.next();
	String childid=pc.next();
	Thread.sleep(3000);
	driver.switchTo().window(childid);
	WebElement e5=driver.findElement(By.xpath("//span[text()='Add to cart']"));
	e5.click();
	Thread.sleep(3000);
	WebElement e6=driver.findElement(By.xpath("//span[text()='Checkout 1 item']"));
	e6.click();

	}

}
