package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

 public class KeyPresses {
    private WebDriver d ;
    public KeyPresses(WebDriver d){
        this.d = d ;
    }
    public  void entertext(String text){

        d.findElement(By.id("target")).sendKeys(text);

    }
     public  String  getesult(){

         return  d.findElement(By.id("result")).getText();

     }
}
