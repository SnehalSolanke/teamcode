package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GrowappBankList {
// List down every company who are in the sector of Banks
	
	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://groww.in/indices/sp-bse-sensex");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("//section[@class='indexCompanies_sectionWrapper__zUKzr']"));
	WebElement sector=driver.findElement(By.xpath("//th[text()='Sector']"));
	List<WebElement> bank=driver.findElements(By.xpath("(//table[@class='tb10Table borderPrimary']/descendant::tbody/tr)/td[text()='Banks']/preceding-sibling::td/a"));
	
	for(int i=0;i<bank.size();i++)
	{
		
		WebElement e2=bank.get(i);
		String url=e2.getDomAttribute("href");
   	    System.out.println(url);
		//String bankNames=e2.getText();
		//System.out.println("bankNames");
	}
	int count=bank.size();
	System.out.println(count);
	}
	}

