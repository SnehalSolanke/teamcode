package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Once after typing india, check if "India Country Cricket" is only coming if coming click on it?
public class Amazonclickonmentionedautosuggestion {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("http://www.amazon.in");
    driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
	e1.sendKeys("mobile");
	Thread.sleep(3000);
	List<WebElement> e2=driver.findElements(By.xpath("//div[@class='left-pane-results-container']/div"));
	for(int i=0;i<e2.size();i++)
	{
		WebElement e3=e2.get(i);
		 if (e3.getText().equals("mobile stand for desk")) 
		 {
	            e3.click();
	            break;
	}
	
	
	}

}
}