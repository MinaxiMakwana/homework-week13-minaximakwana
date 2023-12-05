package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WomenJacketsPage extends Utility {

    By sortProductName = By.xpath("//select[@id='sorter'])[1]");
    By afterSortingValue = By.xpath("//strong[@class='product name product-item-name']//a");

   By jacketList = By.xpath("//strong[@class='product name product-item-name']//a");

   By beforeSortByPrice = By.xpath("//span[@class='price-wrapper ']//span");

   By afterSortByPrice = By.xpath("//span[@class='price-wrapper ']//span");

   By jacketPriceList = By.xpath("//span[@class='price-wrapper ']//span");

    public void sortByProductName(String text){
        selectByVisibleTextFromDropDown(sortProductName,text);
    }

    public void afterSortByProduct(String text){
        selectByVisibleTextFromDropDown(afterSortingValue,text);
    }

    public List<WebElement> getProductList(){
      return driver.findElements(jacketList);
    }

    public void setBeforeSortByPrice(String text){
        selectByVisibleTextFromDropDown(beforeSortByPrice,text);
    }

    public void setAfterSortByPrice (String text){
        selectByVisibleTextFromDropDown(afterSortByPrice,text);
    }

    public List<WebElement> jacketPriceList(){
        return driver.findElements(jacketPriceList);
    }

}
