package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountModel extends  BaseModel {
	public CreateAccountModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getFirstname() {
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		return firstname;
	}
	public WebElement getLastname() {
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		return lastname;
	}
		public WebElement SelectMonth() {
			WebElement mon =driver.findElement(By.xpath("//*[@id='month']"));
			Select month=new Select(mon);	
			 return mon;
			
		}
		public WebElement SelectDay() {
			WebElement d =driver.findElement(By.xpath("//*[@id='day']"));
			Select day=new Select(d);	
			 return d;
			
		}
		public WebElement SelectYear() {
			WebElement ya =driver.findElement(By.xpath("//*[@id='year']"));
			Select year=new Select(ya);	
			 return ya;
		}	 
/*	   public WebElement SelectMale() {
		   WebElement ma = driver.findElement(By.xpath("//input[@value='2']"));
		   return ma;
	
		}*/
	
	public WebElement getPhonenumber() {
		WebElement pn = driver.findElement(By.xpath("//*[@aria-label='Mobile number or email']"));
		return pn;
		
	}
	public WebElement getPassword() {
		WebElement pw = driver.findElement(By.xpath("//input[@type=\'password\']"));
		return pw;
	}
	public WebElement getSignUp() {
		WebElement s = driver.findElement(By.xpath("//*[@name='websubmit']"));
		return s;
	}
	
	
	
	
	
	

}
