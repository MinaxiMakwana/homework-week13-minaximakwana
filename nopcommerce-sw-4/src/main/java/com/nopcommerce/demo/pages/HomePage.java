package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    By clickOnComputer = By.xpath("(//a[text() = 'Computers '])[1]");

    By clickOnDesktop = By.xpath("(//div[@class='sub-category-item'])[1]");

    By topMenuElements = By.xpath("//div[@class='header-menu']/ul[@class='top-menu notmobile']/li");

    By pageTitle =By.xpath("//div[@class='page-title']/h1");


    public List<WebElement> getElements(By by){
        return driver.findElements(by);
    }

    public void clickOnComputerMenu(){
        clickOnElement(clickOnComputer);
    }

    public void clickOnDesctopMenu(){
        clickOnElement(clickOnDesktop);
    }


    public List<WebElement> selectNavigationBar() {
        return getElements(topMenuElements);
    }

    public String getPageTitle() {
        return getTextFromElement(pageTitle);
    }
}

