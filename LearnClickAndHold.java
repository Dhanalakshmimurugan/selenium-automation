package jquery;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnClickAndHold {
	public static void main(String[] args) throws IOException, InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.switchTo().frame(0);
		WebElement ele=driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement ele1=driver.findElement(By.xpath("//li[text()='Item 2']"));
        WebElement ele2=driver.findElement(By.xpath("//li[text()='Item 3']"));
        WebElement ele3=driver.findElement(By.xpath("//li[text()='Item 4']"));
        Actions obj=new Actions(driver);
        Thread.sleep(3000);
        obj.keyDown(Keys.CONTROL).click(ele).click(ele1).click(ele2).click(ele3).keyUp(Keys.CONTROL).perform();
		
	}
}
