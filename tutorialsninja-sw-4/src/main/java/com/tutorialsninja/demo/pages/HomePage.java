package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By mouseHoverOnDesktops = By.linkText("Desktops");

    By verifyTheTextDesktops = By.xpath("//h2[contains(text(),'Desktops')]");
    By mouseHoverOnLaptopsAndNotebooks = By.linkText("Laptops & Notebooks");

    By verifyTheTextLaptopsAndNotebooks = By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");

    By mouseHoverOnComponents = By.linkText("Components");


    public void mouseHoverToElementAndClick() {
        getTextFromElement(mouseHoverOnDesktops);
    }

    public void verifyTheTextDesktops(){
        getTextFromElement(verifyTheTextDesktops);

    }

    private void getTextFromElement(By verifyTheTextDesktops) {

    }

    public void mouseHoverOnLaptopsAndNotebooks() {
    }

    public void setVerifyTheTextLaptopsAndNotebooks(){

    }

    public void mouseHoverOnComponents() {
    }
}
