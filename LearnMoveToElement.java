package jquery;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

public class LearnMoveToElement {
	public static void main(String[] args) {
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://jqueryui.com/droppable/");
		
		
	}

}
