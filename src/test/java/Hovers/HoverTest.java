package Hovers;

import holder.testbase;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTest extends testbase {

  @Test
    public void hoveruser(){

        var hover=  homePage.clickhovers() ;
         var caption = hover.hoverfigure(1) ;
         assertTrue(caption.isdisplayed(), "caption is not displayed");
        assertEquals(caption.gettitle(), "name:user1 ","caption title incorrect");
        assertEquals(caption.getlinktext(), "view profile ","caption link text incorrect ");
        assertTrue(caption.getlink().endsWith("/users/1"), "incorrect link ");
    }



}
