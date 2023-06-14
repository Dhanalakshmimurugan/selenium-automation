package jquery;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		//WebElement ele =driver.findElement(By.id("draggable"));
		//ele.click();
		Actions name=new Actions(driver) ;
		//name.pause(30).dragAndDropBy(ele, 100, 200).perform();
		//driver.findElement(By.linkText("Droppable")).click();
		//driver.
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement dest=driver.findElement(By.id("droppable"));
		name.pause(30).dragAndDrop(source, dest).perform();
		String text = dest.getCssValue("Background");
		System.out.println(text);
		
	}

}
