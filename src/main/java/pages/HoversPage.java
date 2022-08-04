package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {

    private WebDriver d ;
    public  HoversPage(WebDriver d){
        this.d=d;
    }

    /**
     *
     * @param index starts at 1
     */
    public Captionfigure hoverfigure(int index ){

        WebElement figure = d.findElements(By.className( "figure")).get(index-1) ;

        Actions action = new Actions(d);
         action.moveToElement(figure).perform();
         return new Captionfigure(figure.findElement(By.className("figcaption")));


     }
     public  class Captionfigure{
        private WebElement caption;
        public Captionfigure(WebElement caption)
        {this.caption = caption;}

         public boolean isdisplayed(){
            return  caption.isDisplayed();

         }
         public  String gettitle(){
            return  caption.findElement(By.tagName("h5")).getText();
         }
         public  String getlink(){
             return  caption.findElement(By.tagName("h5")).getAttribute("href");
         }

         public  String getlinktext(){
             return  caption.findElement(By.tagName("a")).getText();
         }



     }
}
