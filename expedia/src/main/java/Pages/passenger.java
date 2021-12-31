package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class passenger {
		public static WebDriver driver;
		
		@FindBy (xpath="//*[@id='firstname[0]']") WebElement firstname;
		@FindBy (xpath="//*[@id='lastname[0]']") WebElement lastname;
		@FindBy (xpath="//*[@id='phone-number[0]']") WebElement phone;
		@FindBy (xpath="//*[@id='gender_male[0]']") WebElement male;
		@FindBy (xpath="//*[@data-tealeaf-name='date_of_birth_month[0]']") WebElement dobmo;
		@FindBy (xpath="//*[@data-tealeaf-name='date_of_birth_day[0]']") WebElement dobday;
		@FindBy (xpath="//*[@data-tealeaf-name='date_of_birth_day[0]']") WebElement dobyear;
		
		
		
		
		
		public passenger(WebDriver driver) {
			passenger.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void firstname() {
			firstname.sendKeys("Hoang");
		}
		
		public void lastname() {
			lastname.sendKeys("Nguyen");
		}
		
		public void phone() {
			phone.sendKeys("6091234567");
		}
		
		public void male() {
			male.click();
		}
		
		public void dobmo () {
			Select moSelect = new Select(dobmo);
			moSelect.selectByIndex(9);
		}
		 
		public void dobday() {
			Select daSelect = new Select(dobday);
			daSelect.selectByIndex(20);
		 }
		
		public void dobyear () {
			Select yrSelect = new Select(dobyear);
			yrSelect.selectByVisibleText("1995");
		}
		
		
		
		
		
		
		
		
}




