package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demoSalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Pavithra");
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Shanmugam");
		driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("dpartname");
		driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Contact Description");
		driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("pavithra@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select ste=new Select(state);
		ste.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButton']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Updating info");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title1= driver.getTitle();
		System.out.println(title1);
		driver.close();
	}

}
