package Pages1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishlistPage {
	
	WebDriver driver;
	
	public WishlistPage(WebDriver driver)
	{
		this.driver = driver;
		
	}
	
	public void Propertydetails() 
	{
		
		driver.findElement(By.xpath("//*[@id='tab3']/a")).click();
		
		System.out.println("---------------------------------With Fianancing---------------------------------");
		System.out.println("---------------------------------Investment Summary-------------------------------");
		
		int Price1 = Integer.parseInt(driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/span[2]")).getText().toString().replace("$","").replace(",", ""));
		System.out.println("Price1 is" +Price1);
		
		int Price2 = Integer.parseInt(driver.findElement(By.xpath("//*[@id='tab_5_3']/div[1]/div/div[2]/div/table/tbody/tr[2]/td[2]")).getText().toString().replace("$", "").replace(",", ""));
		System.out.println("Price2 is" +Price2);
		
		if(Price1==Price2){
			System.out.println("Price match");
		}
		else
		{
			System.out.println("Price doesn't match");
		}
		
		int Closing_cost = Integer.parseInt(driver.findElement(By.xpath("//*[@id='tab_5_3']/div[1]/div/div[2]/div/table/tbody/tr[3]/td[2]")).getText().toString().replace("$", "").replace(",", ""));
		System.out.println("Closing cost is"+Closing_cost);
		
		int Rehab_cost = Integer.parseInt(driver.findElement(By.xpath("//*[@id='tab_5_3']/div[1]/div/div[2]/div/table/tbody/tr[4]/td[2]")).getText().toString().replace("$", "").replace(",", ""));
		System.out.println("Rehab cost is"+Rehab_cost);
		
		
		int Investment1= Integer.parseInt(driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[6]/div[1]/span[3]")).getText().toString().replace("$", "").replace(",", ""));
		System.out.println("Investment at top navigation is"+Investment1 );
		
		
		int Investment2= Integer.parseInt(driver.findElement(By.xpath("//*[@id='tab_5_3']/div[1]/div/div[2]/div/table/tbody/tr[5]/td[2]")).getText().toString().replace("$", "").replace(",", ""));
		System.out.println("Investment is"+Investment2 );
		
		if(Investment1==Investment2)
		{
			System.out.println("Investment matches");
		}
		else
		{
			System.out.println("Doesn't match");
		}
		
		int Loan_Amount = Price1 + Closing_cost + Rehab_cost - Investment2;
		System.out.println("Loan_Amount is........"+Loan_Amount);
		
		
		System.out.println("--------------------------Annual Return Calculation-------------------------------");
		System.out.println("------------------------------With Financing--------------------------------------");
		
		int rent = Integer.parseInt(driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[3]/span[2]")).getText().toString().replace("$", ""));
		
		int Rental_income = rent*12;
		System.out.println("Rental Income is"+ Rental_income);
		
		
		int Expenses = Integer.parseInt(driver.findElement(By.xpath("//*[@id='tab_5_3']/div[2]/div[1]/div[2]/div/table/tbody/tr[3]/td[2]")).getText().toString().replace("$",	"").replace("(", "").replace(",", "").replace(")", ""));
		System.out.println("Expenses is"+Expenses);
		
		int Annual_net_operating_income = Rental_income - Expenses;
		System.out.println("Annual_net_operating_income is........."+ Annual_net_operating_income);
		
		
		int Less_interest = Integer.parseInt(driver.findElement(By.xpath("//*[@id='tab_5_3']/div[2]/div[1]/div[2]/div/table/tbody/tr[5]/td[2]")).getText().toString().replace("$", "").replace("(", "").replace(",", "").replace(")", ""));
		System.out.println("Less_Interest is........"+Less_interest );
		
		int Net_Income = Annual_net_operating_income - Less_interest;
		System.out.println("Net_Income is........."+Net_Income );
		
		int Principal_pay_down = Integer.parseInt(""+driver.findElement(By.xpath("//*[@id='tab_5_3']/div[2]/div[1]/div[2]/div/table/tbody/tr[8]/td[2]")).getText().toString().replace("$", ""));
        System.out.println("Principal paydown is........."+Principal_pay_down);
        
        int Equity_Build = Integer.parseInt(driver.findElement(By.xpath("html/body/div[2]/div[3]/div/div[2]/div/div[1]/div/div[1]/div[6]/div[4]/span[3]")).getText().toString().replace("$", ""));
        System.out.println("Equity Build is..........."+ Equity_Build);
        
        if(Principal_pay_down==Equity_Build)
        {
        	System.out.println("value matches");
        }
        else
        {
        	System.out.println("Value didn't match");
        }
        
        int Annual_cashflow = Net_Income - Principal_pay_down;
        System.out.println("Annual_cashflow is.........."+Annual_cashflow);
        
        System.out.println("------------------------------------Expenses----------------------------------");
        
        int Property_tax = Integer.parseInt(driver.findElement(By.xpath("//*[@id='expenses']/div[2]/div/table/tbody/tr[2]/td[2]")).getText().toString().replace("$", "").replace(",", ""));
        System.out.println("Property tax is............."+ Property_tax);
        
                
        int Property_Insurance = Integer.parseInt(driver.findElement(By.xpath("//*[@id='expenses']/div[2]/div/table/tbody/tr[3]/td[2]")).getText().toString().replace("$", ""));
        System.out.println("Property_Insurance is.........."+Property_Insurance);
        
        int HOA = Integer.parseInt(driver.findElement(By.xpath("//*[@id='expenses']/div[2]/div/table/tbody/tr[4]/td[2]")).getText().toString().replace("$", ""));
        System.out.println("HOA is.........."+HOA);
        
        int Leasing_Fees = Integer.parseInt(driver.findElement(By.xpath("//*[@id='expenses']/div[2]/div/table/tbody/tr[5]/td[2]")).getText().toString().replace("$", ""));
        System.out.println("Leasing_Fees is............."+Leasing_Fees);
        
        int Asset_Management_fees = Integer.parseInt(driver.findElement(By.xpath("//*[@id='expenses']/div[2]/div/table/tbody/tr[6]/td[2]")).getText().toString().replace("$", "").replace(",", ""));
        System.out.println("Asset_Management_fees is........."+Asset_Management_fees);
        
        
        
        int Total_Expenses = Property_tax + Property_Insurance + HOA + Leasing_Fees + Asset_Management_fees ;
        System.out.println("Total_Expenses is.......... "+Total_Expenses);
		
		
 System.out.println("-----------------------------------Loan Term----------------------------------");
        
        double Down_Payment_percentage = Double.parseDouble(driver.findElement(By.xpath("//*[@id='loanterms']/div[2]/div/table/tbody/tr[2]/td[2]")).getText().toString().replace("%", ""));
        System.out.println("Down_Payment is........."+Down_Payment_percentage);
        
        
        double Down_Payment_Amount = Price1 * Down_Payment_percentage/100;
        System.out.println("Down_Payment_Amount is........ "+Down_Payment_Amount);
        
        double Loan_Amount1 = Price1 - Down_Payment_Amount;
        System.out.println("Loan_Amount is............." + Loan_Amount );
        
        //double rate = Double.parseDouble(""+driver.findElement(By.xpath("//*[@id='loanterms']/div[2]/div/table/tbody/tr[5]/td[2]")).getText().toString());
        //System.out.println("Rate is .............."+ rate);
        
        String rate = driver.findElement(By.xpath("//*[@id='loanterms']/div[2]/div/table/tbody/tr[5]/td[2]")).getText();
        System.out.println("Rate is..............."+rate );
        
        int months = Integer.parseInt(""+driver.findElement(By.xpath("//*[@id='loanterms']/div[2]/div/table/tbody/tr[6]/td[2]")).getText().toString());
        System.out.println("Loan months durations are..........."+ months);
        
        String P_and_I = driver.findElement(By.xpath("//*[@id='loanterms']/div[2]/div/table/tbody/tr[7]/td[2]")).getText();
        System.out.println("P_and_I is.........."+P_and_I);
        
        int year_one_interest = Integer.parseInt(driver.findElement(By.xpath("//*[@id='loanterms']/div[2]/div/table/tbody/tr[8]/td[2]")).getText().toString().replace("$", "").replace(",", ""));
        System.out.println("year_one_interest is ........"+ year_one_interest);
        
        if (Less_interest==year_one_interest)
        {
        	System.out.println("Interest is matching");
        }
        else
        {
        	System.out.println("Interest is not matching");
        }
        
        System.out.println("-------------------------------For Cash-------------------------------");
System.out.println("-------------------------------INVESTMENT SUMMARY-------------------------------------------");
		
		String x2 = driver.findElement(By.xpath("//*[@id='tab_5_3']/div[1]/div/div[2]/div/table/tbody/tr[2]/td[3]")).getText().toString().replace("$", "").replace(",", "");
		System.out.println("Price1 is....."+x2);
		int Price3 = Integer.parseInt(x2);
		
		int Closing_cost1 = Integer.parseInt(""+driver.findElement(By.xpath("//*[@id='tab_5_3']/div[1]/div/div[2]/div/table/tbody/tr[3]/td[3]")).getText().toString().replace("$", "").replace(",", ""));
		System.out.println("Closing_cost1 is......"+Closing_cost1);
		
		int Refresh_Rehab_Costs1 = Integer.parseInt(""+driver.findElement(By.xpath("//*[@id='tab_5_3']/div[1]/div/div[2]/div/table/tbody/tr[4]/td[3]")).getText().toString().replace("$", "").replace(",", ""));
		System.out.println(Refresh_Rehab_Costs1);
		
		int Investment3 = Price3 + Closing_cost1 + Refresh_Rehab_Costs1;
		System.out.println("Investment3 is........." +Investment3);
		
		
		System.out.println("----------------------------Annual Return Calculations--------------------------------------------------");
		int Rental_Income1 = Integer.parseInt(""+driver.findElement(By.xpath("//*[@id='tab_5_3']/div[2]/div[1]/div[2]/div/table/tbody/tr[2]/td[3]")).getText().toString().replace("$", "").replace(",", ""));
		System.out.println("Rental_Income1 is........."+Rental_Income1);
		
		
		int Expenses_provision1 = Integer.parseInt(driver.findElement(By.xpath("//*[@id='tab_5_3']/div[2]/div[1]/div[2]/div/table/tbody/tr[3]/td[3]")).getText().toString().replace("$", "").replace("(", "").replace(",", "").replace(")", ""));
		System.out.println("Expense and provision1 is........."+Expenses_provision1);
		
		
		int monthly_rental_income1 = Rental_Income1 - Expenses_provision1;
		System.out.println("monthly rental income1 is.........."+monthly_rental_income1);
		
		int Net_income2 = monthly_rental_income1;
		System.out.println("Net_income2 is.........."+ Net_income2);
		
		//int Net_income1 = Integer.parseInt(""+driver.findElement(By.xpath("//*[@id='tab_5_3']/div[2]/div[1]/div[2]/div/table/tbody/tr[6]/td[3]")).getText().toString().replace("$", ""));
		//System.out.println("Net_income1 is.........." +Net_income1);
		
        //double Return1 = Double.parseDouble(""+driver.findElement(By.xpath("//*[@id='tab_5_3']/div[2]/div[1]/div[2]/div/table/tbody/tr[6]/td[3]")).getText().toString().replace("%", ""));
        //System.out.println("Return1 is.........."+Return1);
		
		
        
               
        try {
			Thread.sleep(10L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("------------------------------------Expenses----------------------------------");
        
        int Property_Tax1 = Integer.parseInt(""+driver.findElement(By.xpath("//*[@id='expenses']/div[2]/div/table/tbody/tr[2]/td[3]")).getText().toString().replace("$", "").replace(",", ""));
        System.out.println("Property tax1 is........."+Property_Tax1);
        
        int Property_Insurance1 = Integer.parseInt(""+driver.findElement(By.xpath("//*[@id='expenses']/div[2]/div/table/tbody/tr[3]/td[3]")).getText().toString().replace("$", ""));
        System.out.println("Property_Insurance1 is.........."+Property_Insurance1);
        
        int HOA1 = Integer.parseInt(""+driver.findElement(By.xpath("//*[@id='expenses']/div[2]/div/table/tbody/tr[4]/td[3]")).getText().toString().replace("$", ""));
        System.out.println("HOA1 is.........."+HOA1);
        
        int Leasing_Fees1 = Integer.parseInt(""+driver.findElement(By.xpath("//*[@id='expenses']/div[2]/div/table/tbody/tr[5]/td[3]")).getText().toString().replace("$", ""));
        System.out.println("Leasing_Fees1 is............."+Leasing_Fees1);
        
        int Asset_Management_fees1 = Integer.parseInt(driver.findElement(By.xpath("//*[@id='expenses']/div[2]/div/table/tbody/tr[6]/td[3]")).getText().toString().replace("$", "").replace(",", ""));
        System.out.println("Asset_Management_fees1 is........."+Asset_Management_fees1);
        
       
        
        int Total_Expenses1 = Property_Tax1 + Property_Insurance1 + HOA1 + Asset_Management_fees1 + Leasing_Fees1;
        System.out.println("Total_Expenses1 is.......... "+Total_Expenses1);
        
        System.out.println("------------------------------End of calculations----------------------------");
        
       
		
		
		
		
	}

}
