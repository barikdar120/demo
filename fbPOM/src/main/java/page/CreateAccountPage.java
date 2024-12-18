package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.CreateAccountModel;

public class CreateAccountPage extends CreateAccountModel {

	public CreateAccountPage(WebDriver e){
		super(e);
			
	}
	public void typeFirstName(String fname) {
		WebElement firstname = getFirstname();
		firstname.clear();
		firstname.sendKeys(fname);
	}
	public void typeLastName(String lname) {
		WebElement lastname = getLastname();
		lastname.clear();
		lastname.sendKeys(lname);	
	}
		
		public void SelectMonth(String m) {
			WebElement month = SelectMonth();
			  month.sendKeys(m);
		}	
		public void SelectDay(String d) {
			WebElement day = SelectDay();
			  day.sendKeys(d);
		}	
		public void SelectYear(String y) {
			WebElement year = SelectYear();
			  year.sendKeys(y);
		}
/*		public void Selectmale(String ml) {
			WebElement male = SelectMale();
			male.sendKeys(ml);
		}*/
				
	public void typePhoneNumber(String pnumber) {
		WebElement ph =getPhonenumber();
		ph.sendKeys(pnumber);
	}
	public void typePassWord(String pword) {
		WebElement pw = getPassword();
		pw.sendKeys(pword);
	}
	public void clickSignUp() {
		WebElement su = getSignUp();
		su.click();
			
		
	}

}
