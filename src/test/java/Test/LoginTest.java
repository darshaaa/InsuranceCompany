package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;

public class LoginTest extends BaseTest {
	@Test
	public void ValidTestLogin() throws InterruptedException {
		
		LoginPage loginPage = new LoginPage(driver);
		
		loginPage.ClickgetButton();
		Thread.sleep(1000);
		loginPage.enteremail("Testing123@gmail.com");
		Thread.sleep(1000);
		loginPage.enterpassword(123456789);
		Thread.sleep(1000);
		loginPage.ClickLogButton();
		Thread.sleep(1000);
		
	}

}
