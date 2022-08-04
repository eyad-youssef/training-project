package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    /*

   عملت درايفر و عملته في الكونستراكتور عشان يكون اساسي موجود دايما
     */
    private WebDriver d ;

    public HomePage( WebDriver d)
    {
        this.d = d ;
    }





    public  LoginPage  ClickFormAuthentication(){
        d.findElement(By.linkText("Form Authentication")).click();
        return new LoginPage(d);
    }

    public DropDownPage  Dropdownlist(){
        d.findElement(By.linkText("Dropdown")).click();
        return new DropDownPage(d);

    }
    public  HoversPage clickhovers(){
        d.findElement(By.linkText("Hovers"));
        return new HoversPage(d) ;

    }

    public  KeyPresses enterekys(){
        d.findElement(By.linkText("Key Presses"));
        return new KeyPresses(d) ;

    }
    public AlertsPage clickJavaScriptAlert(){
        d.findElement(By.linkText("JavaScript Alerts"));
        return new AlertsPage(d);
    }
    public FileUploadPage clickfileupload(){
        d.findElement(By.linkText("File Upload")) ;
                return new FileUploadPage(d);

    }












}
