package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.UserLoginPage;

public class UserLoginTest extends TestBase {
	UserLoginPage loginObject;
	
	@DataProvider(name="testData")
	public static Object[][] userData(){
		return new Object[][]{
			{
				"ValidCredentials","manuel10@gmail.com", "P@ssword"},{"InvalidCredentials","keno@gmail.com","12345"}};
	        }

	@Test(dataProvider="testData")
	public void verifyLoginCredentials(String scenario, String email, String password){
		loginObject = new UserLoginPage(driver);
		loginObject.userLogin(email, password);
		if (scenario.equals("ValidCredentials")) {
			Assert.assertTrue(loginObject.usernameSuccessTxt.getText().contains("Manuel Neuer"));
		}
		else{
			Assert.assertTrue(loginObject.validationMsg.getText().contains("E-Mail-Adresse und/oder Passwort sind falsch"));
		}
	}

	
}