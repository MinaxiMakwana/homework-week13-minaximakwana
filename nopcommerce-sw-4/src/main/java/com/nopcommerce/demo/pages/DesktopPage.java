package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {

    By beforeSort = By.xpath("//div[@class='details']//h2[@class='product-title']/a");

    By nameDropDown = By.id("products-orderby");

    By addToCartButton = By.xpath("//div[@class='buttons']/button[text()='Add to cart'])[1]");

    public List<WebElement> SortElements(){
       return getElements(beforeSort);
    }

    public void clickOnNameDropdown(String text){
        selectByVisibleTextFromDropDown(nameDropDown, text);
    }


    public void clickOnElement() {
        clickOnElement(addToCartButton);
    }
}
