package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// To handle hoverover Element
public class AmazonfreshHoverover {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement e1=driver.findElement(By.xpath("//span[text()='Prime']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(e1).perform();
	Thread.sleep(3000);
	WebElement e2=driver.findElement(By.xpath("//span[@class='a-button a-button-primary']"));
	e2.click();

	}

}
