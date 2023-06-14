
package week9.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import dev.failsafe.Timeout;

public class LanuchWebTable{
	public static void main(String[]args) {
		
	    EdgeDriver driver =new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://erail.in");
	    WebElement ele = driver.findElement(By.id("txtStationFrom"));
	    ele.clear();
	    ele.sendKeys("MAS",Keys.ENTER);
	    WebElement ele2 = driver.findElement(By.id("txtStationTo"));
	    ele2.clear();
	    ele2.sendKeys("VLY",Keys.ENTER);
	    
	    driver.findElement(By.xpath("//label[text()='Sort on Date']")).click();
	    List<WebElement> trainname=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]/a"));
	    for(int i=2;i<trainname.size()-1;i++) {
	    	String name=driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr[" +i+ "]/td[2]/a")).getText();
	    	System.out.println("TRAIN NAME IS "+name);
	    	
	    List<WebElement> trainnum=driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[1]/a"));
	       String text=trainnum.get(i).getText();
	       System.out.println("TRAIN NUM IS "+text);
	    }    
	  }
	}



