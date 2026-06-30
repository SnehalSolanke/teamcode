package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tata1mgcountAndText {
//tata1mg_Homescreen_Allcount & text

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.1mg.com/");
	driver.manage().window().maximize();
	Thread.sleep(8000);
	//click on cross icon on popup
    WebElement e1=driver.findElement(By.xpath("//div[@class='mX-20 mY-16 flex justifyBetween']/div[@class='flex alignCenter ']/button"));
    e1.click();
   /// count of all elements & text
    List<WebElement> search=driver.findElements(By.tagName("a"));
    for(int i=0;i<search.size();i++)
    {
    	WebElement e2=search.get(i);
    	String s1=e2.getText();
    	System.out.println(s1);   	
    }
   int count= search.size();
   System.out.println(count);
   //count of Evion Tablets
		   List<WebElement>e2=driver.findElements(By.xpath("//div[@class='flexColumn VerticalProductTile__container__etaGT']"));
		   int count1=e2.size();
		   System.out.println("Count of Evion:"+count1);
   
   
	}

}
//(//div[@class='Dialog__vsatStickyTop__YTxF_']/descendant::div/div)[2]/child::*/child::*
//html/body/div[1]/main/div/div[1]/div/div[1]/div/div[2]/button