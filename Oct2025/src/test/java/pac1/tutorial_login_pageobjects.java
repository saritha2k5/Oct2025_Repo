package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tutorial_login_pageobjects {
	WebDriver driver;
	
	By myaccount=By.linkText("My Account");
	
	
	
	public tutorial_login_pageobjects(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}



	public void clickonmyaccount()
	{
	driver.findElement(myaccount).click();
	}

}
