package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {

    By buildYourOwnComputer = By.xpath("//h1[normalize-space()='Build your own computer']\"");

    By SelectPentiumDualCoreE2200 = By.xpath("Select \"2.2 GHz Intel Pentium Dual-Core E2200");

    By clickOnHDDButton = By.id("product_attribute_3_7");

    By clickOnVistaPremium = By.id("product_attribute_4_9");

    By clickOnMSSoftware = By.id("product_attribute_5_10");

    By addToCart = By.id("add-to-cart-button-1");

    By verifyPrice = By.id("price-value-1");



    public String getComputerText(){
        return getTextFromElement(buildYourOwnComputer);
    }

    public void selectByVisibleTextFromDropDown() {
        selectByVisibleTextFromDropDown();

    }

    public void clickOnHDD() {
        clickOnElement(clickOnHDDButton);
    }

    public void clickOnOS(){
        clickOnElement(clickOnVistaPremium);
    }

    public void clickONMicrosoftOffice(){
        clickOnElement(clickOnMSSoftware);
    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }

    public String verifyComputerPrice(){
        getElement(verifyPrice);
        return null;
    }









}
