package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
		//driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("555");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7890654231");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String firstleadid=driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).getText();
		System.out.println(firstleadid);
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[1]")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstleadid);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String nolead=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(nolead);
	}

}
