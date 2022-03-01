package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//*[@id='topic']/following-sibling::input")).sendKeys("ash");
	//driver.switchTo().defaultContent();
	//driver.switchTo().frame(0);
	driver.switchTo().frame("frame3");
	driver.findElement(By.id("a")).click();
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	driver.findElement(By.id("animals")).click();
	driver.findElement(By.xpath("//*[text()='Avatar']")).click();
	driver.switchTo().defaultContent();
	
}
}
