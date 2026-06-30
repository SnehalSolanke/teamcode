package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutosuggestion1 {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
    WebElement e1= driver.findElement(By.id("APjFqb"));
    e1.sendKeys("India");
    Thread.sleep(3000);
    List<WebElement>e2=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
    int count= e2.size();
    System.out.println(count);
    Thread.sleep(3000);
    e2.get(count-1).click();
	}

}
