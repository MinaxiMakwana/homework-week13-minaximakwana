package com.softwaretestingboard.magento.resources.testsuite;

import com.softwaretestingboard.magento.pages.LumaHomePage;
import com.softwaretestingboard.magento.pages.WomenJacketsPage;
import com.softwaretestingboard.magento.resources.TestBase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {

    LumaHomePage lumaHomePage = new LumaHomePage();
    WomenJacketsPage womenJacketsPage = new WomenJacketsPage();

    @Test
    public void verifyTheSortByProductNameFilter(){
        //Mouse Hover on Women Menu
        lumaHomePage.mouseHoverOnWomenMenu();
        //Mouse Hover on Tops
        lumaHomePage.mouseHoverOnTops();
        //Click on Jackets
        lumaHomePage.ClickOnJackets();
        //Select Sort By filter “Product Name”
       List<WebElement> listBeforeFilter = womenJacketsPage.getProductList();
        ArrayList<String> productsBeforeFilter = new ArrayList<>();
       for (WebElement e : listBeforeFilter){
         productsBeforeFilter.add(e.getText());
       }
        Collections.sort(productsBeforeFilter);
        womenJacketsPage.sortByProductName("Product Name");

        //Verify the products name display in alphabetical order
        List<WebElement> listAfterFilter = womenJacketsPage.getProductList();
        ArrayList<String> productsAfterFilter = new ArrayList<>();
        for (WebElement i : listAfterFilter){
            productsAfterFilter.add(i.getText());
        }
        Collections.sort(productsAfterFilter);
        womenJacketsPage.afterSortByProduct("Product Name");

        //adding assert statement to compare before and after list
        Assert.assertEquals(listAfterFilter, listBeforeFilter);
    }

    @Test
    public void verifyTheSortByPriceFilter(){

        //Mouse Hover on Women Menu
        lumaHomePage.mouseHoverOnWomenMenu();
        //Mouse Hover on Tops
        lumaHomePage.mouseHoverOnTops();
        //Click on Jackets
        lumaHomePage.ClickOnJackets();
        //Select Sort By filter “Price”
        List<WebElement> beforeSortByPrice = womenJacketsPage.getProductList();
        ArrayList<String> productsBeforeSorting = new ArrayList<>();
        for (WebElement e : beforeSortByPrice){
            productsBeforeSorting.add(e.getText());
        }
        Collections.sort(productsBeforeSorting);
        womenJacketsPage.sortByProductName("Product Price");

        //Verify the products price display in Low to High
        List<WebElement> afterSortingPrice = womenJacketsPage.getProductList();
        ArrayList<String> productsAfterSorting = new ArrayList<>();
        for (WebElement i : afterSortingPrice){
            productsAfterSorting.add(i.getText());
        }
        Collections.sort(productsAfterSorting);
        womenJacketsPage.afterSortByProduct("Product Price");

        //adding assert statement to compare before and after list
        Assert.assertEquals(afterSortingPrice, beforeSortByPrice);

    }

}
