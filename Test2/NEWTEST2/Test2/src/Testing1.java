
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//import org.openqa.selenium.support.ui.Select;

public class Testing1 {

	
	@Test

	public void login1()
	{
		System.out.println("chwck1");
		
	}


	@Before

	public void login2() throws Exception
	{
		/*
			System.setProperty("webdriver.ie.driver", "E://SELENIUM Path//IEDriverServer.exe");
			InternetExplorerDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get("http://www.bigbasket.com");
			*/
			System.setProperty("webdriver.chrome.driver", "E://SELENIUM Path//chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.gmail.com");
			//driver.findElement(By.id("Email")).sendKeys(arg0);
	
		driver.findElement(By.cssSelector("#link-signup > a")).click();
		
		//Create Google Account
		
		driver.findElement(By.name("FirstName")).sendKeys("Testing");		
		driver.findElement(By.id("LastName")).sendKeys("Chetan1");	
		
		driver.findElement(By.id("GmailAddress")).sendKeys("TestingChetan1");
		Thread.sleep(2000);
		
		driver.findElement(By.name("Passwd")).sendKeys("Testing1");
		Thread.sleep(2000);
		driver.findElement(By.name("PasswdAgain")).sendKeys("Testing1");
		Thread.sleep(2000);
		
		Select oselect=new Select(driver.findElement(By.id("HiddenBirthMonth")));
		 
	oselect.selectByIndex(5);
	
	}

	
	


	


	@After
	public void login3()
	{
		System.out.println("Login3");
	}
	}


