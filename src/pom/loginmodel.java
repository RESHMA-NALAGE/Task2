package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginmodel
{
	@FindBy(xpath="//*[@class='ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid ng-valid-required']")
	private WebElement drop;
	@FindBy(id="name")
	private WebElement name;
	@FindBy(id="orgName")
	private WebElement orgName;
	@FindBy(id="singUpEmail")
	private WebElement Email;
	@FindBy(xpath="//*[@class='black-color ng-binding']")
	private WebElement chekbox;
	@FindBy(xpath="//*[@class='btn btn-custom btn-block ng-binding']")
	private WebElement submit;
	 
	
	loginmodel(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
  @Test
  public void page(String na,String org,String em) 
  {
	  drop.click();
	  name.sendKeys(na);
	  orgName.sendKeys(org);
	  Email.sendKeys(em);
	  chekbox.click();
	  submit.click();
	  
	  
	  
  }
}
