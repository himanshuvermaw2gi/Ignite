package Pages1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PerformancePage {
	
	WebDriver driver;
	
	public PerformancePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public WishlistPage investmentSummary()
	{
		
		driver.findElement(By.xpath("//*[@id='tab_1_1_1']/div/div[2]/div/div/div/div/table/tbody/tr/td/div[1]/a/img")).click();
		return new WishlistPage(driver);
		
	}

}
