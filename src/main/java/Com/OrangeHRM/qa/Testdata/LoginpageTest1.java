package Com.OrangeHRM.qa.Testdata;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Orange.qa.pages.OrangeHRMLoginpage;
import Com.OrangeHRM.qa.base.TestBase;

public class LoginpageTest1 extends TestBase {
OrangeHRMLoginpage Loginpage;
	
	public LoginpageTest1() throws IOException {
		super();
	}

	
	@BeforeMethod
    public void Setup() throws IOException {
    	
       initialization();  	
       Loginpage  = new OrangeHRMLoginpage();
    	
    }
    
	@Test
	public void OrangeUername() throws InterruptedException {
		boolean UserID =Loginpage.Validateusername(props.getProperty("Username"), props.getProperty("Password"));		
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void Teardown() {
		driver.quit();
	}
		

}
