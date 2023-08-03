package TestCases;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.junit.Test;

import PomClasses.CartPage;
import PomClasses.HomePageAfterLogin;
import PomClasses.Womens;
import Utility.BaseClass;

public class VerifyWomensModel {
	public Object driver;

	public class VerifyWomenModel extends BaseClass{
		@Test
		public void Tc_Women_003() {
			HomePageAfterLogin HPAL = new HomePageAfterLogin(driver);
			HPAL.getMenMenuLink().click();
			Womens womenspom = new Womens(driver);
			womenspom.getwomenkruthiAddCartButton().click();
			HPAL.getMainCartIcon().click();
			CartPage CartPom = new CartPage(driver);
			String actualResult = CartPom.getrayYonSleeveLength().getText();
			if(actualResult.contains("Fabric :Rayan")) {
				System.out.println("The test case is pass");
			}
			else {
				System.out.println("The test case fails");
			}
	}
	}
}

	
