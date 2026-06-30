package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutosuggestion {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement e1=driver.findElement(By.name("q"));
	e1.sendKeys("modi");
	Thread.sleep(3000);
	//ul[@role='listbox']/li
    List<WebElement>e2=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
    int Count=e2.size();
    System.out.println(Count);
    Thread.sleep(3000);
    
    e2.get(Count-1).click();
    
	}

}
