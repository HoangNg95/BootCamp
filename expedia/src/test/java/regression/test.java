package regression;

import org.testng.annotations.Test;

import Pages.chooseflight;
import Pages.newtab;
import Pages.passenger;
import Pages.xpdahome;
import commoncode.baseclass;

public class test extends baseclass{

	@Test(priority=1)
  public void f() throws InterruptedException {
		xpdahome xp = new xpdahome(driver);
		xp.flights();
		xp.leaving();
		xp.going();
		xp.departing();
		xp.choosedate();
		xp.confirm();
		Thread.sleep(3000);
		xp.submit();
		chooseflight fl = new chooseflight(driver);
		fl.flight();
		fl.select();
		fl.flight();
		fl.select();
		newtab nt = new newtab(driver);
		nt.window();
		nt.checkout();
		passenger pa = new passenger(driver);
		pa.firstname();
		pa.lastname();
		pa.phone();
		pa.male();
		pa.dobmo();
		pa.dobday();
		pa.dobyear();
  }
}
