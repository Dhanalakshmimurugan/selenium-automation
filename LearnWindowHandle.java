package week8.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.beust.jcommander.internal.Sets;

public class LearnWindowHandle {
	public static void main(String[] args) {
		EdgeOptions option=new EdgeOptions();
		option.addArguments("--Start-maximize");
		EdgeDriver driver = new EdgeDriver(option);
		driver.get("https://letcode.in/windows");
		driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
		String b=driver.getTitle();
		System.out.println(b);
		String Handle=driver.getWindowHandle();
		System.out.println(Handle);
		Set<String>hand=driver.getWindowHandles();
		List<String>le=new ArrayList<String>(hand);
		
		driver.switchTo().window(le.get(1));
		String a=driver.getTitle();
		System.out.println(a);
	}

}
