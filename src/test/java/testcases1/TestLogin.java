package testcases1;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Pages1.Login;
import Pages1.PerformancePage;
import Pages1.WishlistPage;


public class TestLogin {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://investor.homeunion.com/#login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		
		Login l1 = new Login(driver);
		PerformancePage pp = l1.doLogin("demo@panalinks.com", "123456");
		WishlistPage wp =pp.investmentSummary();
		wp.Propertydetails();
		//l1.forgotPassword("himanshu@panalinks.com");
		//l1.signup("Geeta", "Bakshi", "9891237754", "demo3@panalinks.com", "123456", "123456");
		
		
		
	}

}
