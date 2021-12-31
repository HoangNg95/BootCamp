package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newtab {
public static WebDriver driver;

	
	@FindBy (xpath="//*[@data-test-id='goto-checkout-button']") WebElement checkout;

	
	
	
	
	public newtab(WebDriver driver) {
	newtab.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	
	public void window() {
	Set<String> winsession= driver.getWindowHandles();
	Iterator<String> itr= winsession.iterator(); 
	String win1= itr.next();
	String win2= itr.next();
	driver.switchTo().window(win2);
}
	
	public void checkout() throws InterruptedException {
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", checkout);
	}
}
