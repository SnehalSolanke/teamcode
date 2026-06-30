package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// ClearTrip Oneway Ticket

public class ClearTripOneWayTicket {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.cleartrip.com/");
	driver.manage().window().maximize();
	//WebElement crossicon=driver.findElement(By.xpath("(//div[@data-testid='loginPopup']/div/div)[2]/child::*/child::*"));)
	WebElement closeicon=driver.findElement(By.xpath("(//div[@data-testid='loginPopup']/div/div)[2]/child::*/child::*"));
	closeicon.click();
	//xpath for -> icon: (//div[@class='DayPicker-wrapper']/div/div)[2]/child::*//child::*
	WebElement wherefrom=driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
	wherefrom.click();
	WebElement dropdownselection=driver.findElement(By.xpath("(//div[@class='dropdown']/ul)[1]"));
	dropdownselection.click();
	Thread.sleep(2000);
	WebElement whereto=driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
	whereto.click();
	WebElement dropdownselection1= driver.findElement(By.xpath("(//div[@class='dropdown']/ul)[2]"));
	dropdownselection1.click();
	WebElement calender=driver.findElement(By.xpath("(//div[@data-testid='dateSelectOnward']/div)/child::*"));
	calender.click();
	WebElement rightarrowclick=driver.findElement(By.xpath("((//div[@class='DayPicker-wrapper']/div)[1]/div)[2]/child::*"));
	rightarrowclick.click();
    WebElement date=driver.findElement(By.xpath("(//div[@class='Day-grid flex flex-middle flex-column flex-top'])[10]"));
    date.click();
	}

}
