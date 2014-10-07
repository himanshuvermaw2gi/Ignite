package Pages1;

import java.io.File;






import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class Login {
	
	WebDriver driver;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public PerformancePage doLogin(String username, String password){
		
		driver.findElement(By.xpath("//*[@id='page-login-username-input']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@id='page-login-password-input']")).sendKeys(password);
		
		driver.findElement(By.xpath("//*[@id='page-login-remember-input']")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div[1]/div/div/div[3]/div[2]/form[1]/div[7]/button")).click();
		return new PerformancePage(driver);	
		
	}
     
	public void forgotPassword(String emailid) 
	{
		driver.findElement(By.xpath("//*[@id='forget-password']/h8")).click();
		driver.findElement(By.xpath("//*[@id='page_fpwd_email']")).sendKeys(emailid);
		
		String t1 = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div[1]/div/div/div[3]/div[2]/form[2]/div[1]")).getText();
		System.out.println(t1);
		
		String t2 = driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div[1]/div/div/div[3]/div[2]/form[2]/p")).getText();
		System.out.println(t2);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("E:\\forgot1.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div[1]/div/div/div[3]/div[2]/form[2]/div[3]/button[2]")).click();
		
		
		
		driver.findElement(By.xpath("html/body/div[2]/div[1]/div[2]/div/div[2]/div/div/div[3]/button")).click();
		
		//Alert alert = driver.switchTo().alert();
	//	System.out.println(alert.getText());
		//alert.accept();
	}
	
	public void signup(String Fname, String Lname, String phone, String emailid, String password, String confirm_password)
	{
		driver.findElement(By.xpath("//*[@id='login-page-form']/div[8]/h4/a")).click();
		driver.findElement(By.xpath("//*[@id='fname-input']")).sendKeys(Fname);
		driver.findElement(By.xpath("//*[@id='lname-input']")).sendKeys(Lname);
		driver.findElement(By.xpath("//*[@id='phone-input']")).sendKeys(phone);
		driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div[1]/div/div/div[3]/div[2]/div/div[1]/form/div/div[4]/div/input")).sendKeys(emailid);
		driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div[1]/div/div/div[3]/div[2]/div/div[1]/form/div/div[5]/div/input")).sendKeys(password);
		driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div[1]/div/div/div[3]/div[2]/div/div[1]/form/div/div[6]/div/input")).sendKeys(confirm_password);
		driver.findElement(By.xpath("//*[@id='registration-form']/div/div[7]/label/input")).click();
		driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div/div[1]/div/div/div[3]/div[2]/div/div[1]/form/div/div[9]/button")).click();
		
		
	}

	
}
