package loginDeepThought;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseClass.ProjectSpecificationMethod;

public class DeepThoughtLogin extends ProjectSpecificationMethod{
		
		public DeepThoughtLogin enterInvalidUsername() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("abc123@outlookgmail.com");
		return this;
		}
		
		public DeepThoughtLogin enterInvalidPassword() {
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("password@123ABC");
			return this;
			}
		
		public DeepThoughtLogin noUsername() {
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("");
			//it will return to DeepThougtLoginPage
			return this;
			}
			
		public DeepThoughtLogin noPassword() {
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("");
			return this;
			}
		
		public DeepThoughtLogin clickLoginButton() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		return this;
		}

}
