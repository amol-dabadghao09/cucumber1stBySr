package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	@FindBy (xpath = "//*[@id='nav-cart']")
	private WebElement cartIcon ;
	
	@FindBy (xpath = "//*[@id='nav-link-accountList']")
	private WebElement hoverElement ;
	
	@FindBy (xpath = "//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-signin-button']")
	private WebElement signinButton ;
	
	@FindBy (xpath = "//*[@id='ap_email']")
	private WebElement emailTextBox ;
	
	@FindBy (xpath = "//input[@id='continue']")
	private WebElement continueButton ;
	
	@FindBy (xpath = "//input[@id='ap_password']")
	private WebElement passwordTextBox ;
	
	@FindBy (xpath = "//input[@id='signInSubmit']")
	private WebElement finalSigninButton ;
	
	WebDriver driver ;
	
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver ;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean verifyCartIcon() {
		
		boolean isdisplay = cartIcon.isDisplayed();
		return isdisplay ;
	}
	
	public void enterUserName(String uname) {
		
		Actions act = new Actions(driver);
		act.moveToElement(hoverElement).perform();
		
		signinButton.click();
		emailTextBox.sendKeys(uname);
		continueButton.click();
	}
	
	public void enterPassword(String pwd) {
		
		passwordTextBox.sendKeys(pwd);
	}
	
	public void finaleSignin() {
		
		finalSigninButton.click();
	}
	
	public String getTitleOfPage() {
		
		String title = driver.getTitle();
		return title ;
	}
	

}
