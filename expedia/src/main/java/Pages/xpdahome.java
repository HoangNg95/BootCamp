package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class xpdahome {
	public static WebDriver driver;
	
	@FindBy (xpath="//*[@id=\"wizardMainRegionV2\"]/div/div/div/div/ul/li[2]/a/span") WebElement flights;
	@FindBy (xpath="//*[@aria-label='Leaving from']") WebElement leaving;
	@FindBy (xpath="//*[@aria-label='Going to']") WebElement going;
    @FindBy (xpath="//*[@id=\"d1-btn\"]") WebElement departing;
    @FindBy (xpath="//*[@data-stid=\"date-picker-paging\"][2]") WebElement nxtmo;
	@FindBy (xpath="//*[@aria-label=\"Mar 15, 2022\"]") WebElement date1;
	@FindBy (xpath="//*[@aria-label=\"Apr 15, 2022\"]") WebElement date2;
	@FindBy (xpath="//*[@data-stid='apply-date-picker']") WebElement confirm;
	@FindBy (xpath="//button[@type='submit']") WebElement submit;
	
	public xpdahome(WebDriver driver) {
		xpdahome.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void flights () {
		flights.click();
	}
	
	public void leaving () throws InterruptedException {
	leaving.sendKeys("Atlantic City Intl. Airport (ACY)", Keys.ENTER);	
		Thread.sleep(2000);
	}
	
	public void going() throws InterruptedException {
		going.sendKeys("Cancun Intl. Airport (CUN)", Keys.ENTER);
		Thread.sleep(2000);
	}
	
	public void departing() {
		departing.click();
	}
	
	public void choosedate() throws InterruptedException {
		Thread.sleep(2000);
		nxtmo.click();
		Thread.sleep(1000);
		date1.click();
		Thread.sleep(1000);
		nxtmo.click();
		Thread.sleep(1000);
		date2.click();
	}
	
	public void confirm() throws InterruptedException {
		Thread.sleep(2000);
		confirm.click();
	}
	
	public void submit() throws InterruptedException {
		Thread.sleep(3000);
		submit.click();
	}
	

	
	
	
	
}
