package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerTest extends BaseTest {

    DesktopPage desktopPage = new DesktopPage();
    HomePage homePage = new HomePage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ShoppingCart shoppingCart = new ShoppingCart();
    PleaseSignIn pleaseSignIn = new PleaseSignIn();
    Checkout checkout = new Checkout();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){

        HomePage homepage = new HomePage();

//        1.1 Click on Computer Menu.
            homepage.clickOnComputerMenu();

//        1.2 Click on Desktop
            homepage.clickOnDesctopMenu();

//        1.3 Select Sort By position "Name: Z to A"
        List<WebElement> beforeSorting = desktopPage.SortElements();
        ArrayList<String> beforeFilter = new ArrayList<>();
        for ( WebElement i : beforeSorting){
            beforeFilter.add(i.getText());
        }
        Collections.sort(beforeFilter);
        Collections.reverse(beforeFilter);

        //click on Z to A
        System.out.println(beforeFilter);
        desktopPage.clickOnNameDropdown("Name: Z to A");

        //after sorting
        List<WebElement> afterSorting = desktopPage.SortElements();
        ArrayList<String> afterFilter = new ArrayList<>();
        for ( WebElement i : afterSorting){
            afterFilter.add(i.getText());
        }
        System.out.println(afterFilter);

//        1.4 Verify the Product will arrange in Descending order.
         Assert.assertEquals(beforeFilter, afterFilter);

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){

//        2.1 Click on Computer Menu.
            homePage.clickOnComputerMenu();

//        2.2 Click on Desktop
            homePage.clickOnDesctopMenu();

//        2.3 Select Sort By position "Name: A to Z"
        List<WebElement> sortingByAtoZ = desktopPage.SortElements();
        ArrayList<String> sortByAtoZFilter = new ArrayList<>();
        for ( WebElement i : sortingByAtoZ){
            sortByAtoZFilter.add(i.getText());
        }
        Collections.sort(sortByAtoZFilter);

//        2.4 Click on "Add To Cart"
            desktopPage.clickOnElement();

//        2.5 Verify the Text "Build your own computer"
            String expectedText = "Build your own computer";
            String actualText = buildYourOwnComputer.getComputerText();
            Assert.assertEquals(actualText, expectedText, "Not redirected to Login page");

//        2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class //visible text
            buildYourOwnComputer.selectByVisibleTextFromDropDown();

//        2.7.Select "8GB [+$60.00]" using Select class.
            buildYourOwnComputer.selectByVisibleTextFromDropDown();

//        2.8 Select HDD radio "400 GB [+$100.00]"
            buildYourOwnComputer.clickOnHDD();

//        2.9 Select OS radio "Vista Premium [+$60.00]"
            buildYourOwnComputer.clickOnOS();

//        2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
            buildYourOwnComputer.clickONMicrosoftOffice();

//        2.11 Verify the price "$1,475.00"
        String expectedComputerText = "price for this computer is $1,475.00";
        String actualComputerText;
        actualComputerText = buildYourOwnComputer.verifyComputerPrice();
        Assert.assertEquals(actualText, expectedText, "Check again");

//        2.12 Click on "ADD TO CARD" Button.
            buildYourOwnComputer.clickOnAddToCart();

//        2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar After that close the bar clicking on the cross button.


//        2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.


//        2.15 Verify the message "Shopping cart"


//        2.16 Change the Qty to "2" and Click on "Update shopping cart"


//        2.17 Verify the Total"$2,950.00"


//        2.18 click on checkbox “I agree with the terms of service”
            shoppingCart.clickOnTermsOfServices();

//        2.19 Click on “CHECKOUT”
            shoppingCart.clickOnCheckoutButton();

//        2.20 Verify the Text “Welcome, Please Sign In!”


//        2.21Click on “CHECKOUT AS GUEST” Tab
            pleaseSignIn.checkoutAsGuest();

//        2.22 Fill the all mandatory field
            checkout.firstName("abc");
            checkout.lastName("xyz");
            checkout.email("abc@gmail.com");
            checkout.country();
            checkout.city("London");
            checkout.address1("10 downing street");
            checkout.postCode("SW1A 2AB");
            checkout.phoneNumber("12365879237");



//        2.23 Click on “CONTINUE”
            checkout.clickOnContinueButton();

//        2.24 Click on Radio Button “Next Day Air($0.00)”


//        2.25 Click on “CONTINUE”


//        2.26 Select Radio Button “Credit Card”


//        2.27 Select “Master card” From Select credit card dropdown


//        2.28 Fill all the details


//        2.29 Click on “CONTINUE”


//        2.30 Verify “Payment Method” is “Credit Card”


//        2.32 Verify “Shipping Method” is “Next Day Air”


//        2.33 Verify Total is “$2,950.00”


//        2.34 Click on “CONFIRM”


//        2.35 Verify the Text “Thank You”


//        2.36 Verify the message “Your order has been successfully processed!”


//        2.37 Click on “CONTINUE”


//        2.37 Verify the text “Welcome to our store”



    }

}
