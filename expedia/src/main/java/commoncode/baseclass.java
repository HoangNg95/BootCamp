package commoncode;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class baseclass {
	public WebDriver driver;

	
	
	
	
	 @BeforeTest (alwaysRun=true)
	  
	  public void beforeTest() {
			browsers("edge");
			    driver.get("https://www.expedia.com");
			    driver.manage().window().maximize();
			    driver.manage().deleteAllCookies();
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }


	  @AfterTest (alwaysRun=true)
	  public void afterTest() {
		  //driver.close();
	  }

	  
	  public void browsers(String browser) {
		   if(browser.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\hoang\\Desktop\\Bootcamp 2021\\Selenium\\drivers\\chromedriver.exe");   
		  driver=new ChromeDriver();    
		   }
		   else if (browser.equalsIgnoreCase("firefox")) {
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\hoang\\Desktop\\Bootcamp 2021\\Selenium\\drivers\\geckodriver.exe");   
		 driver=new FirefoxDriver(); 
		   }
		   else if (browser.equalsIgnoreCase("edge")) {
		 System.setProperty("webdriver.edge.driver","C:\\Users\\hoang\\Desktop\\Bootcamp 2021\\Selenium\\drivers\\msedgedriver.exe");   
		 driver=new EdgeDriver();  
		   }
		   else {
			   System.setProperty("webdriver.chrome.driver","C:\\Users\\hoang\\Desktop\\Bootcamp 2021\\Selenium\\drivers\\chromedriver.exe");  
		   }
		   }
}

