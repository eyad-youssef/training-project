package holder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class testbase {
    /*
    &#x639;&#x645;&#x644;&#x62A; &#x627;&#x648;&#x628;&#x62C;&#x643;&#x62A;  &#x645;&#x646; &#x627;&#x644;&#x62F;&#x631;&#x627;&#x64A;&#x641;&#x631;  &#x648; &#x639;&#x645;&#x644;&#x62A; &#x641;&#x627;&#x646;&#x643;&#x634;&#x646; &#x628;&#x62A;&#x639;&#x631;&#x641; &#x627;&#x644;&#x62F;&#x631;&#x627;&#x64A;&#x641;&#x631;  &#x628;&#x627;&#x633;&#x645;&#x647; &#x648; &#x645;&#x643;&#x627;&#x646;&#x647;
     */
    private WebDriver driver ;
    protected HomePage homePage ;
   @BeforeClass
    public void setup(){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\20114\\Downloads\\projects\\sourcess\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
         gohome();


        // دي عشان لو اي حاجه بتحمل الاختبار يستانها تحمل
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



       //حطيت بداية الصفحات عشان ابدء التيست للربط بينهم
             homePage= new HomePage(driver);

    }
    @BeforeMethod
    public void gohome(){
        driver.get("http://the-internet.herokuapp.com/");


    }

    @AfterClass
    public  void tearup(){
        driver.quit();
    }

}
   /*
   ألطريقه التانيه لل wait 
    WebDriver wait = new WebDriverWait(driver,5);
    wait.until(ExpextedConditions.invisibiltyOf(dirver.findelement())); */