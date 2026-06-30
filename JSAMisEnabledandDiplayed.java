package classwork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAMisEnabledandDiplayed {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
    driver.get("C:\\Users\\Lenovo\\Downloads\\learningHTML1.html");
    WebElement e1=driver.findElement(By.id("1"));
    if(e1.isDisplayed() && e1.isEnabled())
    {
    	   e1.sendKeys("snehal");
    }
    else
    {
    	  System.out.println("cant perform action");
    }
    WebElement e2=driver.findElement(By.id("121"));
    if(e2.isDisplayed() && e2.isEnabled())
    {
    	  e2.sendKeys("Solanke");
    }
    else
    {
    	System.out.println("cant perform action");
    }
   WebElement beby= driver.findElement(By.id("321"));
   if(beby.isSelected())
   {
	   System.out.println("selected");
   }
   else
   {
	   beby.click();
   }
	}

}
