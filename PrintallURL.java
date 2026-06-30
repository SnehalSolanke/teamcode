package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintallURL {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().window().maximize();
	List<WebElement>l1=driver.findElements(By.tagName("a"));
    for(int i=0;i<l1.size();i++)
    {
    	   WebElement e2=l1.get(i);
    	   String text=e2.getText();
    	   String URL=e2.getDomAttribute("href");
    	   System.out.println(URL);
    	   System.out.println(text);
    }
	}

}
