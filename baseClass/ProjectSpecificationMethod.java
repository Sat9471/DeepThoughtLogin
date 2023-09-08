package baseClass;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificationMethod {
		
		public RemoteWebDriver driver;
		
		@Parameters("browser")
		
		@BeforeMethod	
		public void preCondtion(String browser) {
			if(browser.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if(browser.equalsIgnoreCase("edge")){
	            driver = new EdgeDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://dev.deepthought.education/login");	
		}

		@AfterMethod
		public void postCondtion() {
			driver.close();
		}
	}

