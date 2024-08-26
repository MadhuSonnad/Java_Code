package StepDefination;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PajeObject.AddcustomerPage;
import PajeObject.LoginPage;
import net.bytebuddy.utility.RandomString;

public class BaseClass {

	public WebDriver driver;
	public LoginPage lp;
	public AddcustomerPage addCust;
	
	public static String randomString()
	{
		String generatedDtring=RandomStringUtils.randomAlphabetic(5);
		return (generatedDtring);
	}
	
}
