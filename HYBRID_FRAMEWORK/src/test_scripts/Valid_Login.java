package test_scripts;

import org.testng.annotations.Test;

import generic.Base_Test;
import generic.Generic_read_excel;
import pom_class.Facebook_Login;

public class Valid_Login extends Base_Test {
	
	@Test
	public void loginApp()
	{
		String uname=Generic_read_excel.getData("TestCase1", 0, 0);
		String pwd=Generic_read_excel.getData("TestCase1", 0, 1);
		Facebook_Login fb=new Facebook_Login(driver);
		fb.setEmail(uname);
		fb.setPass(pwd);
		fb.passBtn();
		
	}

}
