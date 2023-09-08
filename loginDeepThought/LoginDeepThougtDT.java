package loginDeepThought;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDeepThougtDT {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new  ChromeDriver();
		//get into the page
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dev.deepthought.education/login");
		
		// invalid username
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("abc123@outlookgmail.com");
		Thread.sleep(3000);
		
		//invalid password
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("password@123ABC");
		Thread.sleep(3000);
		
		//click login
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		Thread.sleep(3000);
		
		//print error message
		WebElement Message = driver.findElement(By.id("login-error-notify"));
		String errorMessage = Message.getText();
		System.out.println(errorMessage);
		
		
		// no username
		username.clear();
		username.sendKeys("");
		Thread.sleep(3000);
				
		//no password
		password.clear();
		password.sendKeys("");
		Thread.sleep(3000);
				
		//click login
		login.click();
		Thread.sleep(3000);
			
		//print error message
		WebElement Message1 = driver.findElement(By.id("login-error-notify"));
		String errorMessage1 = Message.getText();
		System.out.println(errorMessage1);
				
	}

}
