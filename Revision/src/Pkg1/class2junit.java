package Pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class class2junit 
{
	ChromeDriver driver;
	
	@Test
	public void abc()
	{
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys("Yuvraj");
		
		WebElement Lastname = driver.findElement(By.cssSelector("input#u_0_o"));
		Lastname.sendKeys("Chilana");
		
		WebElement MNO = driver.findElement(By.id("u_0_r"));
		MNO.sendKeys("8729005536");
		
		WebElement Pass = driver.findElement(By.cssSelector("input[id='u_0_w']"));
		Pass.sendKeys("Yuvraj132");
		
		WebElement Drop = driver.findElement(By.name("birthday_day"));
		Select s= new Select(Drop);
		s.selectByIndex(4);
		  
		WebElement Drop1 = driver.findElement(By.id("month"));
		Select y = new Select(Drop1);
		y.selectByValue("8");
		
		WebElement Drop3 = driver.findElement(By.cssSelector("select[title='Year']"));
		Select z = new Select(Drop3);
		z.selectByVisibleText("1996");
		
		WebElement Gender = driver.findElement(By.cssSelector("label[for='u_0_7']"));
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
