package pac1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
public class Appium_Calc {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps=new DesiredCapabilities();
		caps.setCapability("platformName", "Android");
		caps.setCapability("appium:platformVersion","15");
		caps.setCapability("appium:deviceName","vivo Y56 5G");
		  caps.setCapability("appium:udid", "10BD5K2810000LR");
		  caps.setCapability("appium:appPackage", "com.vivo.calculator");
		  caps.setCapability("appium:appActivity","com.vivo.calculator.Calculator");
		  caps.setCapability("appium:automationName", "UiAutomator2");
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  AndroidDriver driver = new AndroidDriver(url, caps);
		  Thread.sleep(5000);
		  
		 // AndroidDriver driver=new AndroidDriver(new URL("https://127.0.0.1:4723/wd/hub"),caps);

driver.findElement(By.id("com.vivo.calculator:id/digit_9")).click();
driver.findElement(By.id("com.vivo.calculator:id/op_add")).click();
driver.findElement(By.id("com.vivo.calculator:id/digit_2")).click();
driver.findElement(By.id("com.vivo.calculator:id/eq")).click();
String total=driver.findElement(By.id("com.vivo.calculator:id/touchlayout")).getText();
System.out.println("The sum is:"+total);


	}

}
