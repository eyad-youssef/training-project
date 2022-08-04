package Alerts;

import holder.testbase;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertTest extends testbase {
    @Test
    public  void testAcceptAlert(){

       var alertPage =  homePage.clickJavaScriptAlert();
        alertPage.triggerAlert();
        alertPage.acceptAlert();
       assertEquals(alertPage.getresult(),
               "You successfully clicked an alert", "result text incorrect");
    }
    @Test
    public void gettextfromalert(){
      var alertpage=   homePage.clickJavaScriptAlert();
      alertpage.triggerConfirm();
        String t = alertpage.getlalerttext();
        alertpage.dismissAlert();
        assertEquals(t,"I am a JS Confirm","incorrect text ");

    }
    @Test
    public void jj (){
        var alertpage = homePage.clickJavaScriptAlert();
        alertpage.triggerPrompt();
        String t = "dsfsfdfs";
        alertpage.getlalerttextinput(t);
        alertpage.acceptAlert();
        assertEquals(alertpage.getresult(),"you entered:"+t," result incorrect");
    }
}
