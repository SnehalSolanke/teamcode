package classwork;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {

	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver=new ChromeDriver();        
         driver.get("https://www.amazon.in");
         driver.manage().window().maximize();

         Thread.sleep(3000);
         WebElement searchTextBox=        driver.findElement(By.id("twotabsearchtextbox"));
         searchTextBox.sendKeys("shoes");
         WebElement searchingProduct=        driver.findElement(By.id("nav-search-submit-button"));
         searchingProduct.click();
         
         Thread.sleep(3000);

         List<WebElement> allProduct=        driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
         allProduct.get(0).click();
         Thread.sleep(3000);

         Set<String> pcid=driver.getWindowHandles();
         Iterator<String> pc=        pcid.iterator();
                 String parentid=                        pc.next();
                 String childid=                        pc.next();
         
         driver.switchTo().window(childid);
         Thread.sleep(3000);

         driver.findElement(By.id("add-to-cart-button")).click();

	}

}
