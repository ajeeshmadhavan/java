package javaselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumd1 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("rahman.pvt.ltd");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("ajeesh");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
	driver.findElement(By.name("dataSourceId")).sendKeys("d");
	driver.findElement(By.name("submitButton")).click();
	driver.findElement(By.id("ext-gen593")).click();
	
	
}
}
