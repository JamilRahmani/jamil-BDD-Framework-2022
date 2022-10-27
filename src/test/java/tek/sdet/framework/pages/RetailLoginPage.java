package tek.sdet.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.sdet.framework.base.BaseSetup;
import tek.sdet.framework.utilities.CommonUtility;

public class RetailLoginPage extends BaseSetup{
	
	public RetailLoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id= "email") public WebElement email;
	@FindBy(id="password") public WebElement password;
	@FindBy(id="loginBtn") public WebElement loginBtn;
	

}
