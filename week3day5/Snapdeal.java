package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		ChromeOptions option=new ChromeOptions();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		option.addArguments("--disable-notification--");
		driver.get("https://www.snapdeal.com/");

		Actions act = new Actions(driver);

		WebElement ele = driver.findElement(By.linkText("Men's Fashion"));
		act.moveToElement(ele).perform();

		driver.findElement(By.linkText("Sports Shoes")).click();
		String shoe_count = driver.findElement(By.xpath("//div[@class='sub-cat-count ']")).getText();
		System.out.println("Shoe Count : " + shoe_count);

		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
		driver.findElement(By.className("sort-selected")).click();
		
		driver.findElement(By.xpath("//*[@class='sort-value']/li[2]")).click();
		WebElement from1 = driver.findElement(By.xpath("//*[@name='fromVal']"));
		from1.clear();
		from1.sendKeys("900");
		WebElement to1 = driver.findElement(By.xpath("//*[@name='toVal']"));
		to1.clear();
		to1.sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='filter-inner']/div[5]")).click();
		driver.findElement(By.xpath("//a[text()=' Navy']/..")).click();
		List<WebElement> filter = driver.findElements(By.xpath("//div[@class='filters']"));
	

		// driver.findElement(By.xpath("//ul[@class='sort-value']")).click();

	}

}
