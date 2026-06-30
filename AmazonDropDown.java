package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/select-menu");
	driver.manage().window().maximize();
	Thread.sleep(3000);
	WebElement dropdown=driver.findElement(By.id("oldSelectMenu"));
	dropdown.click();
	Select s=new Select(dropdown);
	s.selectByVisibleText("Yellow");
	//s.selectByIndex(3);
	//s.selectByValue("search-alias=amazon-devices");
	

	}

}
