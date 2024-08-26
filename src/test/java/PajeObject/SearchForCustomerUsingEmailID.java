package PajeObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class SearchForCustomerUsingEmailID {
	public WebDriver Ldriver;
	
	WaitHelper waithelper;
	public SearchForCustomerUsingEmailID(WebDriver rdriver)
	{
		Ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		waithelper =new WaitHelper(Ldriver);
	}
}
