package Dropdown;

import holder.testbase;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class dropdowntest extends testbase {
    @Test
    public void dropdownselect(){
        DropDownPage dropdown = homePage.Dropdownlist();
        dropdown.selectdropdown("option 1");
        //sops=selected options
        var sops=dropdown.getselectedoption();
       assertEquals(sops.size(), 1 ,"incorrect choice of options ");
       assertTrue(sops.contains("option 1"), "not the right choice");
     }



}
