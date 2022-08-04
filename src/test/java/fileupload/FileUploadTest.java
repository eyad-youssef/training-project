package fileupload;

import holder.testbase;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends testbase {
    @Test
    public  void fileuploadtest(){
        var fileuploadpage= homePage.clickfileupload();
        fileuploadpage.uploadpath(
                "C:\\Users\\20114\\Downloads\\projects\\sourcess\\chromedriver_win32\\chromedriver.exe");
         assertEquals(fileuploadpage.getfilename(),"chromedriver.exe", "uploaded  file");
    }
}
