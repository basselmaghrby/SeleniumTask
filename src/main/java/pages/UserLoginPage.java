package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserLoginPage extends PageBase {

	public UserLoginPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="loginForm-eMail")
	WebElement emailTxtBox;
	@FindBy(id="loginForm-password")
	WebElement passwordTxtBox;
	@FindBy(xpath="//div/button[@class='frc-button']")
	WebElement confBtn;
	@FindBy(id="login-submit-btn")
	WebElement loginBtn;
	@FindBy(xpath="//div/h3[@class='a-h3 u-margin-xx-small--bottom']")
	public WebElement usernameSuccessTxt;
	@FindBy(xpath="//div/h3[@class='a-h3 u-margin-xx-small--bottom']")
	public WebElement validationMsg;

	 
	public void userLogin(String email, String password) {
		setTextElementText(emailTxtBox, email);
		setTextElementText(passwordTxtBox, password);
//		clickButton(confBtn);
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(120));
//     	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-submit-btn")));
//        clickButton(loginBtn);
	}

}
