package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	private By GetstarButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[3]/a");
	private By usernameTextBox = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/div[1]/input");
	private By passwordTextBox = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/div[2]/input");
	private By Loginbutton = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/form/button");
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ClickgetButton() {
		driver.findElement(GetstarButton).click();
	}
	public void enteremail(String email) {
		driver.findElement(usernameTextBox).sendKeys(email);
	}
	public void enterpassword(int password) {
		driver.findElement(passwordTextBox).sendKeys("password");
	}
	public void ClickLogButton() {
		driver.findElement(Loginbutton).click();
	}
	

}
