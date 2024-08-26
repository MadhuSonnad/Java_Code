package StepDefination;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PajeObject.AddcustomerPage;
import PajeObject.LoginPage;
import io.cucumber.java.en.*;

public class Seteps extends BaseClass
{
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() 
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe"); 
		driver=new ChromeDriver();
		lp=new LoginPage(driver);

	}
	@When("User opens URL {string}")
	public void user_opens_url(String url) 
	{
		driver.get(url);
		driver.manage().window().maximize();
	}

	@When("user enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) 
	{
		lp.setUsername(email);
		lp.setPassword(password);
	}

	@When("Click on Login")
	public void click_on_login() 
	{
		lp.clickLoginbtn();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title)
	{
		if(driver.getPageSource().contains("Login with unsuccessful."))
		{
			driver.close();
			Assert.assertTrue(false);
		}
		else
		{
			Assert.assertEquals(title,driver.getTitle());
		}
	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws InterruptedException
	{
		lp.logout();
		Thread.sleep(2000);
	}

	@Then("close browser")
	public void close_browser() 
	{
		driver.quit(); 
	}

	//Customer feature step definitions------------
	@Then("User can view Dashboard")
	public void user_can_view_dashboard() 
	{
		addCust=new AddcustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration",addCust.getPageTitle());

	}
	@When("User click on customer Menu")
	public void user_click_on_customer_menu() throws Throwable 
	{
		Thread.sleep(2000);
		addCust.ClickonCustomerMenu();   
	}
	@When("click on customer Menu Item")
	public void click_on_customer_menu_item() throws InterruptedException 
	{
		Thread.sleep(2000);
		addCust.clickOnCusttomerMenuItem();
	}
	@When("click on Add new button")
	public void click_on_add_new_button() throws InterruptedException 
	{
		addCust.clickonAddnew();
	}
	@Then("user can view Add new customer page")
	public void user_can_view_add_new_customer_page() 
	{
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}
	@When("User enter the customer Info")
	public void user_enter_the_customer_info() throws Throwable 
	{
		String email=randomString()+"@gmail.com";
		addCust.setEmaile(email);
		addCust.setPasswod("Test123");

		Thread.sleep(2000);
		addCust.setFirstName("Madhu");
		addCust.setLastName("Sonnad");
		addCust.setGender("Male");
		Thread.sleep(2000);

		addCust.setDob("26-09-1992");
		addCust.companyName1("Sysfore Tech");
		// addCust.setCustomerRoles("Guest");
		//Thread.sleep(2000);
		//addCust.setManagerofVendors("Vendor 2");
		Thread.sleep(2000);
		addCust.setAdminContent("This is for testing the codes......");

	}
	@When("click on Save button")
	public void click_on_save_button() throws InterruptedException 
	{
		addCust.clickOnSave();
		Thread.sleep(2000);
	}
	@Then("User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) 
	{
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added successfully"));
	}
	
	//steps for searching a customer using a ID
	
	@When("Enter Customer Email")
	public void enter_customer_email() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("click on search button")
	public void click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("User should found Email in the search table")
	public void user_should_found_email_in_the_search_table() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
