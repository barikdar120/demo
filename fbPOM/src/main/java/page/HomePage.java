package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.HomeModel;

public class HomePage extends HomeModel {
	public HomePage(WebDriver d) {
		super(d);
	}
	public void ClickOnCreateNewAccountBtn() {
		WebElement e = getcreateaccountBtn();
		e.click();
	
		
	}
	

}
