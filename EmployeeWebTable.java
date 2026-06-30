 package classwork;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeeWebTable {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Lenovo/Downloads/employee.html");
	
	//1. WAP to calculate how many rows are present?
	List<WebElement>rows=driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr"));
	int count=rows.size();
	System.out.println("Total no. of rows is: "+count);
	
	//2. WAP to calculate how many Columns are present?
	List<WebElement>columns=driver.findElements(By.xpath("//table[@id='employeeTable']/thead/descendant::th"));
	int count1=columns.size();

	System.out.println("Total no. of column is: "+count1);
	
	//3.WAP TO fetch all the column names and print it?
	List<WebElement>columns1=driver.findElements(By.xpath("//table[@id='employeeTable']/thead/descendant::th"));
	for(int i=0;i<=2;i++)
	{
		WebElement e1=columns1.get(i);
		String columnName=e1.getText();
		System.out.println(columnName);
	}
	
	//4.WAP to calculate how many employees have name ram?
   List <WebElement> name=driver.findElements(By.xpath("//table[@id='employeeTable']//td[text()='Ram']"));
   int count2=name.size();
   System.out.println("the no. of employee having name Ram is: "+count2);
   
   //5.WAP to calculate how many employees have the salary as 80k?	
   List<WebElement>empname=driver.findElements(By.xpath("(//td[text()='80000']/preceding-sibling::td)[1]"));
   WebElement e1=empname.get(0);
   String s1=e1.getText();
   System.out.println(s1);
   
   //6.WAP to find out only those salary that are greater then 70k?
   List<WebElement>empname1=driver.findElements(By.xpath("(//table[@id='employeeTable']/descendant::tbody)/tr/td[3]"));
   for(int i=0;i<=3;i++)
   {
	   int salary = 0;
	   if(salary>70000)
	   {
         System.out.println(empname1);
    
	   }
    
	}
   //7.WAP to calculate how many employees are working  as QA?
   List<WebElement>emp=driver.findElements(By.xpath("//td[text()='QA']"));
   int count3= emp.size();
   System.out.println("Count of QA: "+count3);
   
   //8.WAP to find out Neha's Department
   List<WebElement>dept=driver.findElements(By.xpath("//td[text()='Neha']/following-sibling::td"));
  WebElement e2=dept.get(0);
  String d1=e2.getText();
  System.out.println(d1);
  
  //9.WAP to fetch all names
  List<WebElement>allname=driver.findElements(By.xpath("//table[@id='employeeTable']/tbody/tr/td[1]"));
  for(int i=0;i<3;i++)
  {
	  WebElement e3=allname.get(i);
	  String s2=e3.getText();
	  System.out.println(s2);
  }
  
   
   
	}
}
