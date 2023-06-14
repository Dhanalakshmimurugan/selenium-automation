package week8.day1;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class LanuchNykaa {
public static void main(String[] args) throws InterruptedException {
	//EdgeOptions options = new EdgeOptions();
	//options.addArguments("start-maximize");
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.nykaa.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//a[text()='brands']")).click();
	WebElement ele = driver.findElement(By.xpath("//a[text()='brands']"));
	WebElement ele2=driver.findElement(By.xpath("//a[text()='Luxe']"));
	Actions get = new Actions(driver);
	get.pause(60).moveToElement(ele).perform();
	get.pause(60).moveToElement(ele2).perform();
	driver.findElement(By.xpath("//a[text()='Maybelline New York']")).click();
	driver.findElement(By.xpath("//div[text()='Maybelline New York Fit Me Concealer']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//button[@type='button'])[15]")).click();
		 
	
	
	
	
}
}
