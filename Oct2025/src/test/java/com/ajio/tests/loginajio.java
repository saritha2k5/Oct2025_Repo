package com.ajio.tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ajio.base.BaseTest;
import com.ajio.pages.loginpage;
import com.ajio.utilities.ExcelUtilities;
import com.ajio.utilities.Screenshots;
import com.aventstack.extentreports.ExtentTest;

public class loginajio extends BaseTest{
	
	static String projectpath=System.getProperty("user.dir");
	
	
	@Test(dataProvider="logindata")
	public void verifylogin(String username,String password) throws IOException
	
	{
		navigateurl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		test=extent.createTest("login with the user:"+username);
		
		loginpage obj=new loginpage(driver);
		
		String title=driver.getTitle();
		System.out.println("title;"+title);
		if(title.equalsIgnoreCase("OrangeHR"))
		{
			test.pass("title is matched");
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
			String screenpath=Screenshots.Capture(driver, "Title is not matched");
			
			test.fail("title is not matched:"+title).addScreenCaptureFromPath(screenpath);		
		}
		
	}
	
	
	@DataProvider
	public Object[][] logindata() throws InvalidFormatException, IOException{
		
		String excelpath=projectpath+"\\src\\test\\resources\\TestData\\data.xlsx";
		System.out.println("excelpath:"+excelpath);
		return ExcelUtilities.getdata(excelpath, "Sheet1");
		
	

}

}