package Pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class class3xpath 
{
ChromeDriver driver;
	
	@Test
	public void abc()
	{
		WebElement firstname = driver.findElement(By.xpath("//input[@id='u_0_m']"));
		firstname.sendKeys("Yuvraj");
		
		WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname' and @type='text']"));
		Lastname.sendKeys("Chilana");
		
		WebElement MNO = driver.findElement(By.xpath("//input[@id='u_0_r' or @name='reg_email__']"));
		MNO.sendKeys("8729005536");
		
		WebElement Pass = driver.findElement(By.xpath("//*[@id='u_0_w']"));
		Pass.sendKeys("Yuvraj132");
		 
		WebElement Drop = driver.findElement(By.xpath("//select[@id='day']"));
		Select s= new Select(Drop);
		s.selectByIndex(4);
		  
		WebElement Drop1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select y = new Select(Drop1);
		y.selectByValue("8");
		
		WebElement Drop3 = driver.findElement(By.xpath("//select[@*='year']"));
		Select z = new Select(Drop3);
		z.selectByVisibleText("1996");
		
		WebElement Gender = driver.findElement(By.xpath("//input[@value='2']"));
		Gender.click();
	}
	
	@Before
	public void bc()
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\eclipse\\Chrome EXE file\\chromedriver.exe");
        driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}
	
	@After
	public void mn()
	{
		WebElement Signup = driver.findElement(By.name("websubmit"));
		Signup.click();
	}

}
