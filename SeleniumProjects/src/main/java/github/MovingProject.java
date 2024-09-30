package github;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MovingProject {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		
		WebElement iframeElement=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframeElement);
	
		
		WebElement datePicker1=driver.findElement(By.id("datepicker"));
		
		
		datePicker1.click();
		datePicker1.sendKeys("09/25/2024");
		
		System.out.println("Date Entered as : "+datePicker1.getAttribute("value"));
		
				
		driver.close();
	
		
	}
	
	

}
