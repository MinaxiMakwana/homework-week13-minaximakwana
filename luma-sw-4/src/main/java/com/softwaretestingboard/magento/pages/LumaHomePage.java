package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class LumaHomePage extends Utility {



    public void mouseHoverOnWomenMenu (){

        mouseHoverToElement(By.id("ui-id-4"));
    }

    public void mouseHoverOnTops(){
      //mouseHoverToElement(By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]"));
      mouseHoverToElementAndClick(By.id("ui-id-9"));
    }

    public void ClickOnJackets(){

        mouseHoverToElement(By.id("ui-id-11"));
    }

    public void mouseHoverOnMenMenu (){
        mouseHoverToElement(By.xpath("//span[normalize-space()='Men']"));
    }

    public void mouseHoverOnBottoms(){
        mouseHoverToElement(By.xpath("//a[@id='ui-id-18']"));
    }

    public void ClickOnPants(){
        mouseHoverToElementAndClick(By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]"));

    }


}
