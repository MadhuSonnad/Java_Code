package PajeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver Ldriver;
		public LoginPage(WebDriver rdriver)
		{
			Ldriver=rdriver;
			PageFactory.initElements(rdriver, this);
		}

		@FindBy(id="Email")
		@CacheLookup
		WebElement txtEmail;
		
		@FindBy(id="Password")
		@CacheLookup
		WebElement txtPassword;
		
		@FindBy(xpath="//button[@type='submit']")
		@CacheLookup
		WebElement btnLogin;
		
		@FindBy(linkText="Logout")
		@CacheLookup
		WebElement lnkLogout;
		
		public void setUsername(String uname)
		{
			txtEmail.clear();
			txtEmail.sendKeys(uname);
		}
		
		public void setPassword(String pwd)
		{
			txtPassword.clear();
			txtPassword.sendKeys(pwd);
		}
		
		public void clickLoginbtn()
		{
			btnLogin.click();
		}
		
		public void logout()
		{
			lnkLogout.click();
		}

}
