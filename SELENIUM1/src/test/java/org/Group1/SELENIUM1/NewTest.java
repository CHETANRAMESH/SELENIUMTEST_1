package org.Group1.SELENIUM1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void TestCase1_Launch_WordPress_WebSite() throws InterruptedException {
	  
	  
	  System.setProperty("webdriver.gecko.driver","C:/Users/chetan/Downloads/geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://wordpress.com/wp-login.php");
	  driver.manage().window().maximize();
	 Thread.sleep(3000);
	  driver.quit();

	  
  }
}
