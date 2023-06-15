package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnFrame {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node01jn41jjig693vmsqigtzvul96142294.node0");
		//driver.switchTo().frame(0);
		//driver.findElement(By.id("Click")).click();
		//Nested Frame
		//Thread.sleep(2000);	
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		//Thread.sleep(5000);
		driver.findElement(By.id("Click")).click();
		
		
		
		
	}

}
