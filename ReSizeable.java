package jquery;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReSizeable {
public static void main(String[] args) throws InterruptedException{
	EdgeDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	driver.get("https://jqueryui.com/resizable/");
	 driver.switchTo().frame(0);

	 WebElement dest =driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-s']"));
	 Thread.sleep(3000);
    WebElement source=driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
    Actions name=new Actions(driver);
    name.dragAndDropBy(dest, 150, 150).perform();
    name.dragAndDropBy(source, 150, 150).perform();
}
}
