package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver d ;
    public DropDownPage( WebDriver d){
        this.d = d;
    }

// to select the element in the dropdown list
  public  void  selectdropdown (String option){
          finddropdownelement().selectByVisibleText(option);
  }


  public List<String> getselectedoption(){
   List<WebElement> selectedelements=  finddropdownelement().getAllSelectedOptions();
        return selectedelements.stream().map(e->e.getText()).collect(Collectors.toList());
  }

// to select the dropdown list its self
  /* عملت كده عشان هاحتاج اعرفه كل مره احتاجه بدل ما اعرفه في كل داله عرفته مرة واحده في دالة و هاستدعيها كل مره هاحتاجه */
private Select finddropdownelement(){
   return  new Select(d.findElement(By.id("dropdown")));
}

}
