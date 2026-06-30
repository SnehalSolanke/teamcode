package classwork;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoveControltootherWindow_Naukri {

	public static void main(String[] args) throws InterruptedException {
		  ChromeDriver driver=new ChromeDriver();        
          driver.get("https://www.naukri.com/registration/createAccount?");
          driver.manage().window().maximize();
          Thread.sleep(2000);
         WebElement e1= driver.findElement(By.xpath("//span[text()='Google']"));
         e1.click();
         
        Set<String> pcid=driver.getWindowHandles();
        System.out.println(pcid);
        
       Iterator<String>p =pcid.iterator();
       String pid=p.next();
       String cid=p.next();
       driver.switchTo().window(cid);
       //driver.close();
        
          
 

	}

}
