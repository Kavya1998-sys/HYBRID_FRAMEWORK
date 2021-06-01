package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.Base_Page;

public class Facebook_Login extends Base_Page {

	
//declaration
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	//initialization
	public Facebook_Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void setEmail(String mail)
	{
		email.sendKeys(mail);
	}
	
	public void setPass(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void passBtn()
	{
		login.click();
	}
}
