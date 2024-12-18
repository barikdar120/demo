package test;

import org.testng.annotations.Test;

import page.HomePage;

public class HomePageTest extends BaseTest {

	
	@Test
	public void homepagetest() {
		
		HomePage hp = new HomePage(driver);
		hp.ClickOnCreateNewAccountBtn();
	}
}
