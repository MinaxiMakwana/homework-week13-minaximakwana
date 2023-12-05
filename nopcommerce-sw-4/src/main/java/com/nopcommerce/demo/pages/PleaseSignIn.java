package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class PleaseSignIn extends Utility {

    By clickOnCheckoutAsGuest = By.xpath("//button[@class='button-1 checkout-as-guest-button']");





    public void checkoutAsGuest(){
        clickOnElement(clickOnCheckoutAsGuest);
    }


}
