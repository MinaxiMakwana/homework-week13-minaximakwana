package com.softwaretestingboard.magento.resources.testsuite;

import com.softwaretestingboard.magento.pages.LumaHomePage;
import com.softwaretestingboard.magento.pages.LumaMenPantPage;
import com.softwaretestingboard.magento.resources.TestBase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    //create object
    LumaHomePage lumaHomePage = new LumaHomePage();
    LumaMenPantPage lumaMenPantPage = new LumaMenPantPage();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart(){

        //Mouse Hover on Men Menu
        lumaHomePage.mouseHoverOnMenMenu();
        //Mouse Hover on Bottoms
        lumaHomePage.mouseHoverOnBottoms();
        //Click on Pants
        lumaHomePage.ClickOnPants();
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32.
        lumaMenPantPage.mouseHoverOnProductNameCronusYogaPant();
        lumaMenPantPage.mouseHoverToElementAndClick(32);
        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on colour Black.
        lumaMenPantPage.mouseHoverOnProductNameCronusYogaPantAndClickOnColourBlack();

        //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on ‘Add To Cart’ Button.
        lumaMenPantPage.mouseHoverOnProductNameCronusYogaPantAndClickOnAddToCartButton();
        mouseHoverToElementAndClick(By.xpath("(//span[contains(text(),'Add to Cart')])[1]"));

        //Verify the text ‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals("You added Cronus Yoga Pant to your shopping cart.",
                getTextFromElement(By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")));

        //Click on ‘shopping cart’ Link into message
        lumaMenPantPage.clickOnElement();
        //Verify the text ‘Shopping Cart.’
        Assert.assertEquals("Shopping Cart",
                getTextFromElement(By.xpath("//span[@class='base']")));

        //Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals("Cronus Yoga Pant",
                getTextFromElement(By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")));

        //Verify the product size ‘32’
        Assert.assertEquals("32",
                getTextFromElement(By.xpath("//dd[contains(text(),'32')]")));

        //Verify the product colour ‘Black’
        Assert.assertEquals("Black",
                getTextFromElement(By.xpath("//dd[contains(text(),'Black')]")));
    }
}
