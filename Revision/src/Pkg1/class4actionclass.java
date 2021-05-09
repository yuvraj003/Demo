package Pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class class4actionclass 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\eclipse\\Chrome EXE file\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		WebElement from = driver.findElement(By.id("fromCity"));
		
		
		Actions ac = new Actions(driver);
		//ac.click(from).click(from).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		int i;
		for(i=1;i<=4;i++)
		{
			ac.click(from).sendKeys(Keys.ARROW_DOWN).perform();
		}
		ac.sendKeys(Keys.ENTER).perform();
		
		WebElement to = driver.findElement(By.id("toCity"));
		ac.click(to).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}

}
