package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BSEBajajFinance {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.bseindia.com/markets/equity/equitysensexstream");
    driver.manage().window().maximize();
    Thread.sleep(2000);
   WebElement e1=driver.findElement(By.xpath("((//tbody/tr[5]/td/child::*/child::*)/ancestor::tr)[2]/td[@class='td-text-center'][1]"));
   // WebElement e2=e1.get(1);
    String s1=e1.getText();
    System.out.println(s1);
	}
	//(((//table[@class='table-bordered table noticecontent']/descendant::tbody/tr)[5]/td)[2]/child::*)/parent::td/preceding-sibling::td
}




