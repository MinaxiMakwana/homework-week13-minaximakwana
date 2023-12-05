package com.tutorialsninja.demo.testsuit;

import com.tutorialsninja.demo.pages.HomePage;
import com.tutorialsninja.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {

        HomePage homepage = new HomePage();
        HomePage verifyTheTextDesktops = new HomePage();

        HomePage mouseHoverOnLaptopsAndNotebooks = new HomePage();

        @Test
        public void selectMenu(String menu){

        }
        @Test
        public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){

//            1.1 Mouse hover on “Desktops” Tab and click
                homepage.mouseHoverToElementAndClick();

//            1.2 call selectMenu method and pass the menu = “Show All Desktops”
                selectMenu("Show All Desktop");

//            1.3 Verify the text ‘Desktops’
                String expectedText = "Desktops";
                String actualText = getTextFromElement(verifyTheTextDesktops);
                Assert.assertEquals("Not navigate to Desktop page", expectedText, actualText);

        }

        @Test
        public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){

//            2.1 Mouse hover on “Laptops & Notebooks” Tab and click
                homepage.mouseHoverOnLaptopsAndNotebooks();

//            2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
                selectMenu("Show AllLaptops & Notebooks");

//            2.3 Verify the text ‘Laptops & Notebooks’
                HomePage verifyTheTextLaptopsAndNotebooks = new HomePage();
                Assert.assertEquals("Not navigate to Laptops and Notebooks page",
                        "Laptops & Notebooks",
                        getTextFromElement(verifyTheTextLaptopsAndNotebooks);
        }

        @Test
        public void verifyUserShouldNavigateToComponentsPageSuccessfully(){

//            3.1 Mouse hover on “Components” Tab and click
                homepage.mouseHoverOnComponents();

//            3.2 call selectMenu method and pass the menu = “Show All Components”
                selectMenu("Show AllComponents");

//            3.3 Verify the text ‘Components’
                Assert.assertEquals("Not navigate to Laptops and Notebooks page",
                        "Components", getTextFromElement(By.xpath("//h2[contains(text(),'Components')]")));

        }
}
