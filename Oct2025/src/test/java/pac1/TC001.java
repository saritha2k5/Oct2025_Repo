package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("The titile is:"+driver.getTitle());
		System.out.println("The url is:"+driver.getCurrentUrl());
		
		
		WebElement search=driver.findElement(By.id("APjFqb"));
		if(search.isDisplayed())
		{
		//search.sendKeys(Keys.SPACE);
		search.sendKeys(Keys.TAB);
		}
	/*
		//search.submit();
		//driver.findElement(By.name("btnK")).click();
	driver.navigate().to("https://www.amazon.in/");
	System.out.println("The titile is:"+driver.getTitle());
	System.out.println("The url is:"+driver.getCurrentUrl());
	driver.navigate().back();
	System.out.println("The titile is:"+driver.getTitle());
	System.out.println("The url is:"+driver.getCurrentUrl());
	driver.navigate().forward();
	System.out.println("The titile is:"+driver.getTitle());
	System.out.println("The url is:"+driver.getCurrentUrl());
	*/
	}

}
