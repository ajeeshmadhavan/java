package javaselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable notificatons");
	ChromeDriver driver=new ChromeDriver();
	Actions builder=new Actions(driver);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://www.snapdeal.com/");
	WebElement fashion = driver.findElement(By.xpath("//*[@class='catText'][1]"));
	builder.moveToElement(fashion).perform();
	driver.findElement(By.xpath("//*[text()='Sports Shoes']")).click();
	String count = driver.findElement(By.xpath("//*[@class='category-name category-count']")).getText();
	System.out.println(count);
	
}
}
