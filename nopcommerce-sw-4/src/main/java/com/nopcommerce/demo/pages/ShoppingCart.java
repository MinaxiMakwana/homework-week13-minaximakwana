package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {

    By clickOnIAgree = By.id("termsofservice");

    By clickOnCheckout = By.id("checkout");





    public void clickOnTermsOfServices(){
        clickOnElement(clickOnIAgree);
    }
    public void clickOnCheckoutButton(){
        clickOnElement(clickOnCheckout);
    }


}
