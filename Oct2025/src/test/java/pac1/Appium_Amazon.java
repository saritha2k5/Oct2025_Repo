package pac1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
public class Appium_Amazon {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:platformVersion","15");
		caps.setCapability("appium:deviceName","vivo Y56 5G");
		  caps.setCapability("appium:udid", "10BD5K2810000LR");
		  caps.setCapability("appium:appPackage", "in.amazon.mShop.android.shopping");
		  caps.setCapability("appium:appActivity","com.amazon.mShop.home.HomeActivity");
		  caps.setCapability("appium:automationName", "UiAutomator2");
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver driver = new AndroidDriver(url, caps);
		  Thread.sleep(5000);
		  WebElement allow=driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		 if(allow.isDisplayed())
		 {
			allow.click();
			

		 }
		 
		 driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Select English\"]")).click();
		 
		 driver.findElement(By.id("in.amazon.mShop.android.shopping:id/continue_button")).click();
		 driver.findElement(By.id("in.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();
		 
		 
	}
}