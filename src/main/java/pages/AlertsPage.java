package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private  WebDriver d ;
    public AlertsPage(WebDriver d ){
        this.d =d ;
    }


    public void triggerAlert(){
        d.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click(); ;

    }
    public void triggerConfirm(){
        d.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button")).click(); ;

    }
    public void triggerPrompt(){
        d.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click(); ;

    }
    public  void acceptAlert(){
        d.switchTo().alert().accept();
    }
    public  void dismissAlert(){
        d.switchTo().alert().dismiss();
    }
    public  String getlalerttext(){
       return  d.switchTo().alert().getText();
    }
    public  void getlalerttextinput(String text){
          d.switchTo().alert().sendKeys(text);
    }
    public String  getresult(){

      return   d.findElement(By.id("result")).getText();
    }
}
