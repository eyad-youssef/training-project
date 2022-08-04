package Keys;

import holder.testbase;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTest extends testbase {

    @Test
    public  void keypress(){
       var keypage =  homePage.enterekys();
       keypage.entertext("A" + Keys.BACK_SPACE);
       assertEquals(keypage.getesult(),"You entered BACK_SPACE");

    }
}
