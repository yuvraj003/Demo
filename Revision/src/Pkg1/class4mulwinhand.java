package Pkg1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class class4mulwinhand 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\eclipse\\Chrome EXE file\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
		WebElement video = driver.findElement(By.id("video-title"));
		Actions vid = new Actions(driver);
		vid.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		
		System.out.println("current URL"+driver.getCurrentUrl());
		
		Set<String> all_w = driver.getWindowHandles();
		System.out.println("Total no. of Windows = "+all_w.size());
		
		int i=0;
		for (String s:all_w)
		{
			i=i+1;
			if (i==2)
			{
				driver.switchTo().window(s);
				break;
			}
			
		}
		System.out.println("current URL"+driver.getCurrentUrl());
	}

}
