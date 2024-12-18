package test;

import org.testng.annotations.Test;

import page.CreateAccountPage;
import page.HomePage;

public class CreateAccountPageTest extends BaseTest {
	
	@Test
	public void creataccountpagetest() {
		HomePage hp =new HomePage(driver);
		hp.ClickOnCreateNewAccountBtn();
		
		CreateAccountPage cap =new CreateAccountPage(driver);
		cap.typeFirstName("Erick");	
		cap.typeLastName("Barikdar");
		cap.SelectMonth("Jun");
		cap.SelectDay("12");
		cap.SelectYear("2006");
//		cap.SelectMale("Male");
		cap.typePhoneNumber("718 690 0222");
		cap.typePassWord("Austinb123");
		//cap.clickSignUp();
	
		
	}

}
