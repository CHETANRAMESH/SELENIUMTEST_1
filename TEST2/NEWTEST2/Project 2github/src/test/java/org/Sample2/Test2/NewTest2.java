package org.Sample2.Test2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class NewTest2 {

@Test	

public void Test1()
	{
	System.setProperty("webdriver.gecko.driver","C:/Users/chetan/Downloads/geckodriver.exe" );
	WebDriver driver = new FirefoxDriver();
	driver.get("http://newtours.demoaut.com/");
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
driver.findElement(By.linkText("REGISTER")).click();	
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
driver.findElement(By.name("firstName")).sendKeys("SFIRST");
driver.findElement(By.name("lastName")).sendKeys("USER");
driver.findElement(By.name("phone")).sendKeys("9945966577");
driver.findElement(By.name("userName")).sendKeys("rfchetan@gmail.com");
driver.findElement(By.name("address1")).sendKeys("ADDRESS1");


Select dropdown =new Select(driver.findElement(By.name("country")));
dropdown.selectByIndex(5);





driver.quit();
	
	
	
	
//	{
//		WebDriver driver;
//	}
//	
//	
//	public void instantiate_driver_object()
//	{
//		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://wordpress.com/wp-login.php");
//	}
//	
//	public void Provide_UnameandPwd()
//	{
//	
//	By driver = null;
//	WebElement Element = 	driver.findElement((SearchContext) By.id("user_login"));
//	Element.sendKeys("Chetan");
	}
	
	
	
	
}
	
	
	

/*
	String driverPath = "C:/Users/chetan/Downloads/geckodriver.exe"; 
	public WebDriver driver;
  @Test
  public   void SeleniumTest2(){
	  System.out.println("launching firefox browser"); 
	  
	  /*
	  System.setProperty("webdriver.chrome.driver","E:/SELENIUM Path/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("http://www.gmail.com");

      // Enter userd id
      driver.findElement(By.id("Email")).sendKeys("xyz@gmail.com");
      System.out.println("UNAME");
	
	 try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 driver.findElement(By.name("userName")).sendKeys("UrNaaaaa");
  }
  
	
	
	  
	  System.setProperty("webdriver.gecko.driver","C:/Users/chetan/Downloads/geckodriver.exe");
	 // DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	// capabilities.setCapability("marionette", true);
	  
	  WebDriver driver = new FirefoxDriver();
	 // System.out.println("Application title is ============="+driver.getTitle());

      //Open gmail
      driver.get("http://www.gmail.com");
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
      // Enter userd id
     WebElement  UsrName= driver.findElement(By.id("Email"));
     UsrName.sendKeys("xyz@gmail.com");
      System.out.println("UNAME");
  }
  }

      
      /*

      //wait 5 secs for  userid to be entered
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

      //Enter Password
      WebElement element1 = driver.findElement(By.id("Passwd"));
      element1.sendKeys("Password");

      //Submit button
      element.submit();

  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
//	  System.setProperty("webdriver.ie.driver","C:/Users/chetan/Downloads/IEDriverServer.exe");
//	 WebDriver driver = new InternetExplorerDriver();
	  
	  
	  System.setProperty("webdriver.gecko.driver","C:/Users/chetan/Downloads/geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com/");
	  driver.manage().window().maximize();
	  
		 WebElement UN=driver.findElement(By.name("userName"));
		 UN.sendKeys("UrNaaaaa");
	  System.setProperty("webdriver.chrome.driver","E:/SELENIUM Path/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  
	
	
  }
  
	 
	 // driver.quit();
  
*/

	 

	 

