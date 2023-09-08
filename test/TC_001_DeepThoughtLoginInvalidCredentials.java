package test;

import org.testng.annotations.Test;

import baseClass.ProjectSpecificationMethod;
import loginDeepThought.DeepThoughtLogin;

public class TC_001_DeepThoughtLoginInvalidCredentials  extends ProjectSpecificationMethod{
	
@Test	
public  void loginInvalidCredentials() {
	DeepThoughtLogin dtl = new DeepThoughtLogin();
	
	dtl.enterInvalidUsername().enterInvalidPassword().clickLoginButton();
}	

}
