package week9.day2;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnSnapShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		Thread.sleep(2000);
		File ele =driver.getScreenshotAs(OutputType.FILE);
		File dest = new File ("./snap/003.png");
		FileUtils.copyFile(ele,dest);
		
		}
}    