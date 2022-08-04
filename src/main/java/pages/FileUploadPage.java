package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver d;
    public FileUploadPage(WebDriver d){
        this.d =d ; }


    public  void clickuploadbutton(){
        d.findElement(By.id("file-submit"));
        /**
         * Provides path of file to the form then clicks Upload button
         * @param path complete path of the file to upload
         */

    }
    public void uploadpath(String path ){
        d.findElement(By.id("file-upload")).sendKeys(path);
        clickuploadbutton();
    }
    public  String getfilename(){
       return d.findElement(By.id("uploaded-files")).getText();
    }
}

