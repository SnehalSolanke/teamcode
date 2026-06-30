package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BSE {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.bseindia.com/indices/indexarchivedata");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//to select Index
	WebElement index=driver.findElement(By.xpath("//select[@id='ddlIndex']"));
	index.click();
	//to select dropdown
	Select s1=new Select(index);
	s1.selectByValue("SENSEX");
	Thread.sleep(2000);
	//to select period
	WebElement period=driver.findElement(By.xpath("//select[@id='Periodtype']"));
	period.click();
	//to select dropdown
	Select s2=new Select(period);
	s2.selectByValue("D");
	Thread.sleep(2000);
	//select calender
	WebElement from=driver.findElement(By.xpath("//i[@aria-label='Open calendar picker'][1]"));
	from.click();
	//select date
	WebElement date=driver.findElement(By.xpath("//div[@class='btn-light'][1]"));
	date.click();
	//select calender
	WebElement to=driver.findElement(By.xpath("(//i[@aria-label='Open calendar picker'])[2]"));
	to.click();
	//select date
	WebElement date1=driver.findElement(By.xpath("//button[text()=' Today ']"));
	date1.click();
	//select submit
	WebElement submit=driver.findElement(By.xpath("//input[@class='btn btn-submit2']"));
	submit.click();
	
	
	

	}

}
