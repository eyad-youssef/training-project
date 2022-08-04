package Login;

import holder.testbase;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.*;


public class LoginTest  extends testbase {
  @Test
 public  void loginsuccess(){

   LoginPage loginp =homePage.ClickFormAuthentication();
    loginp.EnterUserName("tomsmith");
    loginp.EnterPassword("SuperSecretPassword!");
     SecureAreaPage securearea= loginp.LoginButton();
     assertTrue(securearea.Getalert().contains(" You logged into a secure area!"), " Alert Text is incorrect ");



 }
}
