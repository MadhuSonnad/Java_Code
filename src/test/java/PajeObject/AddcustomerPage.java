package PajeObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage 
{
	public WebDriver Ldriver;
	public AddcustomerPage(WebDriver rdriver)
	{
		Ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	By CustomerMenu=By.xpath("(//a[@class='nav-link'])[21]");
	By customerItem=By.xpath("(//a[@class='nav-link'])[22]");

	By btnAddnew=By.xpath("//a[@class='btn btn-primary']");

	By txtEmail=By.xpath("//input[@id='Email']");
	By txtPassword=By.xpath("//input[@id='Password']");
	By txtcustomerRole=By.xpath("//div[@class='k-multiselect-warp k-floatwrap']");

	By listItemAdministrators=By.xpath("//li[@contains(text(),'Administrators)']");
	By listItemRegistered=By.xpath("//li[@contains(text(),'Registered)']");
	By listItemGuest=By.xpath("//li[@contains(text(),'Guest)']");
	By listItemVendor=By.xpath("//li[@contains(text(),'Vendors)']");

	By drpmgrOfVendor=By.xpath("//*[@name='VendorId']");
	By rdMaleGender=By.id("Gender_Male");
	By rdFeMaleGender=By.id("Gender_Female");

	By txtFirstName=By.xpath("//input[@id='FirstName']");
	By txtLastName=By.xpath("//input[@id='LastName']");

	By txtDOB=By.xpath("//input[@id='DateOfBirth']");

	By txtCompanyName=By.xpath("//input[@id='Company']");
	By txtAdminContent=By.xpath("//textarea[@id='AdminComment']");
	By btnSave=By.xpath("//button[@name='save']");

	public String getPageTitle()
	{
		return Ldriver.getTitle();
	}

	public void ClickonCustomerMenu() throws InterruptedException
	{
		Thread.sleep(2000);
		Ldriver.findElement(CustomerMenu).click();
	}

	public void clickOnCusttomerMenuItem()
	{
		Ldriver.findElement(customerItem).click();
	}

	public void clickonAddnew() throws InterruptedException
	{
		Thread.sleep(2000);
		Ldriver.findElement(btnAddnew).click();
	}

	public void setEmaile(String email)
	{
		Ldriver.findElement(txtEmail).sendKeys(email);
	}

	public void setPasswod(String password)
	{
		Ldriver.findElement(txtPassword).sendKeys(password);
	}

	/*public void setCustomerRoles(String role) throws Throwable
	{
		if(!role.equals("Vendors"))
		{
			Ldriver.findElement(By.xpath("//select[@id='SelectedCustomerRoleIds']")).click();
		}
		Ldriver.findElement(txtcustomerRole).click();

		WebElement listitem;
		Thread.sleep(3000);

		if(role.equals("Administrators"))
		{
			listitem=Ldriver.findElement(listItemAdministrators);
		}

		else if(role.equals("Guests"))
		{
			listitem=Ldriver.findElement(listItemGuest);
		}

		else if(role.equals("Registered"))
		{
			listitem=Ldriver.findElement(listItemRegistered);
		}

		else if(role.equals("Vendors"))
		{
			listitem=Ldriver.findElement(listItemVendor);
		}
		else
		{
			listitem=Ldriver.findElement(listItemGuest);
		}
		listitem.click();*/



	public void setManagerofVendors(String value) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)Ldriver;
		js.executeScript("window.scrollBy(0,350)", "");
		//js.executeScript("arrguments[0].click();", listitem);
		Thread.sleep(2000);
		Select drp=new Select(Ldriver.findElement(drpmgrOfVendor));
		drp.selectByValue(value);
	}

	public void setGender(String gender)
	{
		if(gender.equals("Male"))
		{
			Ldriver.findElement(rdMaleGender).click();
		}
		else if(gender.equals("Femail"))
		{
			Ldriver.findElement(rdFeMaleGender).click();
		}
		else
		{
			Ldriver.findElement(rdMaleGender).click();
		}
	}
	public void setFirstName(String lname)
	{
		Ldriver.findElement(txtFirstName).sendKeys(lname);
	}

	public void setLastName(String lname)
	{
		Ldriver.findElement(txtLastName).sendKeys(lname);
	}

	public void setDob(String dob)
	{
		Ldriver.findElement(txtDOB).sendKeys(dob);
	}

	public void companyName1(String CompanyName)
	{
		Ldriver.findElement(txtCompanyName).sendKeys(CompanyName);
	}

	public void setAdminContent(String content) throws InterruptedException
	{
	  JavascriptExecutor js=(JavascriptExecutor)Ldriver;
	  //js.executeScript("window.scrollBy(0,350)", "");
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(2000);
		Ldriver.findElement(txtAdminContent).sendKeys(content);
	}
	public void clickOnSave()
	{
		Ldriver.findElement(btnSave).click();
	}
}
