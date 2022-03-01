package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nyakaa {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	ChromeOptions option=new ChromeOptions();
	Actions Act=new Actions(driver);
	option.addArguments("--disable-notification--");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
	driver.get("https://www.nykaa.com");
	WebElement brand=driver.findElement(By.xpath("//ul[@class='HeaderNav css-f7ogli'][2]"));
     Act.moveToElement(brand).perform();
     driver.findElement(By.xpath("//div[@id='brandCont_Popular']//ul//li[5]")).click();
	  String title=driver.getTitle();
	  System.out.println(title);
	  WebElement sort = driver.findElement(By.xpath("//*[@class='sort-name']"));
	  Act.moveToElement(sort).click().perform();
	  driver.findElement(By.xpath("//*[text()='customer top rated']")).click();
	  driver.findElement(By.xpath("//*[text()='Category']")).click();
	  driver.findElement(By.xpath("//span[text()='Hair']")).click();
	  driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
	  driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
	  driver.findElement(By.xpath("//*[text()='Concern']")).click();
	  driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
	  String text = driver.findElement(By.xpath("//*[@class='css-rtde4j']")).getText();
	  System.out.println(text);
	  driver.findElement(By.xpath("//*[@class='css-10zjw4o']")).click();
	  //not working
	  
	  //driver.findElement(By.xpath("//*[text()='75ml']")).click();
	  driver.findElement(By.xpath("//*[@class='css-12x6n3h']")).getText();
	  driver.findElement(By.xpath("//*[text()='ADD TO BAG']")).click();
	  driver.findElement(By.xpath("//*[@class='cart-count']")).click();
	  driver.findElement(By.xpath("//*[@class='value medium-strong']")).getText();
	  driver.findElement(By.xpath("//*[@class='//*[@class='value medium-strong']")).click();
	  driver.findElement(By.xpath("//*[@class='btn full big']")).click();
	  
	  
	  
	  
	  
	 
	  

}
}
