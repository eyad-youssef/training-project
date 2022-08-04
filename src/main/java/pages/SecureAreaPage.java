package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver d;
  public SecureAreaPage(WebDriver d )
  {
      this.d =d ;
  }


  public String  Getalert(){
       return d.findElement(By.id("flash")).getText();


  }


}
