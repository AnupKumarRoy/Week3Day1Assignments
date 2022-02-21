package Week2Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		    driver.findElement(By.id("password")).sendKeys("crmsfa");
		    driver.findElement(By.className("decorativeSubmit")).click();
		    driver.findElement(By.linkText("CRM/SFA")).click();
		    driver.findElement(By.linkText("Leads")).click();
		   //  to find window
		    driver.findElement(By.linkText("Create Lead")).click();
		   // for phone open
		 
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTING");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kumar");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Roy");
			driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("4/4/1997");
		
			driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
			driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kumarroy@gmail.com");
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			driver.findElement(By.linkText("Find Leads")).click();
		    driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.name("phoneAreaCode")).sendKeys("91");
			driver.findElement(By.name("phoneNumber")).sendKeys("9876543210");
            driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
            Thread.sleep(5000);
            driver.findElement(By.linkText("13849")).click();
            driver.findElement(By.linkText("Delete")).click();
            driver.findElement(By.linkText("Find Leads")).click(); 
            driver.findElement(By.name("id")).sendKeys("13849");
            driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
            driver.close();           
				
            
            
            
	}

}
