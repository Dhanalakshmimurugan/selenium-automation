package jquery;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Accordion {
public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://jqueryui.com/accordion/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.switchTo().frame(0);
	try {
	WebElement ele = driver.findElement(By.xpath("//h3[@class='ui-accordion-header ui-corner-top ui-state-default ui-accordion-icons ui-accordion-header-active ui-state-active']"));
	}catch(Exception e){
		WebElement ele = driver.findElement(By.xpath("//h3[@class='ui-accordion-header ui-corner-top ui-state-default ui-accordion-icons ui-accordion-header-active ui-state-active']"));
	
	
	Actions obj = new Actions(driver);
	obj.moveToElement(ele).click().perform();
}
}
}
