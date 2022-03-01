package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selectable {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	Actions act=new Actions(driver);
	
	driver.switchTo().frame(0);
	WebElement ele1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement ele2 = driver.findElement(By.xpath("//li[text()='Item 5']"));
	
	act.clickAndHold(ele1).moveToElement(ele2).release().perform();
	
	Thread.sleep(5000);
	driver.close();
}
}
