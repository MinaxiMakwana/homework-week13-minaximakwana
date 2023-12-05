package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class TopMenuTest extends BaseTest {

        HomePage homePage = new HomePage();

        public void selectMenu(String menu) {

                //1.1 create method with name "selectMenu" it has one parameter name "menu" of type string
                //1.2 This method should click on the menu whatever name is passed as parameter.
                List<WebElement> allTopMenuLinks = homePage.selectNavigationBar();
                try {
                        for (WebElement link : allTopMenuLinks) {
                                if (link.getText().equals(menu)) {
                                        link.click();
                                }
                        }
                } catch (StaleElementReferenceException e) {
                        allTopMenuLinks = homePage.selectNavigationBar();

                }
        }

        //1.3. create the @Test method name verifyPageNavigation.use selectMenu method to select the Menu and click on it and verify the page navigation.
       public void verifyPageNavigation(){
               ArrayList<String> listOfNavigationLinks=new ArrayList<>();

               listOfNavigationLinks.add("Computers");
               listOfNavigationLinks.add("Electronics");
               listOfNavigationLinks.add("Apparel");
               listOfNavigationLinks.add("Digital downloads");
               listOfNavigationLinks.add("Books");
               listOfNavigationLinks.add("Jewelry");
               listOfNavigationLinks.add("Gift Cards");

               for(String navigationLink: listOfNavigationLinks ) {
                       selectMenu(navigationLink);

                       String actualText = homePage.getPageTitle();
                       Assert.assertEquals(actualText, navigationLink, "The page title is incorrect.");
               }

       }
}
