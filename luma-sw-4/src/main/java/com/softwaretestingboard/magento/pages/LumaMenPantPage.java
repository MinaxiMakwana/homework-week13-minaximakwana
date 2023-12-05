package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class LumaMenPantPage extends Utility {

    public void mouseHoverOnProductNameCronusYogaPant(){
        mouseHoverToElement(By.xpath("//a[normalize-space()='Cronus Yoga Pant']"));
    }

    public void clickOnSize32(){
        mouseHoverToElementAndClick(By.xpath("(//div[@class='swatch-option text'])[1]"));
    }

    public void mouseHoverToElementAndClick(int i) {

    }

    public void mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack(){
        mouseHoverToElementAndClick(By.xpath("(//div[@class='swatch-option color'])[1]"));
    }
    public void mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton(){
        mouseHoverToElement(By.xpath("//a[normalize-space()='Cronus Yoga Pant']"));
    }
    public void getTextFromElement(){
        getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']"));
    }
    public void clickOnElement(){
        clickOnElement(By.xpath("//a[normalize-space()='shopping cart']"));
    }



}
