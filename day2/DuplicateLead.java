package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[3]")).click();
		driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='emailAddress']")).sendKeys("subrajasubi@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);;
		String emailname = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]")).getText();
		System.out.println(emailname);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[1]")).click();
		Thread.sleep(2000);;
		String Dupe= driver.getTitle();
		if(Dupe.equals(Dupe))
		{
			System.out.println(Dupe);
		}
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		String dupname= driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		driver.close();
	}

}
