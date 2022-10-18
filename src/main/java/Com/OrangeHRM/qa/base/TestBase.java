package Com.OrangeHRM.qa.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Com.OrangeHRM.qa.Util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties props;
	
	public TestBase() throws IOException {
		
		props = new Properties();
		
		FileInputStream ip = new FileInputStream("\\Users\\Hrushi Gunjal\\eclipse-workspace\\Test\\src\\main\\java\\Com\\OrangeHRM\\qa\\Config\\config.properties");
		
		props.load(ip);
	}
	
	
	@SuppressWarnings("deprecation")
	public static void initialization() {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		
		
		driver.get(props.getProperty("url"));
	}
}
