package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Checkout extends Utility {

    By enterFirstName = By.id("BillingNewAddress_FirstName");

    By enterLastName = By.id("BillingNewAddress_LastName");

    By enterEmail = By.id("BillingNewAddress_Email");

    By selectCountry = By.xpath("//option[@value='193']");

    By enterCity = By.id("BillingNewAddress_City");

    By enterAddress = By.id("BillingNewAddress_Address1");

    By enterPostCode = By.id("BillingNewAddress_ZipPostalCode");

    By enterPhoneNumber = By.id("BillingNewAddress_PhoneNumber");

    By clickOnContinue = By.xpath("//button[@onclick='Billing.save()']");



    public void firstName(String text){
        sendTextToElement(enterFirstName);
    }

    private void sendTextToElement(By enterFirstName) {
    }

    public void lastName(String text){
        sendTextToElement(enterLastName);
    }

    public void email(String text){
        sendTextToElement(enterEmail);
    }
    public void country(){
        sendTextToElement(selectCountry);
    }

    public void city(String text){
        sendTextToElement(enterCity);
    }

    public void address1(String text){
        sendTextToElement(enterAddress);
    }

    public void postCode(String text){
        sendTextToElement(enterPostCode);
    }

    public void phoneNumber(String number){
        sendTextToElement(enterPhoneNumber);
    }

    public void clickOnContinueButton(){
        clickOnElement(clickOnContinue);
    }

}
