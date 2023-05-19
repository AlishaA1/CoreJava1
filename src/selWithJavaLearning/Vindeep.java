package selWithJavaLearning;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vindeep {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ArrayList<String> exp_data=new ArrayList<String>();
		exp_data.add("Days");
		exp_data.add("Months");
		exp_data.add("Years");
		//ArrayList<String> act_data=new ArrayList<String>();
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://vindeep.com/Calculators/FDCalc.aspx");
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println("Title="+title);
		if(title.equals("Fixed Deposit Calculator | Calculate FD Interest, Maturity value"))
		{
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_FDAmount")).sendKeys("200000");
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).clear();
			driver.findElement(By.id("ContentPlaceHolder1_cphCentre_Period")).sendKeys("70");
			//FD Period Dropdown Code
			Select drpB_FDp=new Select(driver.findElement(By.id("ContentPlaceHolder1_cphCentre_PeriodDropDown")));
			drpB_FDp.selectByVisibleText("Days");
			List<WebElement> allOpts=drpB_FDp.getOptions();
			System.out.println("Total Number of Options="+allOpts.size());
			for(int i=0;i<allOpts.size();i++)
			{
				System.out.println(allOpts.get(i).getText());
				if(exp_data.get(i).equals(allOpts.get(i).getText()))
				{
					System.out.println("Item Matched...");
				
				}
				else
				{
					System.out.println("Item not Matched...");
				}
			}
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$cphCentre$InterestRate")).clear();
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$cphCentre$InterestRate")).sendKeys("5.40");
			//Interest Compounding Frequency
			
			driver.findElement(By.name("ctl00$ContentPlaceHolder1$cphCentre$btnFDMAmount")).click();
			//wait untill 5 seconds
			Thread.sleep(5000);
			String act_fd_amount=driver.findElement(By.id("ContentPlaceHolder1_cphCentre_MaturityAmountTextBox")).getAttribute("value");
			System.out.println("Actual Data="+act_fd_amount);
			if(act_fd_amount.equals("273,475"))
			{
				System.out.println("Calculation is correct");
			}
			else
			{
				System.out.println("Calculation is incorrect");
			}
			driver.quit();
		}
		else
		{
			System.out.println("Title not matched");
		}




	}

}
