package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver d ;
    public  LoginPage(WebDriver d ){
        this.d = d ;
    }


    public  void EnterUserName(String username){
        d.findElement(By.id("username")).sendKeys(username);
    }


    public void EnterPassword(String password){
        d.findElement(By.id("password")).sendKeys(password);
    }


    public SecureAreaPage LoginButton(){
        d.findElement(By.cssSelector("#login > button")).click();
        return new SecureAreaPage(d);
    }






}
