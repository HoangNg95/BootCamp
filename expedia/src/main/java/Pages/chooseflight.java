package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class chooseflight {
	public static WebDriver driver;
	
	@FindBy (xpath="//*[@class='uitk-card-link'][1]") WebElement flight;
	@FindBy (xpath="//*[@data-test-id='select-button']") WebElement select;
	
	
	
	public chooseflight(WebDriver driver) {
		chooseflight.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void flight() throws InterruptedException {
		Thread.sleep(3000);
		flight.click();
	}
	
	public void select() throws InterruptedException {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", select);
	}
	
	
	
}
